//this is a program of using if else function with logical operators

public class Video15 {
    public static void main(String[] args) {
        int Math = 56;
        int Sinhala = 65;
        if (Math >= 50 && Sinhala >= 75) { // can used other operators ( > , < , >= , <= , == , != )
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if (Math >= 50 || Sinhala >= 75) { // can used other operators ( > , < , >= , <= , == , != )
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
