public class Doctor {
    private int DoctorID;
   private String DoctorName;
   private int age;
   private char DoctorSex;
   private String DoctorSpeciality;
   private String assignPatient;

    public Doctor(int doctorID, String doctorName, int age, char doctorSex, String doctorSpeciality, String assignPatient) {
        DoctorID = doctorID;
        DoctorName = doctorName;
        this.age = age;
        DoctorSex = doctorSex;
        DoctorSpeciality = doctorSpeciality;
        this.assignPatient = assignPatient;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int doctorID) {
        DoctorID = doctorID;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getDoctorSex() {
        return DoctorSex;
    }

    public void setDoctorSex(char doctorSex) {
        DoctorSex = doctorSex;
    }

    public String getDoctorSpeciality() {
        return DoctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        DoctorSpeciality = doctorSpeciality;
    }

    public String getAssignPatient() {
        return assignPatient;
    }

    public void setAssignPatient(String assignPatient) {
        this.assignPatient = assignPatient;
    }
}
