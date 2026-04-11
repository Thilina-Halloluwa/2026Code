package Week06_07.ISP.without;

public class Z {
    public void a() {  System.out.println("Doing a");  }

    public void b() { System.out.println("Doing b");  }

    public void c() { System.out.println("Doing c"); }

    public void d() {System.out.println("Doing d"); }

    public void e() { System.out.println("Doing e"); }
}

class A {
    private Z z;
    public A(Z z) {this.z = z;}

    public void doWork() {
        z.a();
        z.b();
    }
}

class B {
    private Z z;
    public B(Z z) { this.z = z; }

    public void doWork() {
        z.c();
    }
}

class C {
    private Z z;
    public C(Z z) {this.z = z; }

    public void doWork() {
        z.d();
        z.e();
    }
}


