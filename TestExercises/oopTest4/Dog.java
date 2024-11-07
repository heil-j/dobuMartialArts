package oopTest4;

public class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Dog says *woof wooof*");
    }
    @Override
    public void chase() {
        System.out.println("The Dog starts to chase the Cat");
    }
}
