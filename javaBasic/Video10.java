//This is a program of get user two numbers and add them afterwards, display them....

import java.util.Scanner;

public class Video10 {
    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        double no1, no2, anw;

        System.out.println("Enter your First Number : ");
        no1 = sun.nextInt();

        System.out.println("Enter your Second Number : ");
        no2 = sun.nextDouble();

        anw = no1 + no2;
        System.out.println("\nSum of the results : " + anw + "\n\n");

    }
}
