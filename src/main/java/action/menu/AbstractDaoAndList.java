package action.menu;

import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.beans.*;
import entity.*;
import org.apache.struts2.interceptor.SessionAware;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Agregate entyties, lists and Dao to clarify the code
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class AbstractDaoAndList extends ActionSupport implements SessionAware {


    //________________________DAO import_______________________


    protected DaoFactory daoFactory;
    public DaoFactory getDaoFactory() {
        return daoFactory;
    }
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    protected TopoDao topoDao ;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    protected SiteDao siteDao;
    public SiteDao getSiteDao() {
        return siteDao;
    }
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    protected RentDao rentDao;
    public RentDao getRentDao() {
        return rentDao;
    }
    public void setRentDao(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    protected AccountDao accountDAO;
    public AccountDao getAccountDAO() {
        return accountDAO;
    }
    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
    }

    protected CommentaireDao commentaireDao;
    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }
    public void setCommentaireDao(CommentaireDao commentaireDAO) {
        this.commentaireDao = commentaireDAO;
    }

    protected AdressDao adressDao;
    public AdressDao getAdressDao() {
        return adressDao;
    }
    public void setAdressDao(AdressDao adressDao) {
        this.adressDao = adressDao;
    }





    //__________________________Entity_________________________

    public Topo topo;
    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    protected Site site;
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    protected Account account=new Account();
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    protected Adress adress = new Adress();
    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    protected Commentaire commentaire;
    public Commentaire getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }



    protected String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //__________________________List_________________________

    protected List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    protected List<Site> sitelist;
    public List<Site> getSitelist() {
        return sitelist;
    }
    public void setSitelist(List<Site> sitelist) {
        this.sitelist = sitelist;
    }

    protected List<Account> listAccount;
    public List<Account> getListAccount() {
        return listAccount;
    }
    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    protected List<Commentaire> listCommentaire;
    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }
    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }

    protected List<Commentaire> commentaireList;
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }
    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }


    protected Map<String, Object> session;
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
    public Map<String, Object> getSession() {
        return session;
    }





    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    protected String pseudo;
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    protected String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    protected HashMap<Commentaire, Account> hashMap= new HashMap<>();
    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
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


    protected Boolean addAdress ;
    public Boolean getAddAdress() {
        return addAdress;
    }
    public void setAddAdress(Boolean addAdress) {
        this.addAdress = addAdress;
    }
}
