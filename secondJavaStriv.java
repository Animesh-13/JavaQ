import java.util.*;

public class secondJavaStriv {
    public static void main(String args[]) {
        System.out.println("Enter the num upto u want to print the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Linear(a, 1);
        sc.close();
    }

    public static void Linear(int x, int i) {
        if (x <= 0) {
            return;
        }
        System.out.println(i);
        Linear(x - 1, i + 1);
    }
}
