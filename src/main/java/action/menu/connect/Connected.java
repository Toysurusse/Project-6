package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.Commentaire;
import entity.Topo;
import resources.dao.beans.TopoDao;

public class Connected extends Connect {

    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Topo topo;
    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public TopoDao topoDao;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
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

    public String addTopo() {
        System.out.println("essai1");
        account = (Account) this.session.get("user");
        this.clearErrors();
        topo.setAccountid(account.getId());
        if(topo.getLocation().length()>99) {
            this.addActionError(getText("error.TitreTopoTropLong"));
        }
        else if(topo.getResume().length()>49000) {
            this.addActionError(getText("error.ResumeTopoTropLong"));
        }
        else {
            this.topoDao=this.daoFactory.getTopoDAO();
            this.topoDao.add(topo);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String deleteadmincom() {
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.commentaireDAO.delete(id);
        return ActionSupport.SUCCESS;
    }
}
