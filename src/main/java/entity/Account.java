package entity;

/**
 * Account entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Account {


    /**
     * Account id
     * return in
     */
    private int id;

    /**
     * Account name
     * return String
     */
    private String name;

    /**
     * Account firstName
     * return String
     */
    private String firstName;

    /**
     * Account pseudo
     * return String
     */
    private String pseudo;

    /**
     * Account password
     * return String
     */
    private String password;

    /**
     * Account sex
     * return String
     */
    private String sex;

    /**
     * Account adressid
     * return in
     */
    private int adressId;

    /**
     * Account accessLevel
     * return in
     */
    private int accessLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adresseId) {
        this.adressId = adresseId;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}
