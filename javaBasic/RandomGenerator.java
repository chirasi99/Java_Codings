
//this is a program of Random number generator......
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num;

        for (int i = 0; i < 10; i++) {
            num = rnd.nextInt(5);
            System.out.println(num);
        }
    }

}
