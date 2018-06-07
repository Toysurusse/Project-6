package dao.beans;

import entity.RentTopo;

import java.util.List;

/**
 * Interface of RentDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface RentDao {

    /**
     * add a rentTopo to the dataBase
     *
     * @param rentTopo
     */
    void add(RentTopo rentTopo);

    /**
     * List<RentTopo> from the database
     *
     * @return List<RentTopo>
     */
    List<RentTopo> read();

    /**
     * List<RentTopo> from accountid from the database
     *
     * @return List<RentTopo>
     */
    List<RentTopo> topoSelectbyid(int accountid);

    /**
     * delete RentTopo from id
     *
     * @param id
     */
    void delete(int id);

    /**
     * delete RentTopo from accountid
     *
     * @param id
     */
    void deleteByCompte(int id);

}
