
//this is a programm of using switch fuctions........(from getting user inputs)
import java.util.Scanner;

public class Video17 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        int mark = n.nextInt();

        switch (mark) {

            case 75:
                System.out.println("Your mark is 75 and grade is A ");
                break;
            case 65:
                System.out.println("Your mark is 75 and grade is B ");
                break;
            case 55:
                System.out.println("Your mark is 55 and grade is C ");
                break;
            case 45:
                System.out.println("Your mark is 45 and grade is S ");
                break;
            case 35:
                System.out.println("Your mark is 35 and grade is F");
                break;
            default:
                System.out.println("Your mark is incorrent ");
                break;
        }
    }
}
