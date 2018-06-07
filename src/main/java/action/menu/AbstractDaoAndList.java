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

    /**
     * import Dao Factory
     */
    protected DaoFactory daoFactory;
    public DaoFactory getDaoFactory() {
        return daoFactory;
    }
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /**
     * import TopoDao from Factory
     */
    protected TopoDao topoDao ;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    /**
     * import SiteDao from Factory
     */
    protected SiteDao siteDao;
    public SiteDao getSiteDao() {
        return siteDao;
    }
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    /**
     * import RentDao from Factory
     */
    protected RentDao rentDao;
    public RentDao getRentDao() {
        return rentDao;
    }
    public void setRentDao(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    /**
     * import AccountDao from Factory
     */
    protected AccountDao accountDAO;
    public AccountDao getAccountDAO() {
        return accountDAO;
    }
    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
    }

    /**
     * import CommentaireDao from Factory
     */
    protected CommentaireDao commentaireDao;
    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }
    public void setCommentaireDao(CommentaireDao commentaireDAO) {
        this.commentaireDao = commentaireDAO;
    }

    /**
     * import AdressDao from Factory
     */
    protected AdressDao adressDao;
    public AdressDao getAdressDao() {
        return adressDao;
    }
    public void setAdressDao(AdressDao adressDao) {
        this.adressDao = adressDao;
    }

    //__________________________Entity_________________________

    /**
     * import Topo from entity
     */
    public Topo topo;
    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    /**
     * import Site from entity
     */
    protected Site site;
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * import Account from entity
     */
    protected Account account=new Account();
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * import Adress from entity
     */
    protected Adress adress = new Adress();
    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    /**
     * import Commentaire from entity
     */
    protected Commentaire commentaire;
    public Commentaire getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * import location from entity
     */
    protected String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //__________________________List_________________________

    /**
     * import ListTopo to load Data informations
     */
    protected List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    /**
     * import ListSite to load Data informations
     */
    protected List<Site> sitelist;
    public List<Site> getSitelist() {
        return sitelist;
    }
    public void setSitelist(List<Site> sitelist) {
        this.sitelist = sitelist;
    }

    /**
     * import ListAccount to load Data informations
     */
    protected List<Account> listAccount;
    public List<Account> getListAccount() {
        return listAccount;
    }
    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    /**
     * import ListCommentaire to load Data informations
     */
    protected List<Commentaire> listCommentaire;
    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }
    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }

    /**
     * import CommentaireList to load Data informations
     */
    protected List<Commentaire> commentaireList;
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }
    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    /**
     * MapString to import session
     */
    protected Map<String, Object> session;
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * id to load entity from data
     */

    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * HashMap<Commentaire, Account> to associate each commentary to an account
     */
    protected HashMap<Commentaire, Account> hashMap= new HashMap<>();
    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
    }

    /**
     * Integer parameter to load topo
     */
    public Integer topoid;
    public Integer getTopoid() {
        return topoid;
    }
    public void setTopoid(Integer topoid) {
        this.topoid = topoid;
    }

    /**
     * Integer parameter to load site
     */
    public Integer siteid;
    public Integer getSiteid() {
        return siteid;
    }
    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }
}
