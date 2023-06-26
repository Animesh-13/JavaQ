
// import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;

public class Permutation2 {

    public static void swap(int[] arr, int ptr, int index) {
        int temp = arr[index];
        arr[index] = arr[ptr];
        arr[ptr] = temp;
    }

    public static void recurPermu(int index, int[] arr, List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            recurPermu(index + 1, arr, ans);
            swap(arr, i, index);
        }
    }

    public static List<List<Integer>> permu(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermu(0, arr, ans);
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> allpermuList = permu(arr);

        System.out.println("All subsets:");

        System.out.println(allpermuList);

    }

}
