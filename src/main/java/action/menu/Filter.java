package action.menu;

import entity.Site;
import entity.Topo;
import dao.DaoFactory;
import dao.beans.SiteDao;
import dao.beans.TopoDao;

import java.util.HashMap;
import java.util.List;

/**
 * Class wich let filter topo, site and sectors
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Filter extends AbstractDaoAndList {


    private String requestfind;
    public String getRequestfind() {
        return requestfind;
    }
    public void setRequestfind(String requestfind) {
        this.requestfind = requestfind;
    }

    private HashMap<Topo,Site> findResult;
    public HashMap<Topo, Site> getFindResult() {
        return findResult;
    }
    public void setFindResult(HashMap<Topo, Site> findResult) {
        this.findResult = findResult;
    }


    private List<String> locationlist;
    public List<String> getLocationlist() {
        return locationlist;
    }
    public void setLocationlist(List<String> locationlist) {
        this.locationlist = locationlist;
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
