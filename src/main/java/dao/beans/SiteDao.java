package dao.beans;

import entity.Site;

import java.util.List;

/**
 * Interface of SiteDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface SiteDao {

    /**
     * add Site
     *
     * @param site
     */
    void add(Site site);

    /**
     * update Site
     *
     * @param site
     */
    void update(Site site);

    /**
     * List <Site> of Site from the database
     *
     * @return List<Site>
     */
    List<Site> read();

    /**
     * List <Site> of Site from account in the database
     *
     * @param accountid
     * @return List<Site>
     */
    List<Site> siteIDSelect(int accountid);

    /**
     * List <Site> of Site from siteId in the database
     *
     * @param siteid
     * @return List<Site>
     */
    List<Site> topoSiteSelect(int siteid);

    /**
     * List <Site> of Site from topoId the database
     *
     * @param topoid
     * @return List<Site>
     */
    List<Site> siteTopoSelect(int topoid);

    /**
     * List <String> of sectors from the database
     *
     * @return List<String>
     */
    List<String> LocationSelect();

    /**
     * List <Site> of Site from location in the database
     *
     * @param location
     * @return List<Site>
     */
    List<Site> siteSelectByString(String location);

    /**
     * delete a site
     *
     * @param id
     */
    void delete(int id);

    /**
     * delete by topo
     *
     * @param id
     */
    void deleteByTopo(int id);

    /**
     * find the appropriate id
     *
     * @param site
     * @return integer
     */
    int lastID(List<Site> site);
}
