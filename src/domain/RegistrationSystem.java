package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationSystem {
    private Map<Integer, Course> courses;
    private Map<String, Student> students;
    private Map<String, Room> rooms;

    public RegistrationSystem() {
        this.courses = new HashMap<>();
        this.students = new HashMap<>();
        this.rooms = new HashMap<>();
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
        String key = room.getBuildingAddress() + "-" + room.getRoomNumber();
        rooms.put(key, room);
    }

    public Room getRoom(String buildingAddress, int roomNumber) {
        return rooms.get(buildingAddress + "-" + roomNumber);
    }

    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms.values());
    }

    public List<Room> findRoomsWithTags(List<String> requiredTags) {
        List<Room> matchingRooms = new ArrayList<>();
        for (Room room : rooms.values()) {
            if (room.getTags() != null) {
                List<String> roomTags = Arrays.asList(room.getTags());
                if (roomTags.containsAll(requiredTags)) {
                    matchingRooms.add(room);
                }
            }
        }
        return matchingRooms;
    }

    public Map<Room, List<MeetingTime>> getRoomUnavailability() {
        Map<Room, List<MeetingTime>> unavailability = new HashMap<>();

        for (Course course : courses.values()) {
            Room room = course.getRoom();
            if (room != null) {
                unavailability.putIfAbsent(room, new ArrayList<>());
                
                if (course.getMeetingDays() != null) {
                    for (Weekday day : course.getMeetingDays()) {
                        unavailability.get(room).add(new MeetingTime(course.getStartTime(), course.getEndTime(), day));
                    }
                }
            }
        }
        return unavailability;
    }
}
