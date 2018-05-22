package dao;

import dao.CommentaireDaoImpl;
import dao.TopoDaoImpl;
import dao.list.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {
    private String url;
    private String username;
    private String password;

    public Connection connect;

    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DaoFactory getInstance() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        DaoFactory instance = new DaoFactory(
                "jdbc:postgresql://localhost:5432/PJ6", "postgres", "Toysrusse");
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public SiteDAO getSiteDAO(){
        return new SiteDaoImpl(this);
    }
    public TopoDAO getTopoDAO(){
        return new TopoDaoImpl(this);
    }
    public CommentaireDAO getCommentaireDAO() {
        return new CommentaireDaoImpl(this);
    }
    public AccountDAO getAccountDAO(){
        return new AccountDaoImpl(this);
    }
    public AddressDAO getAdressDAO(){
        return new AdressDaoImpl(this);
    }
    public InfoDAO getInfoDAO () {
        return new InformationDaoImpl(this);
    }
}
