public class MultipleArray {
    public static void main(String[] args) {
        int shan[][] = { { 1, 2, 3, 4 }, { 12 }, { 3, 4, 5 } };
        int num[][] = { { 1, 2, 3, 5 }, { 3, 4, 5, 6, }, { 7, 8, 9, 7 } };

        System.out.println("First Multiple Array : ");
        Display(shan);
        System.out.println("Second Multiple Array : ");
        Display(num);

    }

    public static void Display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + "\t");
            }
            System.out.println("");
        }
    }

}
