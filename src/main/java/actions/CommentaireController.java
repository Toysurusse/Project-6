package actions;

import beans.Commentaire;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.CommentaireDAO;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class CommentaireController extends ActionSupport {

    private DaoFactory daoFactory = DaoFactory.getInstance();
    private CommentaireDAO commentaireDAO;


    private String title;
    private String commentary;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCommentary() {
        return commentary;
    }
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    private Commentaire commentaire;
    public Commentaire getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String addcom() {

        commentaire.setCommentary(commentary);
        commentaire.setTitle(title);
        commentaire.setAccount("1");
        /*commentaire.setSiteId();
        commentaire.setComId();
        commentaire.setPageId();
        commentaire.setTopoId();*/

        this.commentaireDAO = daoFactory.getCommentaireDAO();
        this.commentaireDAO.add(commentaire);
        return ActionSupport.SUCCESS;
    }

    public String deletecom() {
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.commentaireDAO.delete(id);
        return ActionSupport.SUCCESS;
    }

}
