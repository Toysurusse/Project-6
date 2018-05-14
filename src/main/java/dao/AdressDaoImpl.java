package dao;

import beans.Account;
import beans.Adress;
import beans.Commentaire;
import dao.list.AddressDAO;
import dao.list.CommentaireDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdressDaoImpl implements AddressDAO {

    public AdressDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    @Override
    public void add(Adress adress) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.adresse(adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale)VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
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
    public List<Adress> read() {
        List<Adress> adresss = new ArrayList<Adress>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM page_index INNER JOIN Adresss ON comid = com_id;");

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
