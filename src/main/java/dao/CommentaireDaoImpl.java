package dao;

import beans.Commentaire;
import dao.list.CommentaireDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentaireDaoImpl implements CommentaireDAO {

    public CommentaireDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }

    private DaoFactory daoFactory;

    public int lastIDCom (List <Commentaire> com){
        int comnb =com.size();
    return comnb;}

    @Override
    public void add(Commentaire commentaire) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();

            preparedStatement = connexion.prepareStatement("INSERT INTO public.commentaires(com_id, compte_id, titre, commentaire)VALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1,  Integer.parseInt(commentaire.getComId()));
            preparedStatement.setInt(2, Integer.parseInt(commentaire.getAccount()));
            preparedStatement.setString(3, commentaire.getTitle());
            preparedStatement.setString(4, commentaire.getCommentary());
            preparedStatement.executeUpdate();

            preparedStatement = connexion.prepareStatement("INSERT INTO public.page_index(page_id, comid, siteid, topoid)VALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1, Integer.parseInt(commentaire.getPageId()));
            preparedStatement.setInt(2, Integer.parseInt(commentaire.getComId()));
            preparedStatement.setInt(3, Integer.parseInt(commentaire.getSiteId()));
            preparedStatement.setInt(4, Integer.parseInt(commentaire.getTopoId()));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Commentaire> read() {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id;");

            while (resultat.next()) {
                String pageId= resultat.getString(1);
                String comId= resultat.getString(2);
                String siteId= resultat.getString(3);
                String topoId= resultat.getString(4);
                String account = resultat.getString(6);
                String title= resultat.getString(7);
                String commentary= resultat.getString(8);

                Commentaire commentaire = new Commentaire();
                commentaire.setAccount(account);
                commentaire.setTitle(title);
                commentaire.setCommentary(commentary);
                commentaire.setComId(comId);
                commentaire.setPageId(pageId);
                commentaire.setSiteId(siteId);
                commentaire.setTopoId(topoId);

                commentaires.add(commentaire);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return commentaires;
    }
}
