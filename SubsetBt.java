import java.util.ArrayList;
import java.util.List;

public class SubsetBt {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        // subsets.add(new ArrayList<>(currentSubset));
        backtrack(nums, index + 1, currentSubset, subsets);
        currentSubset.add(nums[index]);

        backtrack(nums, index + 1, currentSubset, subsets);
        currentSubset.remove(currentSubset.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5 };
        List<List<Integer>> subsets = findSubsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            // int sum = 0;
            // for (int x : subset) {
            // sum += x;
            // }
            // if (sum == 2) {
            // System.out.println(subset);
            // }
            System.out.println(subset);
        }
    }
}