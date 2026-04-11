package Week06_07.ISP.without;

public class Main {
    public static void main(String[] args) {
        Z z = new Z();

        A aClient = new A(z);
        B bClient = new B(z);
        C cClient = new C(z);

        aClient.doWork();
        bClient.doWork();
        cClient.doWork();
    }
}
