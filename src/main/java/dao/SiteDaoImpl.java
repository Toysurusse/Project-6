package dao;

import beans.Site;
import dao.list.SiteDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SiteDaoImpl implements SiteDAO {

    public SiteDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    @Override
    public void add(Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.site_de_grimpe(site_id, secteur, voie, hauteur, cotation, nb_points, topo)VALUES (?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, site.getId());
            preparedStatement.setString(2, site.getLocation());
            preparedStatement.setString(3, site.getWay());
            preparedStatement.setString(4, site.getHeight());
            preparedStatement.setString(5, site.getHardness());
            preparedStatement.setString(6, site.getPoints_nb());
            preparedStatement.setInt(7, site.getTopos());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Site> siteSelect (int topoid) {
        List<Site> sites = new ArrayList<Site>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM site_de_grimpe WHERE topo = "+topoid+";");

            while (resultat.next()) {
                String id= resultat.getString(1);
                String location= resultat.getString(2);
                String way= resultat.getString(3);
                String height= resultat.getString(4);
                String hardness= resultat.getString(5);
                String points_nb= resultat.getString(6);
                int topos= resultat.getInt(7);

                Site site = new Site();
                site.setId(id);
                site.setLocation(location);
                site.setWay(way);
                site.setHeight(height);
                site.setHardness(hardness);
                site.setPoints_nb(points_nb);
                site.setTopos(topos);
                sites.add(site);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sites;
    }


    @Override
    public List<Site> read() {
        List<Site> sites = new ArrayList<Site>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM site_de_grimpe;");

            while (resultat.next()) {

                String id= resultat.getString(1);
                String location= resultat.getString(2);
                String way= resultat.getString(3);
                String height= resultat.getString(4);
                String hardness= resultat.getString(5);
                String points_nb= resultat.getString(6);
                int topos= resultat.getInt(7);

                Site site = new Site();
                site.setId(id);
                site.setLocation(location);
                site.setWay(way);
                site.setHeight(height);
                site.setHardness(hardness);
                site.setPoints_nb(points_nb);
                site.setTopos(topos);

                sites.add(site);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sites;
    }
}
