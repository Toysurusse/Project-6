package entity;

/**
 * Commentaire entity
 *
 * @author Le Boiteux Maximilien
 * @version 1.0 Beta
 */

import java.sql.Timestamp;

public class Commentaire {

    /**
     * Commentaire accountid
     * return int
     */
    private int account;

    /**
     * Commentaire title
     * return String
     */
    private String title;

    /**
     * Commentaire commentaire
     * return String
     */
    private String commentary;

    /**
     * Commentaire idCommentaire
     * return int
     */
    private int comId;

    /**
     * Commentaire pageId
     * return int
     */
    private int pageId;

    /**
     * Commentaire SiteId
     * return int
     */
    private int siteId;

    /**
     * Commentaire topoId
     * return int
     */
    private int topoId;

    /**
     * Commentaire create at TimeStamp
     * return TimeStamp
     */
    private Timestamp createAt;

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getTopoId() {
        return topoId;
    }

    public void setTopoId(int topoId) {
        this.topoId = topoId;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
}
