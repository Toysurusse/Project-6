package action.menu.connect;

import action.menu.AbstractDaoAndList;
import com.opensymphony.xwork2.ActionSupport;
import entity.Account;
import entity.Commentaire;
import entity.Site;
import entity.Topo;

import java.util.HashMap;

/**
 * Manage personnal account options
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */


public class Connected extends AbstractDaoAndList {


    /**
     * HashMap<Site, Topo> to attach one topo to each site
     */

    protected HashMap<Site, Topo> hashMapST = new HashMap<>();

    public HashMap<Site, Topo> getHashMapST() {
        return hashMapST;
    }

    public void setHashMapST(HashMap<Site, Topo> hashMapST) {
        this.hashMapST = hashMapST;
    }

    /**
     * execute method to load personnal information
     *
     * @return String Success
     */

    public String execute() {
        hashMap.clear();
        hashMapST.clear();
        this.commentaireDao = daoFactory.getCommentaireDAO();
        this.topoDao = this.daoFactory.getTopoDAO();
        this.accountDAO = daoFactory.getAccountDAO();
        this.adressDao = daoFactory.getAdressDAO();
        this.siteDao = daoFactory.getSiteDAO();
        account = (Account) this.session.get("user");
        adress = this.adressDao.readByAccount(account.getId());
        sitelist = siteDao.siteIDSelect(account.getId());
        topolist = topoDao.topoSelect(account.getId());
        listCommentaire = this.commentaireDao.readCompteId(account.getId());

        for (Site aListSite : sitelist) {
            hashMapST.put(aListSite, this.topoDao.topoSelectbyid(aListSite.getTopos()));
        }

        for (Commentaire aListCommentaire : listCommentaire) {
            hashMap.put(aListCommentaire, this.accountDAO.findAccount(aListCommentaire.getAccount()));
        }

        return ActionSupport.SUCCESS;
    }

    /**
     * Delete commentary from DataBase
     *
     * @return String Success
     */

    public String deleteadmincom() {
        this.commentaireDao = daoFactory.getCommentaireDAO();
        this.commentaireDao.delete(id);
        return ActionSupport.SUCCESS;
    }

    /**
     * Add Site in DataBase
     *
     * @return String Success
     */

    public String addSite() {
        account = (Account) this.session.get("user");
        site.setAccountid(account.getId());
        site.setTopos(id);

        if (!controlSite(site)) {
            this.siteDao = this.daoFactory.getSiteDAO();
            site.setId(this.siteDao.lastID(this.siteDao.read()) + 1);

            this.siteDao.add(site);
        }
        return "success";
    }

    /**
     * Delete Site from DataBase
     *
     * @return String Success
     */

    public String deleteSite() {
        this.siteDao = this.daoFactory.getSiteDAO();
        this.siteDao.delete(id);

        return ActionSupport.SUCCESS;
    }

    /**
     * Add Topo in DataBase
     *
     * @return String Success or error if controlTopo return true
     */

    public String addTopo() {
        this.clearErrors();
        account = (Account) this.session.get("user");
        topo.setAccountid(account.getId());
        site.setAccountid(account.getId());

        if (!controlTopo(topo) && !controlSite(site)) {
            this.topoDao = this.daoFactory.getTopoDAO();
            topo.setId(this.topoDao.lastId(this.topoDao.read()));
            site.setTopos(topo.getIdentifiant());

            this.siteDao = this.daoFactory.getSiteDAO();
            site.setId(this.siteDao.lastID(this.siteDao.read()) + 1);

            this.topoDao.add(topo);
            this.siteDao.add(site);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Update Site from DataBase
     *
     * @return String Success or error if controlSite return true
     */

    public String updateSite() {
        this.clearErrors();
        account = (Account) this.session.get("user");
        site.setAccountid(account.getId());
        site.setId(getId());
        if (!controlSite(site)) {
            this.siteDao = this.daoFactory.getSiteDAO();
            this.siteDao.update(site);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Update Topo from DataBase
     *
     * @return String Success or error if controlTopo return true
     */
    public String updateTopo() {
        this.clearErrors();
        account = (Account) this.session.get("user");
        topo.setAccountid(account.getId());
        topo.setId(getId());
        if (!controlTopo(topo)) {
            this.topoDao = this.daoFactory.getTopoDAO();
            this.topoDao.update(topo);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Delete Topo from DataBase
     *
     * @return String Success or error if controlTopo return true
     */

    public String deleteTopo() {
        this.topoDao = this.daoFactory.getTopoDAO();
        this.siteDao = this.daoFactory.getSiteDAO();

        this.siteDao.deleteByTopo(id);
        this.topoDao.delete(id);

        return ActionSupport.SUCCESS;
    }

    /**
     * Add Info from DataBase
     *
     * @return String Success or error if controlTopo return true
     */

    public String addInfo() {
        this.topoDao = this.daoFactory.getTopoDAO();
        this.siteDao = this.daoFactory.getSiteDAO();

        this.siteDao.deleteByTopo(id);
        this.topoDao.delete(id);

        return ActionSupport.SUCCESS;
    }

    /**
     * control if Topo added respect DataBase format
     *
     * @param topo
     * @return false if it is Ok and true if control failed
     */

    boolean controlTopo(Topo topo) {
        boolean test = false;
        if (topo.getLocation().length() > 99) {
            this.addActionError(getText("error.TitreTopoTooLong"));
            test = true;
        }
        if (topo.getResume().length() > 49000) {
            this.addActionError(getText("error.ResumeTopoTooLong"));
            test = true;
        }
        return test;
    }

    /**
     * control if Site added respect DataBase format
     *
     * @param site
     * @return false if it is Ok and true if control failed
     */

    boolean controlSite(Site site) {
        boolean test = false;
        if (site.getLocation().length() > 99) {
            this.addActionError(getText("error.LocationSiteTooLong"));
            test = true;
        }
        if (site.getWay().length() > 199) {
            this.addActionError(getText("error.ResumeSiteTooLong"));
            test = true;
        }
        if (site.getHardness().length() > 9) {
            this.addActionError(getText("error.hardnessSiteTooLong"));
            test = true;
        }
        if (site.getHeight().equals("")) {
            this.addActionError(getText("error.ResumeTopoEmpty"));
            test = true;
        }
        return test;
    }
}
