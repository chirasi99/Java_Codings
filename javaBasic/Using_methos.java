//this is a program of using methos in java....

public class Using_methos { // class name
    public static void main(String[] args) { // main class
        firstMethod(); // calling method

        Using_methos ObjectSecond = new Using_methos(); /*
                                                         * creating object as ObjectSecond using class name of the java
                                                         * because we have to call non-static function
                                                         */

        ObjectSecond.secondMethod(); // calling secondMethod
    }

    public static void firstMethod() {
        System.out.println("This is firstMethod");
    }

    public void secondMethod() { // creating non-static function
        System.out.println("This is secondMethod");
    }

}
