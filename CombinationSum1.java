import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static List<List<Integer>> findSubsets(int[] nums, int sum) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(sum, nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int sum, int[] nums, int index, List<Integer> currentSubset,
            List<List<Integer>> subsets) {

        if (index == nums.length) {
            if (sum == 0) {
                subsets.add(new ArrayList<>(currentSubset));
            }
            return;
        }

        if (nums[index] <= sum) {
            currentSubset.add(nums[index]);
            backtrack(sum - nums[index], nums, index, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }
        // subsets.add(new ArrayList<>(currentSubset));
        backtrack(sum, nums, index + 1, currentSubset, subsets);
        // sum += nums[index];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 4 };
        int target = 2;
        List<List<Integer>> subsets = findSubsets(nums, target);

        System.out.println("All subsets:");

        System.out.println(subsets);
    }
}