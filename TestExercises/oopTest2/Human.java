package oopTest2;

public class Human {
    
    private String name;
    private String gender;
    private int age;
    private String nationality;
    private static int count = 0;
    private int humanNumber;


    Human(String name,String gender,int age,String nationality) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        count++;
        this.humanNumber = count;
    }
    void humanData() {
        System.out.println("This is human" + humanNumber + " data");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }
    void humanAge() {
        System.out.println(this.name + " is already " + this.age +  " years old");
    }
}

