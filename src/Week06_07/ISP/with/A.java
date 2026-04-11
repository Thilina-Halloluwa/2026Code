package Week06_07.ISP.with;

public class A {
    private AI z;

    public A(AI z) {
        this.z = z;
    }

    public void doWork() {
        z.a();
        z.b();
    }
}
