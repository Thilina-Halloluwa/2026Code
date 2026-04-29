package Week09.Intro;

import java.util.ArrayList;
import java.util.List;

public class New {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
       // list.add(123); //  Compile-time error

        String str = list.get(0);  // No cast needed


    }
}
