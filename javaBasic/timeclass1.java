//this is a program of time counting ....

public class timeclass1 {
    public static void main(String[] args) {
        timeclass2 timeobject = new timeclass2();
        System.out.println(timeobject.standtime());

        timeobject.settime(13, 25, 21);
        System.out.println(timeobject.standtime());

    }

}
