import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student1 =new Student(1001,"ahmed ashraf gaber",3,3.8);
        Teacher teacher1 =new Teacher( 2001,"MR: Ahmed",40, "male", "programming methods");

        System.out.println(student1.toString());
        System.out.println(teacher1.toString());

    }
}
