package entity;

import java.sql.Timestamp;

/**
 * RentTopo entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class RentTopo {

    /**
     * RentTopo id
     *
     * @return int
     */
    private int id;

    /**
     * RentTopo account id
     *
     * @return int
     */
    private int compte_id;

    /**
     * RentTopo topo id
     *
     * @return int
     */
    private int topo_id;

    /**
     * RentTopo statut
     *
     * @return boolean
     */
    private boolean statut;

    /**
     * RentTopo date
     *
     * @return TimeStamp
     */
    private Timestamp date;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompte_id() {
        return compte_id;
    }

    public void setCompte_id(int compte_id) {
        this.compte_id = compte_id;
    }

    public int getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(int topo_id) {
        this.topo_id = topo_id;
    }

    public boolean getStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }


}
