package dao.beans;

import entity.Account;

import java.util.List;

/**
 * Interface of AccountDao to load info from DataBase
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface AccountDao {

    /**
     * add an account
     *
     * @param account
     */
    void add(Account account);

    /**
     * ipdate an account
     *
     * @param account
     */
    void update(Account account);

    /**
     * List of account
     *
     * @return List <Account>
     */
    List<Account> read();

    /**
     * Account finded from the id
     *
     * @param id
     * @return Account
     */
    Account findAccount(int id);

    /**
     * find the next id
     *
     * @param com return int
     */
    int lastIDCom(List<Account> com);

    /**
     * control if password and pseudo is present in the database
     *
     * @param accountDAO
     * @param password
     * @param pseudo     return Account
     */
    Account control(String pseudo, String password, List<Account> accountDAO);

    /**
     * control if the pseudo exist in the database
     *
     * @param accountDAO
     * @param pseudo     return boolean
     */
    boolean controlUnique(String pseudo, List<Account> accountDAO);
}
