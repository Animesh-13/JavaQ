import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
    public static List<List<Integer>> permu(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        recurPermu(arr, new ArrayList<>(), ans, freq);
        return ans;
    }

    public static void recurPermu(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recurPermu(arr, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 3, 4 };
        List<List<Integer>> allpermuList = permu(arr);

        System.out.println("All subsets:");

        System.out.println(allpermuList);
    }

}
