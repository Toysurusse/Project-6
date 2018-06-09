package action.menu.connect;

import action.menu.AbstractDaoAndList;
import com.opensymphony.xwork2.ActionSupport;
import entity.Account;

/**
 * Create and update personnal account  information
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Create extends AbstractDaoAndList {


    /**
     * Initialize account and adress to prepare update
     *
     * @return String Success
     */

    public String execute() {
        account=null;
        adress=null;
        return ActionSupport.SUCCESS;
    }

    /**
     * Initialize account and adress to prepare update
     *
     * @return String Success
     */

    public String initUpdate() {
        this.clearErrors();
        this.accountDAO = daoFactory.getAccountDAO();
        this.adressDao = daoFactory.getAdressDAO();
        account = (Account) this.session.get("user");
        adress = this.adressDao.readByAccount(account.getId());
        return ActionSupport.SUCCESS;
    }

    /**
     * Create a new profile
     *
     * @return String Success or error if controlMDP return error
     */

    public String input() {
        this.clearErrors();
        this.accountDAO = daoFactory.getAccountDAO();
        this.adressDao = daoFactory.getAdressDAO();
        listAccount = this.accountDAO.read();
        System.out.println(this.accountDAO.lastIDCom(listAccount) + "int");
        account.setId(this.accountDAO.lastIDCom(listAccount));
        account.setAdressId(account.getId());
        account.setAccessLevel(1);
        adress.setAdressId(account.getId());

        controlMDP(account);

        if (this.accountDAO.controlUnique(account.getPseudo(), this.accountDAO.read())) {
            this.addActionError(getText("error.PseudoExist"));
        }

        if (!this.hasErrors()) {
            this.adressDao.add(adress);
            this.accountDAO.add(account);
            this.session.put("user", account);
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Update profile
     *
     * @return String Success or error if controlMDP return error
     */

    public String doUpdateAccount() {
        this.clearErrors();
        this.accountDAO = daoFactory.getAccountDAO();
        this.adressDao = daoFactory.getAdressDAO();
        listAccount = this.accountDAO.read();

        Account id = (Account) this.session.get("user");
        account.setId(id.getId());

        controlMDP(account);

        if (!this.hasErrors()) {
            this.adressDao.update(adress);
            this.accountDAO.update(account);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Control if profil proposed is Ok with DataBase parameters
     *
     * @param account
     */

    private void controlMDP(Account account) {
        if (account.getName().equals("")) {
            this.addActionError(getText("error.emptyName"));
        }
        if (account.getFirstName().equals("")) {
            this.addActionError(getText("error.emptyFirstName"));
        }
        if (account.getPseudo().equals("")) {
            this.addActionError(getText("error.emptyPseudo"));
        }
        if (account.getPassword().equals("")) {
            this.addActionError(getText("error.emptyPassword"));
        }
        if (account.getSex().equals("-1")) {
            this.addActionError(getText("error.emptySex"));
        }
    }
}
