package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationSystem {
    private Map<Integer, Course> courses;
    private Map<String, Student> students;
    private List<Room> rooms;

    public RegistrationSystem() {
        this.courses = new HashMap<>();
        this.students = new HashMap<>();
        this.rooms = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getCrn(), course);
    }

    public Course getCourse(int crn) {
        return courses.get(crn);
    }

    public Map<Integer, Course> getAllCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public Map<String, Student> getAllStudents() {
        return students;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
