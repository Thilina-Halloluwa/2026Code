package Week09.Intro.WhyEx1;

import java.util.ArrayList;
import java.util.List;


public class MainWith {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("Laptop"));
       // cart.add("Not a product");  //  Compile-time error!


        for (int i = 0; i < cart.size(); i++) {
            Product p = cart.get(i);
            System.out.println(p.name);
        }

    }
}
