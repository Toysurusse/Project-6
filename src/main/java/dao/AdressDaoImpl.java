package dao;

import entity.Account;
import entity.Adress;
import dao.beans.AdressDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement AdressDao to load info from DataBase
 *  @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class AdressDaoImpl implements AdressDao {

    public AdressDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }
    private DaoFactory daoFactory;

    public AdressDaoImpl() {
    }

    @Override
    public void update(Adress adress) {
        insert(adress,"UPDATE public.adresse\n" +
                "\tSET adres_id=?, numero_rue=?, rue=?, code_postal=?, ville=?, code=?, complement_adresse=?, adresse_principale=?\n" +
                "\tWHERE "+adress.getAdressId()+";");
    }

    @Override
    public void add(Adress adress) {
        insert(adress,"INSERT INTO public.adresse(adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale)VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
    }


     public void insert (Adress adress, String request) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement(request);
            preparedStatement.setInt(1, adress.getAdressId());
            preparedStatement.setInt(2, adress.getNbStreet());
            preparedStatement.setString(3, adress.getStreet());
            preparedStatement.setInt(4, adress.getPostalCode());
            preparedStatement.setString(5, adress.getCity());
            preparedStatement.setString(6, adress.getCode());
            preparedStatement.setString(7, adress.getInfoSub());
            preparedStatement.setBoolean(8, adress.getPrincipalAdress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Adress readByAccount(int account) {
        Adress adresss;
        adresss = extract ("SELECT * FROM adresse INNER JOIN compte ON Adres_id = id WHERE id ="+account+";").get(0);
        return adresss;
    }

    @Override
    public List<Adress> read() {
        List<Adress> adresss = new ArrayList<Adress>();
        adresss = extract ("SELECT * FROM adresse INNER JOIN compte ON Adres_id = id;");
        return adresss;
    }

    /**
     * extract account from the database
     * @param request
     * @return List<Adress>
     */

    private List<Adress> extract(String request){
        List<Adress> adresss = new ArrayList<Adress>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {

                int adressId= resultat.getInt(1);
                int nbStreet= resultat.getInt(2);
                String street= resultat.getString(3);
                int postalCode= resultat.getInt(4);
                String city= resultat.getString(5);
                String code= resultat.getString(6);
                String infoSub= resultat.getString(7);
                boolean principalAdress= resultat.getBoolean(8);

                Adress adress = new Adress();
                adress.setAdressId(adressId);
                adress.setNbStreet(nbStreet);
                adress.setStreet(street);
                adress.setPostalCode(postalCode);
                adress.setCity(city);
                adress.setCode(code);
                adress.setInfoSub(infoSub);
                adress.setPrincipalAdress(principalAdress);

                adresss.add(adress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adresss;
    }
}
