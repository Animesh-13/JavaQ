import java.util.*;

public class SumBt {
    public static void main(String args[]) {
        System.out.println("Enter the num upto u want to print the number in reverse order i.e backtrack");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Linear(a);
        sc.close();
    }

    public static void Linear(int x) {
        if (x <= 0) {
            return;
        }
        System.out.println(x);
        Linear(x - 1);
    }
}
