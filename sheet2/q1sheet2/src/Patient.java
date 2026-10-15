public class Patient {
    private int ID;
    private String fullName;
    private int age;
    private String gender;
    private String illness;
    public Patient(int ID, String fullName, int age, String gender, String illness) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.illness = illness;
    }
    public int getID() {
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
    public String getIllness() {
        return illness;

    }
    public void setIllness(String illness) {
        this.illness = illness;

    }
    @Override
    public String toString() {
        return "Patient { ID :"+ ID + "name: "+ fullName + "age: "+age+"gender: "+gender+"illness: "+illness+"}";

    }

}
