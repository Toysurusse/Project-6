package action.menu;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.Commentaire;
import entity.Site;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.AccountDao;
import dao.beans.CommentaireDao;
import dao.beans.SiteDao;
import dao.beans.TopoDao;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    private AccountDao accountDAO;
    public AccountDao getAccountDAO() {
        return accountDAO;
    }
    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
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

    private Site site;
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
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
    public int id;
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
    private Commentaire commentaire;

    private Account account;
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    private HashMap<Commentaire, Account> hashMap= new HashMap<>();
    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
    }

    public Topo topo;
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
        topolist=topoDao.read();
        if (siteid==0){
            sitelist = this.siteDao.topoSiteSelect(topoid);
            commentaireList=this.commentaireDao.readTopo(topoid);
            for (int i =0; i<commentaireList.size();i++){
                hashMap.put(commentaireList.get(i),this.accountDAO.findAccount (commentaireList.get(i).getAccount()));
            }
        }
        else{
            sitelist = this.siteDao.siteTopoSelect(siteid);
            commentaireList=this.commentaireDao.readWay(siteid);
            for (int i =0; i<commentaireList.size();i++){
                hashMap.put(commentaireList.get(i),this.accountDAO.findAccount (commentaireList.get(i).getAccount()));
            }
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

    public String deletecom() {
        this.commentaireDao=daoFactory.getCommentaireDAO();
        this.commentaireDao.deleteTime(id);
        return "success";
    }


}
