package Week09.Intro.WhyEx02;

public class Print<T> {
    T t;

    Print(T t){
        this.t = t;
    }
    public void print(){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Print<Integer> print = new Print<>(1);
        print.print();

        Print<Double> print2 = new Print<>(1.1);
        print2.print();

        Print<String> print3 = new Print<>("1.1");
        print3.print();

        Print print4 = new Print<>("1.1");
        print4.print();
        Print print5 = new Print<>(1.1);
        print5.print();
        Print print6 = new Print<>(1);
        print6.print();


    }
}
