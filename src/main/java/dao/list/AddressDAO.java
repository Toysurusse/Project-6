package dao.list;

import beans.Account;
import beans.Adress;

import java.util.List;

public interface AddressDAO {
    void add(Adress adress);
    List <Adress> read();
}
