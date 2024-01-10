package allprogram;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 30;

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

   private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
       }

        
      return fibonacci(n - 1) + fibonacci(n - 2);
        	}
}
