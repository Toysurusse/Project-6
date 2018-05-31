package action.menu.connect;

import com.opensymphony.xwork2.ActionSupport;
import dao.beans.SiteDao;
import entity.Account;
import entity.Commentaire;
import entity.Site;
import entity.Topo;
import dao.beans.TopoDao;

import java.util.HashMap;
import java.util.List;

public class Connected extends Connect {

    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    public List<Site>listsite;
    public List<Site> getListSite() {
        return listsite;
    }
    public void setListSite(List<Site> listSite) {
        this.listsite = listSite;
    }

    public Topo topo;
    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Site site;
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    private TopoDao topoDao ;
    public TopoDao getTopoDao() {
        return topoDao;
    }
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    private SiteDao siteDao;
    public SiteDao getSiteDao() {
        return siteDao;
    }
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    protected HashMap<Site, Topo> hashMapST= new HashMap<>();
    public HashMap<Site, Topo> getHashMapST() {
        return hashMapST;
    }
    public void setHashMapST(HashMap<Site, Topo> hashMapST) {
        this.hashMapST = hashMapST;
    }

    public String execute (){
        hashMap.clear();
        hashMapST.clear();
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.topoDao=this.daoFactory.getTopoDAO();
        this.accountDAO=daoFactory.getAccountDAO();
        this.siteDao=daoFactory.getSiteDAO();
        account = (Account) this.session.get("user");
        System.out.println(account.getPseudo());
        listsite=siteDao.siteIDSelect(account.getId());
        topolist=topoDao.topoSelect(account.getId());
        listCommentaire=this.commentaireDAO.readCompteId(account.getId());

        for(Site aListSite : listsite){
            hashMapST.put(aListSite, this.topoDao.topoSelectbyid(aListSite.getTopos()));
        }

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


    public String addSite(){
        account = (Account) this.session.get("user");
        site.setAccountid(account.getId());
        site.setTopos(id);

        if(!controlSite(site)){
            this.siteDao=this.daoFactory.getSiteDAO();
            site.setId(this.siteDao.lastID(this.siteDao.read())+1);

            this.siteDao.add(site);
        }
        return "success";
    }

    public String deleteSite() {
        this.siteDao=this.daoFactory.getSiteDAO();
        this.siteDao.delete(id);

        return ActionSupport.SUCCESS;
    }

    public String addTopo() {
        this.clearErrors();
        account = (Account) this.session.get("user");
        topo.setAccountid(account.getId());
        site.setAccountid(account.getId());

        if(!controlTopo(topo) && !controlSite(site)){
            this.topoDao=this.daoFactory.getTopoDAO();
            topo.setId(this.topoDao.lastId(this.topoDao.read()));
            System.out.println(topo.getIdentifiant());
            site.setTopos(topo.getIdentifiant());

            this.siteDao=this.daoFactory.getSiteDAO();
            site.setId(this.siteDao.lastID(this.siteDao.read())+1);

            this.topoDao.add(topo);
            this.siteDao.add(site);
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    public String deleteTopo() {
            this.topoDao=this.daoFactory.getTopoDAO();
            this.siteDao=this.daoFactory.getSiteDAO();

            this.siteDao.deleteByTopo(id);
            this.topoDao.delete(id);

        return ActionSupport.SUCCESS;
    }

    boolean controlTopo(Topo topo){
        boolean test = false;
        if(topo.getLocation().length()>99) {
            this.addActionError(getText("error.TitreTopoTooLong"));
            test = true;
        }
        if(topo.getResume().length()>49000) {
            this.addActionError(getText("error.ResumeTopoTooLong"));
            test = true;
        }
        return test;
    }

    boolean controlSite(Site site){
        boolean test = false;
        if(site.getLocation().length()>99) {
            this.addActionError(getText("error.LocationSiteTooLong"));
            test = true;
        }
        if(site.getWay().length()>199) {
            this.addActionError(getText("error.ResumeSiteTooLong"));
            test = true;
        }
        if(site.getHardness().length()>9) {
            this.addActionError(getText("error.hardnessSiteTooLong"));
            test = true;
        }
        if(site.getHeight().equals("")) {
            this.addActionError(getText("error.ResumeTopoEmpty"));
            test = true;
        }
        return test;
    }

}
