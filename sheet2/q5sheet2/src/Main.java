public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("SCE-123","programming methods");
        Course c2 = new Course();
        c2.setCourseCode("SCE-124");
        c2.setCourseName("DSA");

        Professor prof = new Professor("P101", "Dr. Khaled", "Computer Science");

        prof.addCourse(c1);
        prof.addCourse(c2);

        prof.displayProfessorInfo();

    }
}
