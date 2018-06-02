package dao;

import dao.beans.*;

import java.sql.*;

public class DaoFactory {
        private String url;
        private String username;
        private String password;
        private Statement statement;
        PreparedStatement preparedStatement;
        private Connection connexion;

        private ResultSet resultat ;

        DaoFactory(String url, String username, String password) {
        }

        public Connection getInstance() {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
            }
            url = "jdbc:postgresql://localhost:5432/PJ6";
            username = "postgres";
            password = "Toysrusse";
            try {
                connexion =DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return connexion;
        }

        public Statement getStatement() throws SQLException {
            statement = getInstance().createStatement();
            return statement;
        }

        public SiteDao getSiteDAO(){
            return new SiteDaoImpl(this);
        }
        public TopoDao getTopoDAO(){
            return new TopoDaoImpl(this);
        }
        public CommentaireDao getCommentaireDAO() {
            return new CommentaireDaoImpl(this);
        }
        public AccountDao getAccountDAO(){
            return new AccountDaoImpl(this);
        }
        public AdressDao getAdressDAO(){
            return new AdressDaoImpl(this);
        }
        public RentDao getRentDAO(){
        return new RentDaoImpl(this);
    }
        /*public InfoDAO getInfoDAO () {
            return new InformationDaoImpl(this);
        }*/
    }

