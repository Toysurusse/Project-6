package dao.list;

import beans.Account;
import beans.Commentaire;

import java.util.List;

public interface AccountDAO {
    void add(Account account);
    List <Account> read();
    int lastIDCom (List <Account> com);
    boolean control(String pseudo, String password,List <Account> accountDAO);
}
