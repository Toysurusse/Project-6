package entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * RentTopo entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class RentTopo {

    /**
     * RentTopo id
     */
    private int id;

    /**
     * RentTopo account id
     */
    private int compte_id;

    /**
     * RentTopo topo id
     */
    private int topo_id;


    /**
     * RentTopo topo id
     */
    private String titleTopo;

    /**
     * RentTopo statut
     */

    /**
     * RentTopo date
     */
    private java.sql.Date date;

    private boolean statut;

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
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

    public String getTitleTopo() {
        return titleTopo;
    }

    public void setTitleTopo(String titleTopo) {
        this.titleTopo = titleTopo;
    }
}
