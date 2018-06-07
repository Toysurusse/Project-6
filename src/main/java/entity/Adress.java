package entity;

/**
 * Adress entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Adress {

    /**
     * Adress id
     *
     * @return int
     */
    private int adressId;

    /**
     * Adress nbStreet
     *
     * @return int
     */
    private int nbStreet;

    /**
     * Adress street
     *
     * @return String
     */
    private String street;

    /**
     * Adress postalCode
     *
     * @return int
     */
    private int postalCode;

    /**
     * Adress city
     *
     * @return String
     */
    private String city;

    /**
     * Adress code
     *
     * @return String
     */
    private String code;

    /**
     * Adress infoSub
     *
     * @return String
     */
    private String infoSub;

    /**
     * Adress Principal or not
     *
     * @return boolean
     */
    private boolean principalAdress;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public int getNbStreet() {
        return nbStreet;
    }

    public void setNbStreet(int nbStreet) {
        this.nbStreet = nbStreet;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getInfoSub() {
        return infoSub;
    }

    public void setInfoSub(String infoSub) {
        this.infoSub = infoSub;
    }

    public boolean getPrincipalAdress() {
        return principalAdress;
    }

    public void setPrincipalAdress(boolean principalAdress) {
        this.principalAdress = principalAdress;
    }
}
