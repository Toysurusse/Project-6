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
     *
     * @return int
     */
    private int identifiant;

    /**
     * Site location
     *
     * @return String
     */
    private String location;

    /**
     * Site way
     *
     * @return String
     */
    private String way;

    /**
     * Site hight
     *
     * @return String
     */
    private String height;

    /**
     * Site hardness way
     *
     * @return String
     */
    private String hardness;

    /**
     * Site number point to climb
     *
     * @return String
     */
    private String points_nb;

    /**
     * Site topo id
     *
     * @return int
     */
    private int topos;

    /**
     * Site account id
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
