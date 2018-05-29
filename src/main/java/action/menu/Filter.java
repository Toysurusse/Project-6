package action.menu;

import entity.Site;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.SiteDao;
import dao.beans.TopoDao;

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
        this.siteDao = this.daoFactory.getSiteDAO();
        this.topoDao = this.daoFactory.getTopoDAO();
        topolist=topoDao.read();
        sitelist=siteDao.read();
        return "success";
    }



}
