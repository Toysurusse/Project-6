package action.menu;

import entity.Site;
import resources.dao.DaoFactory;
import resources.dao.beans.SiteDao;
import resources.dao.beans.TopoDao;

import java.util.List;

public class SiteShow {
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

    private List<Site> sitelist;
    public List<Site> getTopolist() {
        return sitelist;
    }
    public void setTopolist(List<Site> topolist) {
        this.sitelist = topolist;
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
        if (siteid==0){
            sitelist = this.siteDao.topoSiteSelect(topoid);
        }else{
            sitelist = this.siteDao.siteTopoSelect(siteid);
        }
        return "success";
    }
}
