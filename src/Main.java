import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Harry";
        String studentLastName = "Belafonte";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        System.out.println("What should GPA be?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        
    }
}
