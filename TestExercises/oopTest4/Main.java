package oopTest4;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        Animal [] animal = {dog, cat, mouse} ;

        for (Animal x : animal ) {
            x.makeSound();
        }
        for (Animal x : animal) {
            x.chase();
        }
    }
}
