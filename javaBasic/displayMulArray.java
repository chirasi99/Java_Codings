//this is a program of display multiple array......
public class displayMulArray {
    public static void main(String[] args) {
        int shan[][] = { { 1, 2, 3, 4 }, { 12 }, { 3, 4, 5 } };

        for (int row = 0; row < shan.length; row++) {
            for (int col = 0; col < shan[row].length; col++) {
                System.out.print(shan[row][col] + "\t");
            }
            System.out.println("");
        }

    }
}
