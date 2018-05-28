package resources.dao.beans;

import entity.Site;

import java.util.List;

public interface SiteDao {
    void add(Site site);
    List <Site> read();
    List <Site> topoSiteSelect(int siteid);
    List <Site> siteTopoSelect(int topoid);
}
