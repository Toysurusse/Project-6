package dao.beans;

import entity.Topo;

import java.util.List;

public interface TopoDao {
    void add (Topo topo);
    List<Topo> read();
    Topo topoSelect (int topoid);
    void delete(Topo topo);
}
