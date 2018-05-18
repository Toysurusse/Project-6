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
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id ;");
        return commentaires;
    }

    @Override
    public List<Commentaire> readTopo(int id) {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id WHERE topoid ="+id+" AND siteid=0;");
        return commentaires;
    }

    @Override
    public List<Commentaire> readWay(int id) {
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        commentaires = extract("SELECT * FROM page_index INNER JOIN commentaires ON comid = com_id WHERE siteid ="+id+";");
        return commentaires;
    }

    @Override
    public void delete(int id) {
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        try {
            connexion = daoFactory.getConnection();
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
            connexion = daoFactory.getConnection();

            preparedStatement = connexion.prepareStatement("INSERT INTO public.commentaires(com_id, compte_id, titre, commentaire)VALUES (?, ?, ?, ?);");
            preparedStatement.setInt(1,  commentaire.getComId());
            preparedStatement.setInt(2, commentaire.getAccount());
            preparedStatement.setString(3, commentaire.getTitle());
            preparedStatement.setString(4, commentaire.getCommentary());
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


    private List<Commentaire> extract(String request){
        List<Commentaire> commentaires = new ArrayList<Commentaire>();
        Statement statement =null ;
        ResultSet resultat =null ;
        Connection connexion =null;

        try {
            connexion =daoFactory.getConnection();
            statement=connexion.createStatement();
            resultat = statement.executeQuery(request);

            while (resultat.next()) {
                int pageId= resultat.getInt(1);
                int comId= resultat.getInt(2);
                int siteId= resultat.getInt(3);
                int topoId= resultat.getInt(4);
                int account = resultat.getInt(6);
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
