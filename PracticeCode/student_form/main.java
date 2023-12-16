package student_form;
import java.util.*;


public class main {
    public static void main(String[] args) {
        college college = new college("ACHS");
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter sudentName ");
        String studentName = scanner.nextLine();

        student student = new student(college.collegeName, studentName);

        System.out.println(" the student is "+student.studentName+" studies in "+student.collegeName);
    }
}
