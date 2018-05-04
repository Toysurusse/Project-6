package dao;

import beans.Topo;
import dao.list.TopoDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TopoDaoImpl implements TopoDAO {

    private DaoFactory daoFactory;

    TopoDaoImpl (DaoFactory daoFactory){
        this.daoFactory=daoFactory;
    }

    @Override
    public void ajouter(Topo topo) {

    }

    @Override
    public List<Topo> lister() {
        List<Topo> topos = new ArrayList<Topo>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {

            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM topo;");

            while (resultat.next()) {
                String id = resultat.getString(1);
                String spot = resultat.getString(2);
                String descript = resultat.getString(3);

                Topo topo = new Topo();
                topo.setId(id);
                topo.setLocation(spot);
                topo.setResume(descript);

                System.out.println(topo.getID()+" ; "+topo.getLocation()+" ; "+topo.getResume());

                topos.add(topo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return topos;
    }
}
