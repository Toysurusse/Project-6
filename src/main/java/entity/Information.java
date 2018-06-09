package entity;

/**
 * Information entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

public class Information {

    /**
     * Information id
     */
    private int id;

    /**
     * Information title
     */
    private String title;

    /**
     * Information Information
     */
    private String info;

    /**
     * Information account id
     */
    private int account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
