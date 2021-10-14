public class Video27p2 {

    private String frdName;

    public void getName(String Name) {
        frdName = Name;
    }

    public String setName() {
        return frdName;
    }

    public void say() {
        System.out.println("Your Friend Name is " + setName());
    }

}
