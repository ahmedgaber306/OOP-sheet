public class Student {

    private int ID;
    private String fullName;
    private int gradeLevel;
    private double gpa;

    public  Student(int ID, String fullName, int gradeLevel, double gpa) {
        this.ID = ID;
        this.fullName = fullName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;

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
    public int getGradeLevel() {
        return gradeLevel;

    }
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;

    }
    public double getGpa() {
        return gpa;

    }
    public void setGpa(double gpa) {
        this.gpa = gpa;

    }
    @Override

    public String toString() {
        return "Student { ID:" + ID + ", fullName:" + fullName + ", gradeLevel:" + gradeLevel + "}";
    }
}
