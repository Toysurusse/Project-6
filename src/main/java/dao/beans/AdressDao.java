package dao.beans;

import entity.Adress;

import java.util.List;

public interface AdressDao {
    void add(Adress adress);
    void update(Adress adress);
    List <Adress> read();
    Adress readByAccount(int account);
}
