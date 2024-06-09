import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Student {
    private String fname;
    private String lname;
    private String email;
    private String adres;
    private String phoneNumber;
    private Date dateOfBirth;
    private String studentStatus;
    private String indexNumber;
    private int currentSemester;
    private int studentITNnumber;
    private StudyProgramme currentStudyPrograme;
public HashMap<Integer, String> grades = new HashMap<>();

    public static ArrayList<Student> students = new ArrayList<Student>();

    public Student(String fname, String lname, String email, String adres, String phoneNumber, Date dateOfBirth) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.currentSemester = 1;
        Student.students.add(this);
        this.indexNumber = "s" + students.size();
    }

    public void enrollStudent(StudyProgramme stProgramme){
        this.currentStudyPrograme = stProgramme;
        this.studentStatus = "Student";
    }
    public void addGrade(int grade, String subject){
        grades.put(grade, subject);
    }
    public void promoteNextSemester(){
        if (currentSemester < currentStudyPrograme.getSemesterNumber() && studentITNnumber < currentStudyPrograme.getITNnumber()) {
            if (currentSemester < currentStudyPrograme.getSemesterNumber()) {
                currentSemester++;
            } else {
                studentStatus = "Absolwent";
            }
        } else {
            setCurrentSemester(currentStudyPrograme.getSemesterNumber());
            setStudentITNnumber(0);
        }
}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getStudentITNnumber() {
        return studentITNnumber;
    }

    public void setStudentITNnumber(int studentITNnumber) {
        this.studentITNnumber = studentITNnumber;
    }

    public StudyProgramme getCurrentStudyPrograme() {
        return currentStudyPrograme;
    }

    public void setCurrentStudyPrograme(StudyProgramme currentStudyPrograme) {
        this.currentStudyPrograme = currentStudyPrograme;
    }
}
