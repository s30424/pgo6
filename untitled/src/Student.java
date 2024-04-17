import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String fname;
    private String lname;
    private String email;
    private String adres;
    private Date dataurodzenia;
    private String mobnumber;
    private String numerS;
    static ArrayList<Student>students = new ArrayList<Student>();

    public Student (String fname, String lname, String email, String adres, String mobnumber, Date dataurodzenia){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adres = adres;
        this.mobnumber = mobnumber;
        this.dataurodzenia = dataurodzenia;
        this.numerS = "s" + students.size();
        Student.students.add(this);
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAdres() {
        return adres;
    }

    public Date getDataurodzenia() {
        return dataurodzenia;
    }

    public String getMobnumber() {
        return mobnumber;
    }

    public String getNumerS() {
        return numerS;
    }

    public void setNumerS(String numerS) {
        this.numerS = numerS;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setDataurodzenia(Date dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber;
    }

    public void enrollStudent(StudyProgramme it) {
    }

    public void addGrade(int i, String pgo) {
    }
}
