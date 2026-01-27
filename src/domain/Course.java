package domain;

public class Course {
    private String department;
    private int courseNum;
    private int crn;
    private int startTime;
    private int endTime;
    private Weekday[] meetingDays;
    private Student[] students;
    private Room room;

    public Course(String department, int courseNum, int crn, int startTime, int endTime, Weekday[] meetingDays, Room room) {
        this.department = department;
        this.courseNum = courseNum;
        this.crn = crn;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingDays = meetingDays;
        this.room = room;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Weekday[] getMeetingDays() {
        return meetingDays;
    }

    public void setMeetingDays(Weekday[] meetingDays) {
        this.meetingDays = meetingDays;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
