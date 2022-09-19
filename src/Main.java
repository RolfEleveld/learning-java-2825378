import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputtedNum = 1;
        while (inputtedNum != 0) {
            System.out.println("Pick a number between 1 and 10");
            Scanner scanner = new Scanner(System.in);
            inputtedNum = scanner.nextInt();

            if (inputtedNum < 5) {
                System.out.println("good luck");
            } else {
                System.out.println("Choose shoe");
            }
        }
    }
}