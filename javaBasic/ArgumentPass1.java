public class ArgumentPass1 {
    public static int total = 0;

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Sum of the values are : " + secondMethode(num));

    }

    public static int secondMethode(int x[]) {

        for (int y : x) {
            total += y;
        }
        return total;
    }
}
