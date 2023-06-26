
import java.util.ArrayList;
import java.util.List;

public class SubsetSumAd {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int[] nums, int index, List<Integer> currentSubset,
            List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(currentSubset));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;

            currentSubset.add(nums[i]);
            backtrack(nums, i + 1, currentSubset, subsets);
            currentSubset.remove(currentSubset.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3, 3 };
        List<List<Integer>> subsets = findSubsets(nums);

        System.out.println("All subsets:");

        System.out.println(subsets);
    }
}