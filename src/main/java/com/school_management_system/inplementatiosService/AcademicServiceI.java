package main.java.com.school_management_system.inplementatiosService;

import main.java.com.school_management_system.user.Course;
import main.java.com.school_management_system.user.Student;

public interface AcademicServiceI {

    void addStudent(Student student);

    void addCourse(Course course);

    void suscribeStudentToACourse(Student student, Course course);

    void showStudentPerCourse();

    void unrollStudent(Student student, Course course);
}
