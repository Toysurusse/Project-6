package entity;

/**
 * Site entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Site {

    /**
     * Site identifiant
     */
    private int identifiant;

    /**
     * Site location
     */
    private String location;

    /**
     * Site way
     */
    private String way;

    /**
     * Site hight
     */
    private String height;

    /**
     * Site hardness way
     */
    private String hardness;

    /**
     * Site number point to climb
     */
    private String points_nb;

    /**
     * Site topo id
     */
    private int topos;

    /**
     * Site account id
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

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public String getPoints_nb() {
        return points_nb;
    }

    public void setPoints_nb(String points_nb) {
        this.points_nb = points_nb;
    }

    public int getTopos() {
        return topos;
    }

    public void setTopos(int topos) {
        this.topos = topos;
    }

    public void setId(int identifiant) {
        this.identifiant = identifiant;
    }

}
