package dao;

import dao.beans.RentDao;
import entity.RentTopo;
import entity.RentTopo;
import entity.Topo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RentDaoImpl implements RentDao {

    RentDaoImpl (DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public RentDaoImpl() {
    }

    @Override
    public void add(RentTopo rentTopo) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.pret_de_topo(\n" +
                    "\tcompte_id, topo_id, statut_topo, topo_title, topo_resume)\n" +
                    "\tVALUES (?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, rentTopo.getCompte_id());
            preparedStatement.setInt(2, rentTopo.getTopo_id());
            preparedStatement.setBoolean(3, rentTopo.getStatut());
            preparedStatement.setString(4, rentTopo.getTitle());
            preparedStatement.setString(5, rentTopo.getResume());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RentTopo> read() {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        rentTopos=extract("SELECT topo_pret_id, compte_id, topo_id, statut_topo, topo_title, topo_resume\n" +
                "\tFROM public.pret_de_topo;");
        return rentTopos;
    }

    @Override
    public List<RentTopo> topoSelectbyid(int accountid) {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        rentTopos=extract("SELECT topo_pret_id, compte_id, topo_id, statut_topo, topo_title, topo_resume\n" +
                "\tFROM public.pret_de_topo WHERE compte_id ="+accountid+";");
        return rentTopos;
    }

    @Override
    public void delete(int id) {
        del("DELETE FROM public.pret_de_topo\n" +
                "\tWHERE topo_pret_id = "+id+";");
    }

    @Override
    public void deleteByCompte(int id) {
        del("DELETE FROM public.pret_de_topo\n" +
                "\tWHERE compte_id = "+id+";");
    }

    public void del(String request) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement(request);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private List<RentTopo> extract(String request) {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {

                int id = resultat.getInt(1);
                int account = resultat.getInt(2);
                int topo = resultat.getInt(3);
                boolean statut = resultat.getBoolean(4);
                String title = resultat.getString(5);
                String resume = resultat.getString(6);

                RentTopo rentTopo = new RentTopo();
                rentTopo.setId(id);
                rentTopo.setCompte_id(account);
                rentTopo.setTopo_id(topo);
                rentTopo.setStatut(statut);
                rentTopo.setTitle(title);
                rentTopo.setResume(resume);
                rentTopos.add(rentTopo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTopos;
    }
    
    
}
