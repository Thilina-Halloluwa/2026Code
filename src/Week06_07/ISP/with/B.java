package Week06_07.ISP.with;

public class B {
    private BI z;

    public B(BI z) {
        this.z = z;
    }

    public void doWork() {
        z.c();
    }
}
