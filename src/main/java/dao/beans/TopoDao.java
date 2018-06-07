package dao.beans;

import entity.Site;
import entity.Topo;

import java.util.HashMap;
import java.util.List;

/**
 * Interface of TopoDao to load info from DataBase
 *  @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface TopoDao {

    /**
     * add Topo
     * @param topo
     */
    void add (Topo topo);

    /**
     * update Topo
     * @param topo
     */
    void update (Topo topo);

    /**
     * List<Topo> of topo from database
     * @return List<Topo>
     */
    List<Topo> read();

    /**
     * List<Topo> of topo by account from database
     * @return List<Topo>
     */
    List<Topo> topoSelect(int accountid);

    /**
     * Topo selected by id from database
     * @param id
     * @return List<Topo>
     */
    Topo topoSelectbyid(int id);

    /**
     * delete Topo from id
     * @param id
     */
    void delete(int id);

    /**
     * Find the appropriate id
     * @param topo
     * @return int
     */
    int lastId (List <Topo> topo);

    /**
     * HashMap<Topo, Site> associate Topo and Sites
     * @param request
     * @return HashMap<Topo, Site>
     */
    HashMap<Topo, Site> find(String request);
}
