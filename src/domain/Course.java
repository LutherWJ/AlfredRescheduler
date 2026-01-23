package domain;

public class Course {
    private String department;
    private int courseNum;
    private int crn;
    private int startTime;
    private int endTime;
    private Weekday meetingDays;

    public Course() {
    }

    public Course(String department, int courseNum, int crn, int startTime, int endTime, String meetingDays) {
        this.department = department;
        this.courseNum = courseNum;
        this.crn = crn;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingDays = meetingDays;
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

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getMeetingDays() {
        return meetingDays;
    }

    public void setMeetingDays(String meetingDays) {
        this.meetingDays = meetingDays;
    }
}
