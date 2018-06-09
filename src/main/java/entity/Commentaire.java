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
     */
    private int account;

    /**
     * Commentaire title
     */
    private String title;

    /**
     * Commentaire commentaire
     */
    private String commentary;

    /**
     * Commentaire idCommentaire
     */
    private int comId;

    /**
     * Commentaire pageId
     */
    private int pageId;

    /**
     * Commentaire SiteId
     */
    private int siteId;

    /**
     * Commentaire topoId
     */
    private int topoId;

    /**
     * Commentaire create at TimeStamp
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
