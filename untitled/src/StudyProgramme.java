public class StudyProgramme {
    private String nazwa;
    private String suma;
    private int semestr;
    private int itn;
public StudyProgramme(String nazwa, String suma, int semestr, int itn){
    this.nazwa = nazwa;
    this.suma = suma;
    this.semestr = semestr;
    this.itn = itn;
}

    public String getNazwa() {
        return nazwa;
    }

    public String getSuma() {
        return suma;
    }

    public int getSemestr() {
        return semestr;
    }

    public int getItn() {
        return itn;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    public void setItn(int itn) {
        this.itn = itn;
    }
}

