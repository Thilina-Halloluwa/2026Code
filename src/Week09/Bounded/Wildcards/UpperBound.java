package Week09.Bounded.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        List<? extends Number> nums = new ArrayList<Integer>();

        Number n = nums.get(0); // OK: read as Number
        //nums.add(10);           // compile-time error

    }
}
