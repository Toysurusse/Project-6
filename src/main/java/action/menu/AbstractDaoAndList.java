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
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class AbstractDaoAndList extends ActionSupport implements SessionAware {


    //________________________DAO import_______________________

    /**
     * import Topo from entity
     */
    public Topo topo;
    /**
     * id to load entity from data
     */

    public int id;
    /**
     * Integer parameter to load topo
     */
    public Integer topoid;
    /**
     * Integer parameter to load site
     */
    public Integer siteid;
    /**
     * import Dao Factory
     */
    protected DaoFactory daoFactory;
    /**
     * import TopoDao from Factory
     */
    protected TopoDao topoDao;
    /**
     * import SiteDao from Factory
     */
    protected SiteDao siteDao;
    /**
     * import RentDao from Factory
     */
    protected RentDao rentDao;
    /**
     * import AccountDao from Factory
     */
    protected AccountDao accountDAO;
    /**
     * import CommentaireDao from Factory
     */
    protected CommentaireDao commentaireDao;
    /**
     * import AdressDao from Factory
     */
    protected AdressDao adressDao;
    /**
     * import Site from entity
     */
    protected Site site;
    /**
     * import Account from entity
     */
    protected Account account = new Account();
    /**
     * import Adress from entity
     */
    protected Adress adress = new Adress();
    /**
     * import Commentaire from entity
     */
    protected Commentaire commentaire;
    /**
     * import location from entity
     */
    protected String location;
    /**
     * import ListTopo to load Data informations
     */
    protected List<Topo> topolist;
    /**
     * import ListSite to load Data informations
     */
    protected List<Site> sitelist;
    /**
     * import ListAccount to load Data informations
     */
    protected List<Account> listAccount;
    /**
     * import ListCommentaire to load Data informations
     */
    protected List<Commentaire> listCommentaire;
    /**
     * import CommentaireList to load Data informations
     */
    protected List<Commentaire> commentaireList;

    //__________________________Entity_________________________
    /**
     * MapString to import session
     */
    protected Map<String, Object> session;
    /**
     * HashMap<Commentaire, Account> to associate each commentary to an account
     */
    protected HashMap<Commentaire, Account> hashMap = new HashMap<>();

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public TopoDao getTopoDao() {
        return topoDao;
    }

    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    public SiteDao getSiteDao() {
        return siteDao;
    }

    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    public RentDao getRentDao() {
        return rentDao;
    }

    public void setRentDao(RentDao rentDao) {
        this.rentDao = rentDao;
    }

    public AccountDao getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
    }

    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }

    public void setCommentaireDao(CommentaireDao commentaireDAO) {
        this.commentaireDao = commentaireDAO;
    }

    public AdressDao getAdressDao() {
        return adressDao;
    }

    public void setAdressDao(AdressDao adressDao) {
        this.adressDao = adressDao;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    //__________________________List_________________________

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public List<Account> getListAccount() {
        return listAccount;
    }

    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }

    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }

    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
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
}
