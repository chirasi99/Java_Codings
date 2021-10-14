
//this is program of getting user two inputs and show their sum ........
import java.util.Scanner;

public class ArgumentPass2 {
    public static int total = 0;

    public static void main(String[] args) {
        Scanner sun = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int first = sun.nextInt();
        System.out.println("Enter Second Number : ");
        int second = sun.nextInt();
        sum(first, second);
        System.out.println("Sum of the values are : " + sum(first, second));

    }

    public static int sum(int a, int b) {

        int anw = a + b;
        return anw;
    }

}
