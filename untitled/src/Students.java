import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Students {
    private int currentSemester;
    public static void promoteAllStudents() {
        for(int i = 0; i < Student.students.size(); i++) {
            Student.students.get(i).promoteNextSemester();
    }
}
    public static void displayInfoAboutAllStudents() {
        for(int i = 0; i<Student.students.size(); i++) {
            System.out.println("imie: "+ Student.students.get(i).getFname());
            System.out.println("nazwisko: "+ Student.students.get(i).getLname());
            System.out.println("adres email: "+ Student.students.get(i).getEmail());
            System.out.println("adres zamieszkania: "+ Student.students.get(i).getAdres());
            System.out.println("numer telefonu: "+ Student.students.get(i).getPhoneNumber());
            System.out.println("data urodzenia: "+ Student.students.get(i).getDateOfBirth());
            System.out.println("numer indeksu: "+ Student.students.get(i).getIndexNumber());
            System.out.println("status studenta: "+ Student.students.get(i).getStudentStatus());
            System.out.println("aktualny semestr: "+ Student.students.get(i).getCurrentSemester());
            System.out.println("program studiow: "+ Student.students.get(i).getCurrentStudyPrograme());
    }
}
}
