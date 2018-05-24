package dao.list;

import beans.Commentaire;
import beans.Topo;

import java.util.List;

public interface CommentaireDAO {
    void add(Commentaire commentaire);
    List <Commentaire> read();
    int lastIDCom (List <Commentaire> com);
    List <Commentaire> readTopo(int id);
    List <Commentaire> readWay(int id);
    void delete (int id);
    void deleteTime (int id);
}
