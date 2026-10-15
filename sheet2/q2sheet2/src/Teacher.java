public class Teacher {
    private int ID;
    private String fullName;
    private int age;
    private String gender;
    private String subject;

    public  Teacher(int ID, String fullName, int age, String gender, String subject) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.subject = subject;

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
    public String getSubject() {
        return subject;

    }
    public void setSubject(String subject) {
        this.subject = subject;

    }
    @Override
    public String toString() {
        return "Teacher{" + "ID=" + ID + ", fullName=" + fullName + ", age=" + age+"}";
    }
}
