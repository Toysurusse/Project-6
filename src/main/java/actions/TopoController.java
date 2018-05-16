package actions;

import beans.Site;
import beans.Topo;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.SiteDAO;
import dao.list.TopoDAO;


import java.util.List;

public class TopoController extends ActionSupport {

    private Integer topoid;
    private Integer siteid;
    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private TopoDAO topoDAO;
    private SiteDAO siteDAO;


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

    public Integer getSiteId() {
        return siteid;
    }
    public void setSiteId(Integer pId) {
        this.siteid = pId;
    }

    private List<Topo> listTopo;
    private List<Site> listSite;
    private Topo topo;

    public List<Topo> getListTopo() {
        return listTopo;
    }
    public List<Site> getListSite() {
        return listSite;
    }

    public String doList() {
        this.topoDAO = daoFactory.getTopoDAO();
        listTopo = this.topoDAO.read();
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.read();
        return ActionSupport.SUCCESS;
    }

    public String dFindTopo() {
        topoid = id;
        this.topoDAO = daoFactory.getTopoDAO();
        topo = this.topoDAO.topoSelect(topoid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.siteSelect(siteid);
        return ActionSupport.SUCCESS;
    }

    public String doFindSite() {
        siteid=id;
        System.out.println(siteid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.siteSelect(siteid);
        return ActionSupport.SUCCESS;
    }

    public String doFindsSiteTopo() {
        topoid = id;
        System.out.println(topoid);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.siteTopoSelect(topoid);
        return ActionSupport.SUCCESS;
    }




}
