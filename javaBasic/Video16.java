
//this is a programm of using if, else if, and else fuctions........(from getting user inputs)
import java.util.Scanner;

public class Video16 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        int mark = n.nextInt();

        if (mark >= 75) {
            System.out.println("Grade A");
        } else if (mark >= 65) {
            System.out.println("Grade B");
        } else if (mark >= 55) {
            System.out.println("Grade C");
        } else if (mark >= 45) {
            System.out.println("Grade S");
        } else {
            System.out.println("Grade F");
        }
    }
}