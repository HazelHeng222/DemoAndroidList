package sg.edu.ep.c346.id20029318.demoandroidlist;

public class AndroidVersion {

    private String name;
    private String ver;

    public AndroidVersion(String name, String ver) {
        this.name = name;
        this.ver = ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    @Override
    public String toString(){
        return name + ": " + ver;
    }


}
