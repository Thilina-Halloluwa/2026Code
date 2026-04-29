package Week09.Intro.WhyEx02;

public class Print<T> {
    T t;

    Print(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Print<Integer> print = new Print<>(1);
        print.print();

        Print<Double> print2 = new Print<>(1.1);
        print2.print();

        Print<String> print3 = new Print<>("1.1");
        print3.print();

       /*
       The following also work because these are using the raw type Print.
       A raw type means Java treats it roughly like:  Print<Object>
       But this loses type safety.
       For example:
       Print<String> print = new Print("1.1"); // raw type allowed, but unsafe
       The compiler may allow it with a warning, but it is not recommended.

       These work because raw types exist for backward compatibility with old Java code before generics.
       But using them bypasses the type-safety benefits of generics.
        */

        Print print4 = new Print("1.1");
        print4.print();
        Print print5 = new Print<>(1.1);
        print5.print();
        Print print6 = new Print<>(1);
        print6.print();


    }
}
