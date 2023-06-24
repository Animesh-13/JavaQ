import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        System.out.println("Enter the number to find nth fibonacci number.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = fibo(x);
        System.out.println(num);
        sc.close();
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
