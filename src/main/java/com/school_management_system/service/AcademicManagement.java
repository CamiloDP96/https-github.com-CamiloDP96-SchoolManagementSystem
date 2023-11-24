package main.java.com.school_management_system.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.school_management_system.user.Course;
import main.java.com.school_management_system.user.Student;


public class AcademicManagement {
    private List<Student> studentsList;
    private List<Course> coursesList;
    private Map<Course, List<Student>> studentPerCourse;

    public AcademicManagement(){
        studentsList = new ArrayList<>();
        coursesList = new ArrayList<>();
        studentPerCourse = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
    public void addCourse(Course course){
        coursesList.add(course);
        studentPerCourse.put(course, new ArrayList<>());
    }
    public void suscribeStudentToACourse(Student student, Course course){
        if (studentsList.contains(student) && coursesList.contains(course)) {
            List<Student> enrolledStudents = studentPerCourse.get(course);
            enrolledStudents.add(student);
            studentPerCourse.put(course, enrolledStudents);
        } else {
            System.out.println("Student or Course not found");
        }
    }
    public void showStudentPerCourse(){
        for(Map.Entry<Course, List<Student>> entry: studentPerCourse.entrySet()){
            Course course = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Studentes enrolled in course " + course.getName());
            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getLastName() + "/n");
            }
        }
    }
}
