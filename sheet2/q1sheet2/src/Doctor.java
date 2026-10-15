public class Doctor {
    private int ID;
    private String fullName;
    private int age;
    private String gender;
    private String medicalSpecialty;
    private int yearsOfExperience;

    public Doctor(int ID, String fullName, int age, String gender, String medicalSpecialty, int yearsOfExperience) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.medicalSpecialty = medicalSpecialty;
        this.yearsOfExperience = yearsOfExperience;

    }
    public  int getID() {
        return ID;

    }
    public void setID(int ID) {
        this.ID = ID;

    }
    public String getFullName() {
        return fullName;

    }
    public void setFullName(String fullName) {
        this.fullName = fullName;

    }
    public int getAge() {
        return age;

    }
    public void setAge(int age) {
        this.age = age;

    }
    public String getGender() {
        return gender;

    }
    public void setGender(String gender) {
        this.gender = gender;

    }
    public String getMedicalSpecialty() {
        return medicalSpecialty;

    }
    public void setMedicalSpecialty(String medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;

    }
    public int getYearsOfExperience() {
        return yearsOfExperience;

    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;

    }
    @Override
    public String toString() {
        return "Doctor{" + "ID=" + ID + ", fullName=" + fullName + ", age=" + age+"}";
    }
}
