package domain;

public class Professor {
    private String id;
    private String fname;
    private String lname;
    private Course[] courses;

    public Professor(String id, String fname, String lname, Course[] courses) {
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}