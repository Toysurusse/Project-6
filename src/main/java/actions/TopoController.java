package actions;

import beans.Site;
import beans.Topo;
import com.opensymphony.xwork2.ActionSupport;
import dao.DaoFactory;
import dao.list.SiteDAO;
import dao.list.TopoDAO;


import java.util.Collections;
import java.util.List;

public class TopoController extends ActionSupport {

    private Integer id;
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private TopoDAO topoDAO;
    private SiteDAO siteDAO;

    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }

    private List<Topo> listTopo;
    private List<Site> listSite;

    public List<Topo> getListTopo() {
        return listTopo;
    }
    public List<Site> getListSite() {
        return listSite;
    }


    public String doList() {
        this.topoDAO = daoFactory.getTopoDAO();
        listTopo = this.topoDAO.read();
        return ActionSupport.SUCCESS;
    }

    public String doDetail() {
        System.out.println(id);
        this.siteDAO = daoFactory.getSiteDAO();
        listSite = this.siteDAO.siteSelect(id);
        return ActionSupport.SUCCESS;
    }
}
