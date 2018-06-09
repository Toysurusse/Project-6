package entity;

/**
 * Topo entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Topo {

    /**
     * Topo id
     */

    private int identifiant;

    /**
     * Topo location
     */
    private String location;

    /**
     * Topo resume
     */
    private String resume;

    /**
     * Topo account id
     */
    private int accountid;

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setId(int identifiant) {
        this.identifiant = identifiant;
    }
}
