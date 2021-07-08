package Section4_递归和动态规划.回溯法.第40题_组合总和II;

import java.util.*;

public class Solution {
    List<List<Integer>> path = new LinkedList<>();
    Stack<Integer> tmp_path = new Stack<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        mid_combination(candidates, target, 0, 0);
        return path;
    }

    public void mid_combination(int[] candidates, int target, int tmp_sum, int index) {
        if (index > candidates.length || tmp_sum > target) {
            return;
        }
        if (tmp_sum == target) {
            if (path.size() == 0 || !check_contain()) {
                path.add(new LinkedList<>(tmp_path));
            }
        }
        if (index == candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            tmp_path.add(candidates[i]);
            mid_combination(candidates, target, tmp_sum + candidates[i], i + 1);
            tmp_path.pop();
        }
    }

    public boolean check_contain() {
        int[] arr1 = new int[tmp_path.size()];
        int index = 0;
        for (int tmp : tmp_path) {
            arr1[index++] = tmp;
        }
        Arrays.sort(arr1);
        for (List<Integer> tmp_list : path) {
            int[] arr2 = new int[tmp_list.size()];
            int index2 = 0;
            for (int tmp : tmp_list) {
                arr2[index2++] = tmp;
            }
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
