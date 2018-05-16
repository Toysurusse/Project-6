package actions;

import beans.Account;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.AccountDAO;
import javassist.NotFoundException;

import java.util.List;

public class ConnexionController extends ActionSupport {

    private DaoFactory daoFactory = DaoFactory.getInstance();
    private AccountDAO accountDAO;

    String pseudo=null;
    String password=null;
    List<Account> listAccount;
    Account account;

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


    public String connectControl () throws NotFoundException {
        this.accountDAO=daoFactory.getAccountDAO();

        if (pseudo != null && password!=null) {
            account = accountDAO.control(pseudo, password, accountDAO.read());
            if (account== null){
                this.addActionError(getText("error.connectError"));
            }
        }
        else {
            this.addActionError(getText("error.connectEmpty"));
            }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }




}
