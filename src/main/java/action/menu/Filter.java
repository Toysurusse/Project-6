package action.menu;

import entity.Site;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.SiteDao;
import dao.beans.TopoDao;

import java.util.HashMap;
import java.util.List;

public class Filter {

    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }
    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    private SiteDao siteDao;
    public SiteDao getSiteDao() {
        return siteDao;
    }
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    private TopoDao topoDao;
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }
    public TopoDao getTopoDao() {
        return topoDao;
    }

    private List<String> locationlist;
    public List<String> getLocationlist() {
        return locationlist;
    }
    public void setLocationlist(List<String> locationlist) {
        this.locationlist = locationlist;
    }

    private List<Topo> topolist;
    public List<Topo> getTopolist() {
        return topolist;
    }
    public void setTopolist(List<Topo> topolist) {
        this.topolist = topolist;
    }

    private List<Site> sitelist;
    public List<Site> getSitelist() {
        return sitelist;
    }
    public void setSitelist(List<Site> sitelist) {
        this.sitelist = sitelist;
    }

    private String requestfind;
    public String getRequestfind() {
        return requestfind;
    }
    public void setRequestfind(String requestfind) {
        this.requestfind = requestfind;
    }

    private Topo topo;
    public Topo getTopo() {
        return topo;
    }
    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    private Site site;
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    private HashMap<Topo,Site> findResult;
    public HashMap<Topo, Site> getFindResult() {
        return findResult;
    }
    public void setFindResult(HashMap<Topo, Site> findResult) {
        this.findResult = findResult;
    }

    public Integer topoid;
    public Integer siteid;
    public Integer getTopoid() {
        return topoid;
    }
    public void setTopoid(Integer topoid) {
        this.topoid = topoid;
    }
    public Integer getSiteid() {
        return siteid;
    }
    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public String execute() {
        topolist=null;
        sitelist=null;
        locationlist=null;

        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();

        topolist=topoDao.read();
        sitelist=siteDao.read();
        locationlist=siteDao.LocationSelect();

        return "success";
    }

    public String find() {
        topolist=null;
        sitelist=null;
        locationlist=null;
        findResult=null;

        this.topoDao = this.daoFactory.getTopoDAO();
        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();

        findResult=topoDao.find(requestfind);
        topolist=topoDao.read();
        sitelist=siteDao.read();
        locationlist=siteDao.LocationSelect();

        return "success";
    }


}
