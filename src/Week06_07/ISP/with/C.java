package Week06_07.ISP.with;

public class C {
    private CI z;

    public C(CI z) {
        this.z = z;
    }

    public void doWork() {
        z.d();
        z.e();
    }
}
