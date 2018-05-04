package entity;

public class Topo {

    private String nb;
    private String location;
    private String resume;

    public Topo (String id, String spot, String descript){
        this.nb=id;
        this.location = spot;
        this.resume= descript;
    }

    public String getNb() {
        return nb;
    }
    public String getLocation() {
        return location;
    }
    public String getResume() {
        return resume;
    }
}
