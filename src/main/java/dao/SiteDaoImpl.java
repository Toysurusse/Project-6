package dao;

import entity.Site;
import dao.beans.SiteDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SiteDaoImpl implements SiteDao {

    public SiteDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public SiteDaoImpl() {
    }

    @Override
    public void delete(Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("DELETE FROM public.site WHERE site_id ="+site.getIdentifiant()+";");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Site> siteTopoSelect (int siteid) {
            List<Site> sites = new ArrayList<Site>();
            sites = extract("SELECT * FROM site_de_grimpe WHERE site_id = "+siteid+" AND site_id <> '0';");
            return sites;
    }

    @Override
    public List<Site> topoSiteSelect(int topoid) {
            List<Site> sites = new ArrayList<Site>();
            sites = extract("SELECT * FROM site_de_grimpe WHERE topo = "+topoid+" AND site_id <> '0';");
            return sites;
    }


    @Override
    public List<Site> read() {
        List<Site> sites = new ArrayList<Site>();
        sites = extract("SELECT * FROM site_de_grimpe WHERE site_id <> '0';");
        return sites;
    }

    @Override
    public void add(Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.site_de_grimpe(site_id, secteur, voie, hauteur, cotation, nb_points, topo)VALUES (?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setInt(1, site.getIdentifiant());
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

    private List<Site> extract(String request) {
        List<Site> sites = new ArrayList<Site>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {

                int id = resultat.getInt(1);
                String location = resultat.getString(2);
                String way = resultat.getString(3);
                String height = resultat.getString(4);
                String hardness = resultat.getString(5);
                String points_nb = resultat.getString(6);
                int topos = resultat.getInt(7);

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
