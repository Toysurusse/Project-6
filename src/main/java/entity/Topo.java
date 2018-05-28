package entity;

public class Topo {

    private int identifiant;
    private String location;
    private String resume;

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
