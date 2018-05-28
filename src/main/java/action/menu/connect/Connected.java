package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;

public class Connected extends Connect {

    public String execute (){
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.accountDAO=daoFactory.getAccountDAO();
        account = (Account) this.session.get("user");
        System.out.println(account.getPseudo());
        listCommentaire=this.commentaireDAO.readCompteId(account.getId());
        for (int i =0; i<listCommentaire.size();i++){
            hashMap.put(listCommentaire.get(i),this.accountDAO.findAccount (listCommentaire.get(i).getAccount()));
        }
        return ActionSupport.SUCCESS;
    }
}
