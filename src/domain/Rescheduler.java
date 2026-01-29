package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rescheduler {

    // Takes the registration system as a data source and a crn as a target course for rescheduling
    public void reschedule(RegistrationSystem system, int crn, List<String> tags) {
        // Get eligible rooms and their schedule
        var rooms = system.findRoomsWithTags(tags);
        if (rooms.isEmpty()) {
            // Throw error
        }

        var roomSchedules = system.getRoomUnavailability();

        // Get all students in a course
        var course = system.getCourse(crn);

        var studentIDs = course.getEnrolledStudentIds();
        Student[] students = new Student[studentIDs.size()];

        int i = 0;
        for (String id : studentIDs) {
            students[i++] = system.getStudent(id);
        }

        // Tally all CRNs taken by students
        Map<Integer, Integer> crnTally = new HashMap<>();

        for (Student student : students) {
            var courses = student.getRegisteredCrns();
            for (Integer enrolledCrn : courses) {
                crnTally.put(enrolledCrn, crnTally.getOrDefault(enrolledCrn, 0) + 1);
            }
        }
    }
}