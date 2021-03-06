package action.menu.connect;

import action.menu.AbstractDaoAndList;
import com.opensymphony.xwork2.ActionSupport;

/**
 * organise connection try and disconnection
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class ConnectTry extends AbstractDaoAndList {

    /**
     * String to load the pseudo proposal from user
     */
    protected String pseudo="";
    /**
     * String to load the password proposal from user
     */
    protected String password="";

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

    /**
     * Add Topo in DataBase
     *
     * @return String Success or error if controlTopo return true
     */

    public String execute() {
        return ActionSupport.SUCCESS;
    }

    /**
     * Try connection to personnal account
     *
     * @return String Success or error if password and pin are different
     */
    public String input() {
        this.clearErrors();
        this.accountDAO = daoFactory.getAccountDAO();
        System.out.println(pseudo+" ; "+password);
        if (pseudo != "" && password != "") {
            account = accountDAO.control(pseudo, password, accountDAO.read());
            if (account == null) {
                this.addActionError(getText("error.connectError"));
            } else {
                this.session.put("user", account);
                pseudo = null;
                password = null;
            }
        } else {
            this.addActionError(getText("error.connectEmpty"));
        }
        this.accountDAO = null;
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Disconnect to personnal information
     *
     * @return String Success
     */

    public String disconnect() {
        this.session.remove("user");
        return ActionSupport.SUCCESS;
    }

}
