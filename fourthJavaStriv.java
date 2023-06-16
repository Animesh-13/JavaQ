import java.util.*;

public class fourthJavaStriv {
    public static void main(String args[]) {
        System.out.println("Enter the number.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int summation = Sum(x);
        System.out.println(summation);
        Sum2(0, x);
    }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void Sum2(int i, int n) {
        if (n == 0) {
            System.out.println(i);
            return;
        }
        Sum2(i + n, n - 1);
    }
}
