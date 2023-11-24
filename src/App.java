import main.java.com.school_management_system.inplementatiosService.AcademicServiceI;
import main.java.com.school_management_system.service.AcademicManagement;
import main.java.com.school_management_system.user.Course;
import main.java.com.school_management_system.user.Student;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        AcademicServiceI academicservice = new AcademicManagement();

        LocalDate birthday1= LocalDate.of(2000, 10, 10);
        LocalDate birthday2= LocalDate.of(1997, 5, 8);

        Student kid1 = new Student(1, "alfonsito", "circular", birthday1, "active");
        Student kid2 = new Student(1, "Lily", "Whallace", birthday2, "active");

        Course class1 = new Course(1, "Art", "art class for specials", 8, "optional");
        Course class2 = new Course(1, "Spatial Maths", "basic math for universal calculations", 16, "obligatory");


        academicservice.addStudent(kid1);
        academicservice.addStudent(kid2);

        academicservice.addCourse(class1);
        academicservice.addCourse(class2);

        academicservice.suscribeStudentToACourse(kid2, class2);
        academicservice.suscribeStudentToACourse(kid1, class1);

        academicservice.showStudentPerCourse();

        academicservice.unrollStudent(kid1, class1);

        academicservice.showStudentPerCourse();

    }
}