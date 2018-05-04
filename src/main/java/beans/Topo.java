package beans;

public class Topo {

    private String id;


    private String location;
    private String resume;

    public Topo (){
        this.id=id;
        this.location = location;
        this.resume= location;
    }

    public String getID() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public String getResume() {
        return resume;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
}
