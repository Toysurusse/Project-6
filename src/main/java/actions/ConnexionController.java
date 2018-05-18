package actions;

import beans.Account;
import beans.Adress;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.AccountDAO;
import javassist.NotFoundException;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class ConnexionController extends ActionSupport implements SessionAware {

    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    private DaoFactory daoFactory = DaoFactory.getInstance();
    private AccountDAO accountDAO;
    private Account account;
    private Adress adress;

    String pseudo=null;
    String password=null;
    List<Account> listAccount;

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

    public String doConnectControl() throws NotFoundException {
        this.accountDAO=daoFactory.getAccountDAO();
        if (pseudo != null && password!=null) {
            account = accountDAO.control(pseudo, password, accountDAO.read());
            if (account== null){
                this.addActionError(getText("error.connectError"));
            }else {
                this.session.put("user",account);
            }
        }
        else {
            this.addActionError(getText("error.connectEmpty"));
            }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String doLogOut (){
        // Suppression de l'utilisateur en session
        this.session.remove("user");
        return ActionSupport.SUCCESS;
    }

    public String doCreateAccount (){
        // Suppression de l'utilisateur en session
        this.accountDAO=daoFactory.getAccountDAO();




        accountDAO.add(account);

        return ActionSupport.SUCCESS;
    }

}
