package dao.beans;

import entity.Site;
import entity.Topo;

import java.util.List;

public interface SiteDao {
    void add(Site site);
    List <Site> read();
    List<Site> siteIDSelect (int accountid);
    List <Site> topoSiteSelect(int siteid);
    List <Site> siteTopoSelect(int topoid);
    List <String> LocationSelect();
    List <Site> siteSelectByString(String location);
    void delete(int id);
    void deleteByTopo(int id);
    int lastID (List <Site> site);
}
