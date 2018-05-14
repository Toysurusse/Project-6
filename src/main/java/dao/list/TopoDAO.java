package dao.list;

import beans.Topo;

import java.util.List;

public interface TopoDAO {
    void add (Topo topo);
    List <Topo> read();
    Topo topoSelect (int topoid);
}
