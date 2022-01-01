public class fibonacci {
    public static int fib(int n) {
        System.out.println("Tinh fib thu: " + n);
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    static int[] F = new int[1000];

    public static int fib2(int n) {
        if (F[n] != 0)
            return F[n];
        System.out.println("Tinh fib thu: " + n);

        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = fib2(n - 1) + fib2(n - 2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib2(5));

    }
}

/*
 * 1 1 2 3 5
 * 
 * fib(5) => fib(4) + fib(3) = 3 + 2 = 6
 * fib(4) => fib(3) + fib(2) = 2 + 1 = 3
 * fib(3) => fib(2) + fib(1) = 1 + 1 = 2
 * 
 * 
 */