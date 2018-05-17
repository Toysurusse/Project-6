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

    TopoDaoImpl (DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    @Override
    public void add(Topo topo) {

    }

    @Override
    public List<Topo> read() {
        List<Topo> topos = new ArrayList<Topo>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {

            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM topo WHERE topo_id <> '0';");

            while (resultat.next()) {
                int id = resultat.getInt(1);
                String spot = resultat.getString(2);
                String descript = resultat.getString(3);

                Topo topo = new Topo();
                topo.setId(id);
                topo.setLocation(spot);
                topo.setResume(descript);
                topos.add(topo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return topos;
    }

    @Override
    public Topo topoSelect(int topoid) {
        Topo topo = new Topo();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM topo WHERE topo_id = "+topoid+" WHERE topo_id <> '0';");

            while (resultat.next()) {
                int id = resultat.getInt(1);
                String spot = resultat.getString(2);
                String descript = resultat.getString(3);

                topo.setId(id);
                topo.setLocation(spot);
                topo.setResume(descript);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return topo;
    }
}
