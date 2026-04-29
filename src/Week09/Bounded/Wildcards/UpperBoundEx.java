package Week09.Bounded.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundEx {

    public static void main(String[] args) {

        Number n= 5.0;

        List<Double> numbers = new ArrayList();
        numbers.add(1.1);
        numbers.add(2.2);
        numbers.add(3.0);
       // sum(numbers);
    }


    public static double sum(List<Number> list){
        double sum = 0;

        //list.add(3.5);

        for(Number n : list){
            sum += n.doubleValue();
        }

        System.out.println(sum);
        return sum;
    }

}
