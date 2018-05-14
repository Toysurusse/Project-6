package dao.list;

import beans.Commentaire;
import beans.Topo;

import java.util.List;

public interface CommentaireDAO {
    void add(Commentaire commentaire);
    List <Commentaire> read();
    int lastIDCom (List <Commentaire> com);
}
