
//this is a program of getting input marks and using if else function with logical operators
import java.util.Scanner;

public class Video15Part2 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter Maths Mark : ");
        int Math = marks.nextInt();
        System.out.println("Enter Sinhala Mark : ");
        int Sinhala = marks.nextInt();

        if (Math >= 50 && Sinhala >= 75) { // can used other operators ( > , < , >= , <= , == , != )
            System.out.println("Pass");
        } else {
            System.out.print("Fail");
        }
        System.out.print("\n");
        if (Math >= 50 || Sinhala >= 75) { // can used other operators ( > , < , >= , <= , == , != )
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}
