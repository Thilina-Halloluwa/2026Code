package Week03.Plymorphism.SubType;

public class TestSubtypePolymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        performAnimalSound(animal);
    }

    public static void performAnimalSound(Animal animal) {
        animal.makeSound();
    }
}