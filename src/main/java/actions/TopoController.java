package actions;

import beans.Commentaire;
import beans.Site;
import beans.Topo;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.CommentaireDAO;
import dao.list.SiteDAO;
import dao.list.TopoDAO;


import java.util.List;

public class TopoController extends ActionSupport {

    public Integer topoid;
    public Integer siteid;
    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private TopoDAO topoDAO;
    private SiteDAO siteDAO;
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

    public Integer getSiteId() {
        return siteid;
    }
    public void setSiteId(Integer pId) {
        this.siteid = pId;
    }

    private List<Topo> listTopo;
    private List<Site> listSite;
    private List<Commentaire> listCommentaire;
    private Topo topo;

    public List<Topo> getListTopo() {
        return listTopo;
    }
    public List<Site> getListSite() {
        return listSite;
    }
    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }
    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }


    public String doList() {
        this.topoDAO = daoFactory.getTopoDAO();
        listTopo = this.topoDAO.read();
        this.siteDAO = daoFactory.getSiteDAO();
        return ActionSupport.SUCCESS;
    }

    public String dFindTopo() {
        this.topoDAO = daoFactory.getTopoDAO();
        topo = this.topoDAO.topoSelect(topoid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.topoSiteSelect(siteid);
        return ActionSupport.SUCCESS;
    }

    public String doFindSite() {
        System.out.println(siteid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.topoSiteSelect(topoid);
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        listCommentaire=this.commentaireDAO.readWay(topoid);
        return ActionSupport.SUCCESS;
    }


    public String doFindsSiteTopo() {
        System.out.println(siteid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.siteTopoSelect(siteid);
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        listCommentaire=this.commentaireDAO.readTopo(siteid);
        return ActionSupport.SUCCESS;
    }
}
