public class Argumnet3 {
    public static void main(String[] args) {
        int sum = secondMethode(4, 2, 5, 6, 8, 4);
        System.out.println("this is total of given numbers : " + sum);
    }

    public static int secondMethode(int... numbers) {
        int total = 0;
        for (int y : numbers) {
            total += y;
        }
        return total;
    }

}
