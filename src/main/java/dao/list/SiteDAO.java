package dao.list;

import beans.Site;
import beans.Topo;

import java.util.List;

public interface SiteDAO {
    void add(Site site);
    List <Site> read();
    List <Site> siteSelect (int siteid);
}
