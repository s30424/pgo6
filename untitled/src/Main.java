import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("Donald", "Vygi", "doe@wp.pl", "Warsaw, Zlota 44", "333-322-222", new Date(1980, 1, 1));
                StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);
        s.enrollStudent(it); 
        s.addGrade(5, "MAT");
        s.addGrade(4, "PPZ");
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}
