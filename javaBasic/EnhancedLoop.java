//thiss is a example of EnhancedLoop in java....

public class EnhancedLoop {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int tot = 0;

        for (int x : num) {
            tot += x;
        }
        System.out.println("Total Amount of the array :" + tot);
    }

}
