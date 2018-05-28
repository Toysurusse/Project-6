package resources.dao.beans;

import entity.Adress;

import java.util.List;

public interface AdressDao {
    void add(Adress adress);
    List <Adress> read();
}
