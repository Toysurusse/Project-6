package actions;

import beans.Account;
import beans.Commentaire;
import beans.Site;
import beans.Topo;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.AccountDAO;
import dao.list.CommentaireDAO;
import dao.list.SiteDAO;
import dao.list.TopoDAO;


import java.util.HashMap;
import java.util.List;

public class TopoController extends ActionSupport {

    public Integer topoid;
    public Integer siteid;
    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private TopoDAO topoDAO;
    private SiteDAO siteDAO;
    private CommentaireDAO commentaireDAO;
    private AccountDAO accountDAO;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopoid() {
        return topoid;
    }
    public void setTopoid(Integer pId) {
        topoid = pId;
    }

    public Integer getSiteid() {
        return siteid;
    }
    public void setSiteId(Integer pId) {
        this.siteid = pId;
    }

    private List<Topo> listTopo;
    private List<Site> listSite;
    private List<Commentaire> listCommentaire;
    private Topo topo;

    public List<Topo> getListTopo() {
        return listTopo;
    }
    public List<Site> getListSite() {
        return listSite;
    }
    public List<Commentaire> getListCommentaire() {
        return listCommentaire;
    }
    public void setListCommentaire(List<Commentaire> listCommentaire) {
        this.listCommentaire = listCommentaire;
    }

    private Account account;
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    private HashMap<Commentaire, Account> hashMap= new HashMap<>();
    public HashMap<Commentaire, Account> getHashMap() {
        return hashMap;
    }
    public void setHashMap(HashMap<Commentaire, Account> hashMap) {
        this.hashMap = hashMap;
    }

    public String doList() {
        this.topoDAO = daoFactory.getTopoDAO();
        listTopo = this.topoDAO.read();
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.read();
        return ActionSupport.SUCCESS;
    }

    public String doFindSiteTopo() {
        this.siteDAO = daoFactory.getSiteDAO();
        this.commentaireDAO=daoFactory.getCommentaireDAO();
        this.accountDAO=daoFactory.getAccountDAO();

        if (siteid==0){
            listSite = this.siteDAO.topoSiteSelect(topoid);
            listCommentaire=this.commentaireDAO.readTopo(topoid);
            for (int i =0; i<listCommentaire.size();i++){
                hashMap.put(listCommentaire.get(i),this.accountDAO.findAccount (listCommentaire.get(i).getAccount()));
            }
        }else{
            listSite = this.siteDAO.siteTopoSelect(siteid);
            listCommentaire=this.commentaireDAO.readWay(siteid);
            for (int i =0; i<listCommentaire.size();i++){
                hashMap.put(listCommentaire.get(i),this.accountDAO.findAccount (listCommentaire.get(i).getAccount()));
            }
        }
        return ActionSupport.SUCCESS;
    }
}
