public class Nurse {

    private  String ID;
    private String fullName;
    private String age;
    private String gender;
    private String department;
    private String workShift;

    public  Nurse(String ID, String fullName, String age, String gender, String department, String workShift) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.workShift = workShift;

    }
    public String getID() {
        return ID;

    }
    public void setID(String ID) {
        this.ID = ID;

    }
    public String getFullName() {
        return fullName;

    }
    public void setFullName(String fullName) {
        this.fullName = fullName;

    }
    public String getAge() {
        return age;

    }
    public void setAge(String age) {
        this.age = age;

    }
    public String getGender() {
        return gender;

    }
    public void setGender(String gender) {
        this.gender = gender;

    }
    public String getDepartment() {
        return department;

    }
    public void setDepartment(String department) {
        this.department = department;

    }
    public String getWorkShift() {
        return workShift;

    }
    public void setWorkShift(String workShift) {
        this.workShift = workShift;

    }
    @Override
    public String toString() {
        return "Nurse{" + "ID=" + ID + ", fullName=" + fullName + ", age=" + age +"}";

    }

}
