package dao;

import beans.Commentaire;
import dao.list.CommentaireDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CommentaireDaoImpl implements CommentaireDAO {

    private DaoFactory daoFactory;

    public CommentaireDaoImpl(DaoFactory daoFactory){
        this.daoFactory=daoFactory;
    }

    @Override
    public void ajouter(Commentaire commentaire) {

    }

    @Override
    public List<Commentaire> lister() {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {

            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id;");

            while (resultat.next()) {
                String account = resultat.getString(6);
                String title= resultat.getString(7);
                String commentary= resultat.getString(8);
                String comId= resultat.getString(2);
                String pageId= resultat.getString(1);
                String siteId= resultat.getString(3);
                String topoId= resultat.getString(4);

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
