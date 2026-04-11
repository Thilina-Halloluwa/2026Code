package Week06_07.ISP.with;

public class ConcreteZ implements AI, BI, CI {
    @Override
    public void a() {
        System.out.println("Doing a");
    }

    @Override
    public void b() {
        System.out.println("Doing b");
    }

    @Override
    public void c() {
        System.out.println("Doing c");
    }

    @Override
    public void d() {
        System.out.println("Doing d");
    }

    @Override
    public void e() {
        System.out.println("Doing e");
    }
}
