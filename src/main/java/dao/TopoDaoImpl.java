package dao;

import entity.Topo;
import dao.beans.TopoDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TopoDaoImpl implements TopoDao {

    TopoDaoImpl (DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public TopoDaoImpl() {
    }


    @Override
    public void add(Topo topo) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.topo(\n" +
                    "\ttopo_id, topo_titre, topo_texte, account)\n" +
                    "\tVALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1, topo.getIdentifiant());
            preparedStatement.setString(2,topo.getLocation());
            preparedStatement.setString(3, topo.getResume());
            preparedStatement.setInt(4, topo.getAccountid());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("DELETE FROM public.topo WHERE topo_id ="+id+";");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Topo> read() {
        List<Topo> topos = new ArrayList<Topo>();
        topos = this.extract("SELECT * FROM topo WHERE topo_id <> '0' ORDER BY topo_id;");
        return topos;
    }

    @Override
    public List<Topo> topoSelect(int accountid) {
        List<Topo> topos = new ArrayList<Topo>();
        topos = this.extract("SELECT * FROM topo WHERE account = "+accountid+" AND topo_id <> '0' ORDER BY topo_id;");
        return topos;
    }

    @Override
    public Topo topoSelectbyid(int id) {
        Topo topo;
        topo = this.extract("SELECT * FROM topo WHERE topo_id = "+id+" AND topo_id <> '0' ORDER BY topo_id;").get(0);
        return topo;
    }

    private List<Topo> extract (String request){
        List<Topo> topos = new ArrayList<Topo>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int id = resultat.getInt(1);
                String spot = resultat.getString(2);
                String descript = resultat.getString(3);
                int accountid = resultat.getInt(4);
                Topo topo = new Topo();
                topo.setId(id);
                topo.setLocation(spot);
                topo.setResume(descript);
                topo.setAccountid(accountid);
                //System.out.println(topo.getIdentifiant()+" ; "+topo.getLocation()+" ; "+topo.getResume());
                topos.add(topo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return topos;
    }

    public int lastId(List <Topo> topo){
        int comnb=0;
        for (int i=0; i<=topo.size()-2;i++){
            System.out.println(topo.get(i).getIdentifiant()+" : "+topo.get(i+1).getIdentifiant());
            if (topo.get(i).getIdentifiant()!=topo.get(i+1).getIdentifiant()-1){
                comnb =topo.get(i).getIdentifiant()+1;
            }
        }
        System.out.println(comnb);
        if (comnb==0){
            comnb = topo.get(topo.size()).getIdentifiant();
        }
        return comnb;
    }




}
