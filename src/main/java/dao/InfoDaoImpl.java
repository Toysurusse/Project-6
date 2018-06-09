package dao;

import dao.beans.InfoDao;
import entity.Information;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement InfoDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class InfoDaoImpl implements InfoDao {
    private DaoFactory daoFactory;

    public InfoDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public InfoDaoImpl() {
    }

    public int lastIDInfo(List<Information> info) {
        int infonb = 0;
            infonb = info.get(info.size() -1).getId()+2;
        return infonb;
    }

    @Override
    public List<Information> read() {
        List<Information> informations = new ArrayList<Information>();
        informations = extract("SELECT * FROM public.information ORDER BY info_id;");
        return informations;
    }

    @Override
    public List<Information> selectByAccountId(int accountid) {
        List<Information> informations = new ArrayList<Information>();
        informations = extract("SELECT * FROM public.information Where account="+accountid+" ORDER BY info_id;");
        return informations;
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("DELETE FROM information WHERE info_id = " + id + ";");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Information information) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.information(info_id, info_titre, info_texte, account)VALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1, information.getId());
            preparedStatement.setString(2, information.getTitle());
            preparedStatement.setString(3, information.getInfo());
            preparedStatement.setInt(4, information.getAccount());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * extract information from the database
     *
     * @param request
     * @return List<Information>
     */
    private List<Information> extract(String request) {
        List<Information> informations = new ArrayList<Information>();
        Statement statement;
        ResultSet resultat;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int id = resultat.getInt(1);
                String title = resultat.getString(2);
                String info = resultat.getString(3);
                int account = resultat.getInt(4);

                Information information = new Information();
                information.setId(id);
                information.setTitle(title);
                information.setInfo(info);
                information.setAccount(account);

                informations.add(information);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return informations;
    }
}
