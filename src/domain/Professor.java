package domain;

public class Professor {
    private String id;
    private String fname;
    private String lname;
    private String[] courses;

    public Professor(String id, String fname, String lname, String[] courses) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fname;
    }

    public void setfName(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}