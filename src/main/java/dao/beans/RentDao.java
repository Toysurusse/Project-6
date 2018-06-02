package dao.beans;

import entity.RentTopo;


import java.util.List;

public  interface RentDao {
    void add (RentTopo rentTopo);
    List<RentTopo> read();
    List<RentTopo>  topoSelectbyid(int accountid);
    void delete(int id);
    void deleteByCompte(int id);

}
