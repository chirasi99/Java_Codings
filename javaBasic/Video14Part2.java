//This is sample program of getting user inputs and using if function with comparison operators..........

import java.util.Scanner;

public class Video14Part2 {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num == 5) { // can used other operators ( > , < , >= , <= , == , != )
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
