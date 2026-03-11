package Week03.Plymorphism.Downcasting;



public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void climb() {
        System.out.println("I can climb trees");
    }
}

