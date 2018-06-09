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
     */
    private int adressId;

    /**
     * Adress nbStreet
     */
    private int nbStreet;

    /**
     * Adress street
     */
    private String street;

    /**
     * Adress postalCode
     */
    private int postalCode;

    /**
     * Adress city
     */
    private String city;

    /**
     * Adress code
     */
    private String code;

    /**
     * Adress infoSub
     */
    private String infoSub;

    /**
     * Adress Principal or not
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
