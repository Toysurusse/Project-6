package dao;

import dao.beans.CommentaireDao;
import entity.Commentaire;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Implement CommentaireDao to load info from DataBase
 *  @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class CommentaireDaoImpl implements CommentaireDao {
    public CommentaireDaoImpl(DaoFactory daoFactory){
        this.daoFactory =daoFactory;
    }
    private DaoFactory daoFactory;

    public CommentaireDaoImpl() {
    }

    public int lastIDCom (List <Commentaire> com){
        int comnb=0;
        for (int i=0; i<=com.size()-2;i++){
            if (com.get(i).getComId()==com.get(i+1).getComId()-1){
                comnb =com.get(i).getComId()+1;
            }
            }
        if (comnb==0){
            comnb = com.get(com.size()-1).getComId();
        }
    return comnb;
    }

    @Override
    public List<Commentaire> read() {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id ORDER BY comid;");
        return commentaires;
    }

    @Override
    public List<Commentaire> readTopo(int id) {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id WHERE topoid ="+id+" AND siteid=0 AND deleteat IS NULL  ORDER BY comid;");
        return commentaires;
    }

    @Override
    public List<Commentaire> readWay(int id) {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id WHERE siteid ="+id+" AND deleteat IS NULL ORDER BY comid;");
        return commentaires;
    }

    @Override
    public List<Commentaire> readCompteId(int id) {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id WHERE compte_id = "+id+" ORDER BY comid;");
        return commentaires;
    }

    @Override
    public void deleteTime(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        Date date = new Date();
        Timestamp heure = new Timestamp(date.getTime());
        try {
            connexion = daoFactory.getInstance();
            preparedStatement = connexion.prepareStatement("UPDATE commentaires SET deleteat = CURRENT_TIMESTAMP WHERE com_id = "+id+";");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();

            preparedStatement = connexion.prepareStatement("DELETE FROM page_index WHERE comid = "+id+";");
            preparedStatement.executeUpdate();
            preparedStatement = connexion.prepareStatement("DELETE FROM commentaires WHERE com_id = "+id+";");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Commentaire commentaire) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getInstance();

            preparedStatement = connexion.prepareStatement("INSERT INTO public.commentaires(com_id, compte_id, titre, commentaire, createat)VALUES (?, ?, ?, ? ,?);");
            preparedStatement.setInt(1,  commentaire.getComId());
            preparedStatement.setInt(2, commentaire.getAccount());
            preparedStatement.setString(3, commentaire.getTitle());
            preparedStatement.setString(4, commentaire.getCommentary());
            preparedStatement.setTimestamp(5, commentaire.getCreateAt());
            preparedStatement.executeUpdate();

            preparedStatement = connexion.prepareStatement("INSERT INTO public.page_index(page_id, comid, siteid, topoid)VALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1, commentaire.getPageId());
            preparedStatement.setInt(2, commentaire.getComId());
            preparedStatement.setInt(3, commentaire.getSiteId());
            preparedStatement.setInt(4, commentaire.getTopoId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * extract Commentaire from the database
     *
     * @param request
     * @return List<Commentaire>
     */
    private List<Commentaire> extract(String request){
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        Statement statement ;
        ResultSet resultat ;

        try {
            statement = daoFactory.getStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int pageId= resultat.getInt(1);
                int comId= resultat.getInt(2);
                int siteId= resultat.getInt(3);
                int topoId= resultat.getInt(4);
                int account = resultat.getInt(6);
                String title= resultat.getString(7);
                String commentary= resultat.getString(8);
                Timestamp createAt= resultat.getTimestamp(9);

                Commentaire commentaire = new Commentaire();
                commentaire.setAccount(account);
                commentaire.setTitle(title);
                commentaire.setCommentary(commentary);
                commentaire.setComId(comId);
                commentaire.setPageId(pageId);
                commentaire.setSiteId(siteId);
                commentaire.setTopoId(topoId);
                commentaire.setCreateAt(createAt);
                commentaires.add(commentaire);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return commentaires;
    }
}
