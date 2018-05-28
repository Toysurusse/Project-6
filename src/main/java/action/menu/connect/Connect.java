package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.Adress;
import entity.Commentaire;
import javassist.NotFoundException;
import org.apache.struts2.interceptor.SessionAware;
import resources.dao.AdressDaoImpl;
import resources.dao.DaoFactory;
import resources.dao.beans.AccountDao;
import resources.dao.beans.AdressDao;
import resources.dao.beans.CommentaireDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connect extends ActionSupport implements SessionAware {

    protected Map<String, Object> session;

    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    protected DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public AccountDao getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDao accountDAO) {
        this.accountDAO = accountDAO;
    }

    public CommentaireDao getCommentaireDAO() {
        return commentaireDAO;
    }

    public void setCommentaireDAO(CommentaireDao commentaireDAO) {
        this.commentaireDAO = commentaireDAO;
    }

    public AdressDao getAdressDao() {
        return adressDao;
    }

    public void setAdressDao(AdressDao adressDao) {
        this.adressDao = adressDao;
    }

    protected AccountDao accountDAO;
    protected CommentaireDao commentaireDAO;
    protected AdressDao adressDao;
    protected Account account=new Account();
    protected Adress adress = new Adress();

    protected Boolean addAdress ;
    protected String pseudo;
    protected String password;
    protected List<Account> listAccount;

    protected List<Commentaire> listCommentaire;

    protected HashMap<Commentaire, Account> hashMap= new HashMap<>();
    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
    }

    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Account> getListAccount() {
        return listAccount;
    }
    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }
    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Boolean getAddAdress() {
        return addAdress;
    }
    public void setAddAdress(Boolean addAdress) {
        this.addAdress = addAdress;
    }
    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }
    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }

}
