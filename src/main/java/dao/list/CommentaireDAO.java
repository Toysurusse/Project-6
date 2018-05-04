package dao.list;

import beans.Commentaire;
import beans.Topo;

import java.util.List;

public interface CommentaireDAO {
    void ajouter(Commentaire commentaire);
    List <Commentaire> lister();
}
