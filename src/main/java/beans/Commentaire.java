package beans;

import java.sql.Timestamp;

public class Commentaire {

    private int account;
    private String title;
    private String commentary;
    private int comId;
    private int pageId;
    private int siteId;
    private int topoId;
    private Timestamp createAt;

    private Timestamp deleteAt;

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

    public Timestamp getDeleteAt() {
        return deleteAt;
    }
    public void setDeleteAt(Timestamp deleteAt) {
        this.deleteAt = deleteAt;
    }
}
