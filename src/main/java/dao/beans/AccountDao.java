package dao.beans;

import entity.Account;

import java.util.List;

public interface AccountDao {
    void add(Account account);
    void update(Account account);
    List <Account> read();
    Account findAccount(int id);
    int lastIDCom(List<Account> com);
    Account control(String pseudo, String password, List<Account> accountDAO);
    boolean controlUnique(String pseudo, List<Account> accountDAO);
}
