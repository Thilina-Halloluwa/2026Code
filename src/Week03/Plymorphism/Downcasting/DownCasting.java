package Week03.Plymorphism.Downcasting;

public class DownCasting {
    public static void main(String[] args) {

        Animal myAnimal = new Dog();// upcasting
        //Animal myAnimal2 = new Dog();// upcasting

//        Cat myCat = (Cat) myAnimal; // Downcasting
//
//        myCat.climb();

        if (myAnimal instanceof Cat) {

            Cat myCat = (Cat) myAnimal; // Downcasting

            myCat.climb(); // access methods specific to cat
        }
    }
}
