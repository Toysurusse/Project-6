package resources.dao.beans;


import entity.Commentaire;

import java.util.List;

public interface CommentaireDao {
    void add(Commentaire commentaire);
    List <Commentaire> read();
    int lastIDCom (List <Commentaire> com);
    List <Commentaire> readTopo(int id);
    List<Commentaire> readWay(int id);
    List <Commentaire> readCompteId(int id);
    void delete (int id);
    void deleteTime (int id);
}

