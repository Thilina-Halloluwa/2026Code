package Week09.Intro.WhyEx1;

import java.util.ArrayList;
import java.util.List;

public class MainWithout {
    public static void main(String[] args) {
        List cart = new ArrayList();

        cart.add(new Product("Laptop"));

        //  Adding a String by accident
        cart.add("Not a product");

        for (int i = 0; i < cart.size(); i++) {
            // Need to cast manually
            Product p = (Product) cart.get(i);
            System.out.println(p.name);
        }

    }
}
