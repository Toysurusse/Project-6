package basededonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

    private static Connection connect;

    public static Connection getInstance() {
        if (connect ==null){
            new DaoFactory();
        }
        return connect;
    }

    private DaoFactory() {
        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        try {
            connect = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/PJ6", "postgres",
                    "Toysrusse");

            if (connect != null) {
                System.out.println("You made it, take control your database now!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

    }

    public TopoDAO getTopoDAO(){

        return new TopoDAOImpl;
    }



}
