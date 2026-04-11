package Week06_07.ISP.without.withInterface;

public class Main {
    public static void main(String[] args) {
        Z z = new ConcreteZ();

        A aClient = new A(z);
        B bClient = new B(z);
        C cClient = new C(z);

        aClient.doWork();
        bClient.doWork();
        cClient.doWork();
    }
}