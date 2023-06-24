import java.util.ArrayList;
import java.util.List;

public class SubsetBt2 {
    public static List<List<Integer>> findSubsets(int[] nums, int sum) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(sum, nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int sum, int[] nums, int index, List<Integer> currentSubset,
            List<List<Integer>> subsets) {
        if (sum == 0) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }
        if (index == nums.length || sum < 0) {
            return;
        }

        // subsets.add(new ArrayList<>(currentSubset));
        currentSubset.add(nums[index]);
        backtrack(sum - nums[index], nums, index + 1, currentSubset, subsets);

        currentSubset.remove(currentSubset.size() - 1);
        backtrack(sum, nums, index + 1, currentSubset, subsets);
        // sum += nums[index];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int target = 2;
        List<List<Integer>> subsets = findSubsets(nums, target);

        System.out.println("All subsets:");

        System.out.println(subsets);
    }
}