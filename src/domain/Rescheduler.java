package domain;

public class Rescheduler {
    private Room room;
    private Course course;

    public Rescheduler(Room room, Course course) {
        this.room = room;
        this.course = course;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
