public class StudyProgramme {
    private String studyProgramme;
    private String studyDescription;
    private int semesterNumber;
    private int ITNnumber;

    public StudyProgramme(String studyProgramme, String studyDescription, int semesterNumber, int ITNnumber) {
        this.studyProgramme = studyProgramme;
        this.studyDescription = studyDescription;
        this.semesterNumber = semesterNumber;
        this.ITNnumber = ITNnumber;
    }

    public String getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public int getITNnumber() {
        return ITNnumber;
    }

    public void setITNnumber(int ITNnumber) {
        this.ITNnumber = ITNnumber;
    }
}
