package Week09.Intro.without;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Old {
    public static void main(String[] args) {
        List list = new ArrayList();


        list.add("Hello");
        list.add(123);  // allowed
        list.add(new Date());  // allowed

        String str = (String) list.get(0); // OK
        Integer num = (Integer) list.get(1); // OK
        Date date = (Date) list.get(2); // OK


        Integer num1 = (Integer) list.get(2);

    }
}
