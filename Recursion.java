// SHHH SUMEET IS CODING...

public class Recursion {

    // Factorial using recursion
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    // Fibonacci using recursion
    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 3 is " + fact(3));
        System.out.println("Factorial of 4 is " + fact(4));
        System.out.println("Factorial of 5 is " + fact(5));

        System.out.println("Fibonacci Series up to 13 terms:");
        for (int i = 0; i < 14; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
