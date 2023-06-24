
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class SubsetSum {
    public static ArrayList<Integer> subsetSum(ArrayList<Integer> nums, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        backtrack(0, nums, N, 0, sumSubset);
        return sumSubset;
    }

    public static void backtrack(int sum, ArrayList<Integer> nums, int N, int index, ArrayList<Integer> sumSubset) {
        // if (sum == 0) {
        // subsets.add(new ArrayList<>(currentSubset));
        // return;
        // }
        if (index == N) {
            sumSubset.add(sum);
            return;
        }

        // subsets.add(new ArrayList<>(currentSubset));
        backtrack(sum + nums.get(index), nums, N, index + 1, sumSubset);

        backtrack(sum, nums, N, index + 1, sumSubset);
        // sum += nums[index];
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 5));
        // int target = 5;

        ArrayList<Integer> SumSet = subsetSum(nums, nums.size());

        System.out.println("All subsets:");

        for (int x : SumSet)
            System.out.println(x);
    }
}