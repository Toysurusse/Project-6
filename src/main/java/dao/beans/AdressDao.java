package dao.beans;

import entity.Adress;

import java.util.List;

/**
 * Interface of AdressDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface AdressDao {

    /**
     * add Adress
     *
     * @param adress
     */
    void add(Adress adress);

    /**
     * update Adress
     *
     * @param adress
     */
    void update(Adress adress);

    /**
     * List of adress from DataBase
     *
     * @return List <Adress>
     */
    List<Adress> read();

    /**
     * find addresse from an account
     *
     * @param account
     * @return Adress
     */
    Adress readByAccount(int account);
}
