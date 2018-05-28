package action.menu;

import entity.Commentaire;
import entity.Site;
import entity.Topo;
import resources.dao.DaoFactory;
import resources.dao.beans.CommentaireDao;
import resources.dao.beans.SiteDao;
import resources.dao.beans.TopoDao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class SiteShow {
    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    private SiteDao siteDao;
    public SiteDao getSiteDao() {
        return siteDao;
    }
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    private TopoDao topoDao;
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }
    public TopoDao getTopoDao() {
        return topoDao;
    }

    private CommentaireDao commentaireDao;
    public void setCommentaireDao(CommentaireDao commentaireDao) {
        this.commentaireDao = commentaireDao;
    }
    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }

    private List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    private List<Site> sitelist;
    public List<Site> getSitelist() {
        return sitelist;
    }
    public void setSitelist(List<Site> sitelist) {
        this.sitelist = sitelist;
    }

    private List<Commentaire> commentaireList;
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }
    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public Integer topoid;
    public Integer siteid;
    public Integer getTopoid() {
        return topoid;
    }
    public void setTopoid(Integer topoid) {
        this.topoid = topoid;
    }
    public Integer getSiteid() {
        return siteid;
    }
    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }
    private Commentaire commentaire;

    public String execute() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();
        this.commentaireDao = this.daoFactory.getCommentaireDAO();



        topolist=topoDao.read();
        if (siteid==0){
            sitelist = this.siteDao.topoSiteSelect(topoid);
            commentaireList=this.commentaireDao.readTopo(topoid);
        }else{
            sitelist = this.siteDao.siteTopoSelect(siteid);
            commentaireList=this.commentaireDao.readWay(siteid);
        }
        return "success";
    }

    public String addcom(){
        Date date = new Date();
        this.commentaireDao = daoFactory.getCommentaireDAO();
        commentaire.setComId(this.commentaireDao.lastIDCom(this.commentaireDao.read())+1);
        commentaire.setCreateAt(new Timestamp(date.getTime()));
        commentaire.setPageId(commentaire.getComId());
        this.commentaireDao.add(commentaire);
        return "success";
    }



}
