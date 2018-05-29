package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;

public class ConnectTry extends Connect {

    public String execute() {
        this.addActionError(getText("error.connectEmpty"));
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String input() {
        this.clearErrors();
        this.accountDAO=daoFactory.getAccountDAO();
        if (pseudo != null && password!=null) {
            account = accountDAO.control(pseudo, password, accountDAO.read());
            System.out.println(pseudo + password);
            System.out.println(account = accountDAO.control(pseudo, password, accountDAO.read()));
            if (account== null){
                this.addActionError(getText("error.connectError"));
            }else {
                this.session.put("user",account);
                pseudo = null;
                password = null;
            }
        }
        else {
            this.addActionError(getText("error.connectEmpty"));
        }
        this.accountDAO=null;
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String disconnect() {
        this.session.remove("user");
        return ActionSupport.SUCCESS;
    }

}
