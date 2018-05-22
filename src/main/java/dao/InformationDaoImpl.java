package dao;

import beans.Commentaire;
import beans.Information;
import dao.list.CommentaireDAO;
import dao.list.InfoDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InformationDaoImpl implements InfoDAO {
    public InformationDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }
    private DaoFactory daoFactory;

    public int lastIDInfo (List <Information> info){
        int infonb=0;

        for (int i=0; i<=info.size()-2;i++){
            System.out.println(info.get(i).getId()+" ; "+info.get(i+1).getId());
            if (info.get(i).getId()==info.get(i+1).getId()-1){
                infonb =info.get(i).getId()+1;
            }
            }
        if (infonb==0){
            infonb = info.get(info.size()-1).getId();
        }
    return infonb;
    }

    @Override
    public List<Information> read() {
        List<Information> informations = new ArrayList<Information>();
        informations = extract("SELECT * FROM public.information ORDER BY info_id;");
        return informations;
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("DELETE FROM information WHERE info_id = "+id+";");
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
            connexion = daoFactory.getConnection();
            preparedStatement = connexion.prepareStatement("INSERT INTO public.information(info_id, info_titre, info_texte)VALUES (?, ?, ?);");
            preparedStatement.setInt(1,  information.getId());
            preparedStatement.setString(2, information.getTitle());
            preparedStatement.setString(3, information.getInfo());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private List<Information> extract(String request){
        List<Information> informations = new ArrayList<Information>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int id= resultat.getInt(1);
                String title= resultat.getString(2);
                String info= resultat.getString(3);

                Information information = new Information();
                information.setId(id);
                information.setTitle(title);
                information.setInfo(info);

                System.out.println(id+title+info);
                informations.add(information);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return informations;
    }
}
