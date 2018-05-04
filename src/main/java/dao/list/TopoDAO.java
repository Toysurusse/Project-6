package dao.list;

import beans.Topo;

import java.util.List;

public interface TopoDAO {
    void ajouter (Topo topo);
    List <Topo> lister();
}
