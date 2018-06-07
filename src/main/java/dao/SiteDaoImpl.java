package dao;

import entity.Site;
import dao.beans.SiteDao;
import entity.Topo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement Siteao to load info from DataBase
 *  @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class SiteDaoImpl implements SiteDao {

    public SiteDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public SiteDaoImpl() {
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("DELETE FROM public.site_de_grimpe WHERE site_id ="+id+";");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByTopo(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("DELETE FROM public.site_de_grimpe WHERE topo ="+id+";");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List <String> LocationSelect(){
        ArrayList <String> location= new ArrayList<String>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery("SELECT DISTINCT secteur FROM site_de_grimpe WHERE site_id <> '0' ORDER BY secteur;");

            while (resultat.next()) {
                String Resultlocation = resultat.getString(1);
                    location.add(Resultlocation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return location;
    }

    @Override
    public List<Site> siteIDSelect (int accountid) {
        List<Site> sites = new ArrayList<Site>();
        sites = extract("SELECT * FROM site_de_grimpe WHERE accountid = "+accountid+" AND site_id <> '0' ORDER BY site_id;");
        return sites;
    }

    @Override
    public List<Site> siteTopoSelect (int siteid) {
            List<Site> sites = new ArrayList<Site>();
            sites = extract("SELECT * FROM site_de_grimpe WHERE site_id = "+siteid+" AND site_id <> '0' ORDER BY site_id;");
            return sites;
    }

    @Override
    public List<Site> topoSiteSelect(int topoid) {
            List<Site> sites = new ArrayList<Site>();
            sites = extract("SELECT * FROM site_de_grimpe WHERE topo = "+topoid+" AND site_id <> '0' ORDER BY site_id;");
            return sites;
    }

    public List <Site> siteSelectByString(String location){
        List<Site> sites = new ArrayList<Site>();
        sites = extract("SELECT * FROM site_de_grimpe WHERE secteur = '"+location+"' AND site_id <> '0' ORDER BY site_id;");
        return sites;}

    @Override
    public List<Site> read() {
        List<Site> sites = new ArrayList<Site>();
        sites = extract("SELECT * FROM site_de_grimpe WHERE site_id <> '0' ORDER BY site_id;");
        return sites;
    }

    @Override
    public void add(Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.site_de_grimpe(site_id, secteur, voie, hauteur, cotation, nb_points, topo,accountid)VALUES (?, ?, ?, ?, ?, ?, ?,?);");
            preparedStatement.setInt(1, site.getIdentifiant());
            preparedStatement.setString(2, site.getLocation());
            preparedStatement.setString(3, site.getWay());
            preparedStatement.setString(4, site.getHeight());
            preparedStatement.setString(5, site.getHardness());
            preparedStatement.setString(6, site.getPoints_nb());
            preparedStatement.setInt(7, site.getTopos());
            preparedStatement.setInt(8, site.getAccountid());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Site site) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            System.out.println(site.getIdentifiant());
            preparedStatement = connexion.prepareStatement("UPDATE public.site_de_grimpe\n" +
                    "\tSET site_id=?, secteur=?, voie=?, hauteur=?, cotation=?, nb_points=?, topo=?, accountid=?\n" +
                    "\tWHERE site_id="+site.getIdentifiant()+";");
            preparedStatement.setInt(1, site.getIdentifiant());
            preparedStatement.setString(2, site.getLocation());
            preparedStatement.setString(3, site.getWay());
            preparedStatement.setString(4, site.getHeight());
            preparedStatement.setString(5, site.getHardness());
            preparedStatement.setString(6, site.getPoints_nb());
            preparedStatement.setInt(7, site.getTopos());
            preparedStatement.setInt(8, site.getAccountid());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * extract Site from the database
     * @param request
     * @return List<Site>
     */
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
                //System.out.println(id);
                sites.add(site);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sites;
    }

    public int lastID (List <Site> site){
        int comnb=0;
        for (int i=0; i<=site.size()-2;i++){
            //System.out.println(site.get(i).getIdentifiant());
            if (site.get(i).getIdentifiant()==site.get(i+1).getIdentifiant()-1){
                comnb =site.get(i).getIdentifiant()+1;
            }
        }
        if (comnb==0){
            comnb = site.get(site.size()).getIdentifiant();
        }
        return comnb;
    }

}
