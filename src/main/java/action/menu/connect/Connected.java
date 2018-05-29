package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.Commentaire;

public class Connected extends Connect {

    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String execute (){
        hashMap.clear();
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.accountDAO=daoFactory.getAccountDAO();
        account = (Account) this.session.get("user");
        System.out.println(account.getPseudo());
        listCommentaire=this.commentaireDAO.readCompteId(account.getId());
        for (Commentaire aListCommentaire : listCommentaire) {
            hashMap.put(aListCommentaire, this.accountDAO.findAccount(aListCommentaire.getAccount()));
        }
        return ActionSupport.SUCCESS;
    }

    public String deleteadmincom() {
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.commentaireDAO.delete(id);
        return ActionSupport.SUCCESS;
    }
}
