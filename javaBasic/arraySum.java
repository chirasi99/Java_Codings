public class arraySum {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int tot = 0;

        for (int i = 0; i < num.length; i++) {
            tot += num[i];
        }
        System.out.println("Total Amount of the array :" + tot);
    }
}