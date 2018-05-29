package entity;

public class Topo {

    private int identifiant;
    private String location;
    private String resume;
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
    public String getResume() {
        return resume;
    }

    public void setId(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
}
