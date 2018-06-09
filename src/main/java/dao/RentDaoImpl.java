package dao;

import dao.beans.RentDao;
import entity.RentTopo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Implement RentDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class RentDaoImpl implements RentDao {

    private DaoFactory daoFactory;

    RentDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public RentDaoImpl() {
    }

    @Override
    public void add(RentTopo rentTopo) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        System.out.println(rentTopo.getDate());
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.pret_de_topo(\n" +
                    "\tcompte_id, topo_id, statut_topo, rentdate, topotitle)\n" +
                    "\tVALUES (?, ?, ?, ? ,?);");
            preparedStatement.setInt(1, rentTopo.getCompte_id());
            preparedStatement.setInt(2, rentTopo.getTopo_id());
            preparedStatement.setBoolean(3, rentTopo.getStatut());
            preparedStatement.setDate(4, (java.sql.Date) rentTopo.getDate());
            preparedStatement.setString(5, rentTopo.getTitleTopo());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RentTopo> read() {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        rentTopos = extract("SELECT *\n" +
                "\tFROM public.pret_de_topo order by rentdate;");
        return rentTopos;
    }


    @Override
    public List<RentTopo> topoSelectbyid(int accountid) {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        rentTopos = extract("SELECT *\n" +
                "\tFROM public.pret_de_topo WHERE compte_id =" + accountid + ";");
        return rentTopos;
    }

    @Override
    public void delete(int id) {
        del("DELETE FROM public.pret_de_topo\n" +
                "\tWHERE topo_pret_id = " + id + ";");
    }

    @Override
    public void deleteByCompte(int id) {
        del("DELETE FROM public.pret_de_topo\n" +
                "\tWHERE compte_id = " + id + ";");
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

    /**
     * extract RentTopo from the database
     *
     * @param request
     * @return List<RentTopo>
     */
    private List<RentTopo> extract(String request) {
        List<RentTopo> rentTopos = new ArrayList<RentTopo>();
        Statement statement;
        ResultSet resultat;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int id = resultat.getInt(1);
                int account = resultat.getInt(2);
                int topo = resultat.getInt(3);
                boolean statut = resultat.getBoolean(4);
                java.sql.Date date = resultat.getDate(6);
                String title =resultat.getString(5);
                System.out.println(date);
                RentTopo rentTopo = new RentTopo();
                rentTopo.setId(id);
                rentTopo.setCompte_id(account);
                rentTopo.setTopo_id(topo);
                rentTopo.setStatut(statut);
                rentTopo.setDate(date);
                rentTopo.setTitleTopo(title);

                rentTopos.add(rentTopo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTopos;
    }


}
