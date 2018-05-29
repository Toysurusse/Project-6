package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;

public class Create extends Connect {

    public String input () {
        this.clearErrors();
        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        listAccount=this.accountDAO.read();
        System.out.println(this.accountDAO.lastIDCom(listAccount)+"int");
        account.setId(this.accountDAO.lastIDCom(listAccount));
        account.setAdressId(account.getId());
        account.setAccessLevel(1);
        adress.setAdressId(account.getId());

        controlMDP(account);

        if (!this.hasErrors()){
            this.adressDao.add(adress);
            this.accountDAO.add(account);
            this.session.put("user",account);
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String doUpdateAccount () {
        this.accountDAO=daoFactory.getAccountDAO();
        this.adressDao=daoFactory.getAdressDAO();
        listAccount=this.accountDAO.read();

        Account id = (Account) this.session.get("user");
        account.setId(id.getId());

        controlMDP(account);

        if (!this.hasErrors()){
            this.accountDAO.update(account);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    private void controlMDP (Account account){
        if(account.getName().equals("")){
            this.addActionError(getText("error.emptyName"));
        }
        if(account.getFirstName().equals("")){
            this.addActionError(getText("error.emptyFirstName"));
        }
        if(account.getPseudo().equals("")){
            this.addActionError(getText("error.emptyPseudo"));
        }
        if(account.getPassword().equals("")){
            this.addActionError(getText("error.emptyPassword"));
        }
        if(account.getSex().equals("-1")){
            this.addActionError(getText("error.emptySex"));
        }
    }
}
