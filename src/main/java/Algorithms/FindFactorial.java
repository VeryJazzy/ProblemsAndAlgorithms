package Algorithms;

public class FindFactorial {

    public int iteratively(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int recursively(int n ) {
        if (n == 0) {
            return 1;
        }
        return (n * recursively(n - 1));
    }
}
