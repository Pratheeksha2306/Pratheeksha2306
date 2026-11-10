
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        find(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    void find(int[] arr, int target, int index,
              List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Include the current element
        current.add(arr[index]);
        find(arr, target - arr[index], index, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude the current element
        find(arr, target, index + 1, current, result);
    }
}
