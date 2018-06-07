package dao;

import dao.beans.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Dao factory to organize relation between DataBase and server
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class DaoFactory {
    /**
     * String to register the url of DataBaseConnection
     */
    private String url;

    /**
     * String to register the username of DataBaseConnection
     */
    private String username;


    /**
     * String to register the password of DataBaseConnection
     */
    private String password;

    /**
     * Statement to get statement from the DataBaseConnection
     */
    private Statement statement;

    /**
     * Connection to get connection from the DataBaseConnection
     */
    private Connection connexion;

    /**
     * DaoFactory
     *
     * @param url
     * @param password
     * @param username
     */
    DaoFactory(String url, String username, String password) {
    }

    /**
     * Get Instance from Dao to connect to the database
     * return Connection
     */
    public Connection getInstance() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }
        url = "jdbc:postgresql://localhost:5432/PJ6";
        username = "postgres";
        password = "Toysrusse";
        try {
            connexion = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connexion;
    }

    /**
     * Get statement from Dao to connect to the database
     * return Connection
     */
    public Statement getStatement() throws SQLException {
        statement = getInstance().createStatement();
        return statement;
    }

    /**
     * Get SiteDao
     * return implentation Dao
     */
    public SiteDao getSiteDAO() {
        return new SiteDaoImpl(this);
    }

    /**
     * Get TopoDao
     * return implentation Dao
     */
    public TopoDao getTopoDAO() {
        return new TopoDaoImpl(this);
    }

    /**
     * Get CommentaireDao
     * return implentation Dao
     */
    public CommentaireDao getCommentaireDAO() {
        return new CommentaireDaoImpl(this);
    }

    /**
     * Get AccountDao
     * return implentation Dao
     */
    public AccountDao getAccountDAO() {
        return new AccountDaoImpl(this);
    }


    /**
     * Get AdressDao
     * return implentation Dao
     */
    public AdressDao getAdressDAO() {
        return new AdressDaoImpl(this);
    }

    /**
     * Get RentDao
     * return implentation Dao
     */
    public RentDao getRentDAO() {
        return new RentDaoImpl(this);
    }

    /**
     * Get InfoDao
     * return implentation Dao
     */
    public InfoDao getInfoDAO() {
        return new InfoDaoImpl(this);
    }
}

