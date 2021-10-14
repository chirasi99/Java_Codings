public class Constructor2 {
    private String frdName;

    public Constructor2(String Name) {
        frdName = Name;
    }

    public String setName() {
        return frdName;
    }

    public void say() {
        System.out.println("Your Friend Name is " + setName());
    }
}
