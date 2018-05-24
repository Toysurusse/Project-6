package actions;

import beans.Commentaire;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.CommentaireDAO;
import dao.list.SiteDAO;
import dao.list.TopoDAO;

import java.sql.Timestamp;
import java.util.Date;

public class CommentaireController extends ActionSupport {

    public Integer topoid;
    public Integer siteid;
    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private CommentaireDAO commentaireDAO;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopoid() {
        return topoid;
    }
    public void setTopoid(Integer pId) {
        topoid = pId;
    }

    public Integer getSiteid() {
        return siteid;
    }
    public void setSiteId(Integer pId) {
        this.siteid = pId;
    }

    private String title;
    private String commentary;
    private int accountID;

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

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public int getAccountID() {
        return accountID;
    }

    public String addcom() {
        Date date = new Date();
        this.commentaireDAO = daoFactory.getCommentaireDAO();
        commentaire.setComId(this.commentaireDAO.lastIDCom(this.commentaireDAO.read())+1);
        commentaire.setCreateAt(new Timestamp(date.getTime()));
        commentaire.setPageId(commentaire.getComId());
        this.commentaireDAO.add(commentaire);
        return ActionSupport.SUCCESS;
    }

    public String deletecom() {
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.commentaireDAO.deleteTime(id);
        return ActionSupport.SUCCESS;
    }

    public String deleteadmincom() {
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.commentaireDAO.delete(id);
        return ActionSupport.SUCCESS;
    }
}
