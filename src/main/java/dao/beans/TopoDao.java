package dao.beans;

import entity.Topo;

import java.util.List;

public interface TopoDao {
    void add (Topo topo);
    List<Topo> read();
    List<Topo> topoSelect(int accountid);
    Topo topoSelectbyid(int id);
    void delete(int id);
    int lastId (List <Topo> topo);
}
