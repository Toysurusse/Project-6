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
     *
     * @return int
     */
    private int id;

    /**
     * Information title
     *
     * @return String
     */
    private String title;

    /**
     * Information Information
     *
     * @return String
     */
    private String info;

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
}
