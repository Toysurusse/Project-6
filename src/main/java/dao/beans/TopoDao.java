package dao.beans;

import entity.Site;
import entity.Topo;

import java.util.HashMap;
import java.util.List;

public interface TopoDao {
    void add (Topo topo);
    void update (Topo topo);
    List<Topo> read();
    List<Topo> topoSelect(int accountid);
    Topo topoSelectbyid(int id);
    void delete(int id);
    int lastId (List <Topo> topo);
    HashMap<Topo, Site> find(String request);
}
