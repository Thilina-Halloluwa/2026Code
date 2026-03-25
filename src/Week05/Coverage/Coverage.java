package Week05.Coverage;

public class Coverage {

    int positives = 0;
    int evens = 0;

    public void register(int x) {
        if (x > 0) {
            positives += 1;
        }
        if (x % 2 == 0) {
            evens += 1;
        }
    }


}
