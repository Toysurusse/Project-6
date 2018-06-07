package dao.beans;


import entity.Commentaire;

import java.util.List;

/**
 * Interface of CommentaryDao to load info from DataBase
 *  @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public interface CommentaireDao {

    /**
     * add Commentaire
     * @param commentaire
     */
    void add(Commentaire commentaire);

    /**
     * List<Commentaire> of the dataBase
     * @return List<Commentaire>
     */
    List <Commentaire> read();

    /**
     * find the appropriate id
     * @param com
     * @return integer
     */
    int lastIDCom (List <Commentaire> com);

    /**
     * List<Commentaire> of the Topo from the dataBase
     * @return List<Commentaire>
     */
    List <Commentaire> readTopo(int id);

    /**
     * List<Commentaire> of the way from the dataBase
     * @param id
     * @return List<Commentaire>
     */
    List<Commentaire> readWay(int id);

    /**
     * List<Commentaire> of an account from the dataBase
     * @param id
     * @return List<Commentaire>
     */
    List <Commentaire> readCompteId(int id);

    /**
     * delete a commentary from an id
     * @param id
     */
    void delete (int id);

    /**
     * write commentary delete at
     * @param id
     */
    void deleteTime (int id);
}

