package action.menu;

import dao.DaoFactory;
import dao.beans.AccountDao;
import dao.beans.CommentaireDao;
import dao.beans.SiteDao;
import dao.beans.TopoDao;
import entity.Account;
import entity.Commentaire;
import entity.Site;
import entity.Topo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class SiteShow {
    public Integer topoid;
    public Integer siteid;
    public int id;
    public Topo topo;
    private DaoFactory daoFactory;
    private SiteDao siteDao;
    private TopoDao topoDao;
    private CommentaireDao commentaireDao;
    private AccountDao accountDAO;
    private List<Topo> topolist;
    private List<Site> sitelist;
    private String location;
    private Site site;
    private List<Commentaire> commentaireList;
    private Commentaire commentaire;
    private Account account;
    private HashMap<Commentaire, Account> hashMap = new HashMap<>();

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public SiteDao getSiteDao() {
        return siteDao;
    }

    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    public TopoDao getTopoDao() {
        return topoDao;
    }

    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }

    public void setCommentaireDao(CommentaireDao commentaireDao) {
        this.commentaireDao = commentaireDao;
    }

    public AccountDao getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
    }

    public List<Topo> getTopolist() {
        return topolist;
    }

    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    public List<Site> getSitelist() {
        return sitelist;
    }

    public void setSitelist(List<Site> sitelist) {
        this.sitelist = sitelist;
    }

    public String getLocationlist() {
        return location;
    }

    public void setLocationlist(String location) {
        this.location = location;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public String execute() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();
        this.commentaireDao = this.daoFactory.getCommentaireDAO();
        this.accountDAO = this.daoFactory.getAccountDAO();
        hashMap.clear();
        topolist = topoDao.read();
        if (siteid == 0) {
            sitelist = this.siteDao.topoSiteSelect(topoid);
            commentaireList = this.commentaireDao.readTopo(topoid);
            for (int i = 0; i < commentaireList.size(); i++) {
                hashMap.put(commentaireList.get(i), this.accountDAO.findAccount(commentaireList.get(i).getAccount()));
            }
        } else {
            sitelist = this.siteDao.siteTopoSelect(siteid);
            commentaireList = this.commentaireDao.readWay(siteid);
            for (int i = 0; i < commentaireList.size(); i++) {
                hashMap.put(commentaireList.get(i), this.accountDAO.findAccount(commentaireList.get(i).getAccount()));
            }
        }
        return "success";
    }

    public String listeSiteByLocation() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.commentaireDao = this.daoFactory.getCommentaireDAO();
        this.accountDAO = this.daoFactory.getAccountDAO();
        hashMap.clear();
        sitelist = this.siteDao.siteSelectByString(location);

        /*commentaireList = this.commentaireDao.readWay(siteid);
        for (int i = 0; i < commentaireList.size(); i++) {
            hashMap.put(commentaireList.get(i), this.accountDAO.findAccount(commentaireList.get(i).getAccount()));
        }*/

        return "success";
    }

    public String addcom() {
        Date date = new Date();
        this.commentaireDao = daoFactory.getCommentaireDAO();
        commentaire.setComId(this.commentaireDao.lastIDCom(this.commentaireDao.read()) + 1);
        commentaire.setCreateAt(new Timestamp(date.getTime()));
        commentaire.setPageId(commentaire.getComId());
        this.commentaireDao.add(commentaire);
        commentaire=null;
        return "success";
    }

    public String deletecom() {
        this.commentaireDao = daoFactory.getCommentaireDAO();
        this.commentaireDao.deleteTime(id);
        return "success";
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
