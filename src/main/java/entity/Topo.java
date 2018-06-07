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
     *
     * @return int
     */

    private int identifiant;

    /**
     * Topo location
     *
     * @return String
     */
    private String location;

    /**
     * Topo resume
     *
     * @return String
     */
    private String resume;

    /**
     * Topo account id
     *
     * @return int
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
