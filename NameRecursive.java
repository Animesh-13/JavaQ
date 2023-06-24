import java.util.*;

public class NameRecursive {
    public static void main(String args[]) {
        System.out.println("Enter your name and number of times");
        Scanner Sc = new Scanner(System.in);
        String s = Sc.nextLine();
        int x = Sc.nextInt();
        Name(s, x);
        Sc.close();
    }

    public static void Name(String str, int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(str);
        Name(str, n - 1);
    }
}
