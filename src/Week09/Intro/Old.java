package Week09.Intro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Old {
    public static void main(String[] args) {
        List list = new ArrayList();


        list.add("Hello");
        list.add(123);
        list.add(new Date());

        String str = (String) list.get(0);
        Integer num = (Integer) list.get(1);
        Date date = (Date) list.get(2);


        Integer num1 = (Integer) list.get(2);

    }
}
