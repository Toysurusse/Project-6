package dao.beans;

import entity.Information;

import java.util.List;

/**
 * Interface of InfoDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface InfoDao {

    /**
     * add an information
     *
     * @param information
     */
    void add(Information information);

    /**
     * List<Information> from the database
     *
     * @return List<Information>
     */
    List<Information> read();

    /**
     * List<Information> select from id in the database
     *
     * @param accountid
     * @return List<Information>
     */
    List<Information> selectByAccountId(int accountid);

    /**
     * find the appropriate id
     *
     * @return integer
     */
    int lastIDInfo(List<Information> info);

    /**
     * delete an info
     *
     * @param id
     */
    void delete(int id);
}
