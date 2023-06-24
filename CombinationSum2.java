
import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
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

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > sum)
                break;
            currentSubset.add(nums[i]);
            backtrack(sum - nums[i], nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }

        // subsets.add(new ArrayList<>(currentSubset));

        // backtrack(sum, nums, index + 1, currentSubset, subsets);
        // sum += nums[index];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2 };
        int target = 4;
        List<List<Integer>> subsets = findSubsets(nums, target);

        System.out.println("All subsets:");

        System.out.println(subsets);
    }
}