package Week09.Bounded.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundEx {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1); // Allowed: Integer is within bounds
        list.add(2); // Allowed: Integer is within bounds
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers); // Works fine because Number is a superclass of Integer

        List<Object> objects = new ArrayList<>();
        addNumbers(objects); // Works fine because Object is also a superclass of Integer

        List<Double> doubles = new ArrayList<>();
        //addNumbers(doubles); // Compilation error
    }


}
