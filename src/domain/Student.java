package domain;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String fname;
    private String lname;
    private List<Integer> registeredCrns;

    public Student(String id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.registeredCrns = new ArrayList<>();
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

    public List<Integer> getRegisteredCrns() {
        return registeredCrns;
    }

    public void setRegisteredCrns(List<Integer> registeredCrns) {
        this.registeredCrns = registeredCrns;
    }
}
