import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String profId;
    private String name;
    private String department;
    private List<Course> courses;

    public Professor(String profId, String name, String department) {
        this.profId = profId;
        this.name = name;
        this.department = department;
        this.courses= new ArrayList<Course>();

    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }


    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayProfessorInfo() {
        System.out.println("Prof ID: " + profId + " | Name: " + name + " | Dept: " + department);
        System.out.println("--- Courses Taught ---");
        if (courses.isEmpty()) {
            System.out.println("No courses assigned yet.");
        } else {
            for (Course c : courses) {
                c.displayCourseDetails(); // Calls display method inside Course class
            }
        }
    }
}
