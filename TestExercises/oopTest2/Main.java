package oopTest2;

public class Main {
    public static void main(String[] args) {
        
        Human human1 = new Human("Menardo", "Male", 19, "Filipino");
        Human human2 = new Human("Andrei", "Male", 23, "Fil-Am");
        Human human3 = new Human("Reanne", "Female", 18, "Filipino");

        human1.humanData();
        System.out.println("");
        human2.humanData();
        System.out.println("");
        human3.humanData();
        System.out.println("");
        human2.humanAge();
    }
}
