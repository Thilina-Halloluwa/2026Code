package Week01;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(factorial(0)); // 1
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(5)); // 120
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

//    public static long factorialRec(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
//        }
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
}

