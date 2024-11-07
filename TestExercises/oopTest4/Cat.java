package oopTest4;

public class Cat extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Cat says *woof wooof*");
    }
    @Override
    public void chase() {
        System.out.println("The  cat is chasing the mouse");
    }
}
