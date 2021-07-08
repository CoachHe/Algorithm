package Section8_数组和矩阵问题.第75题_颜色分类;

public class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int cur = 0;
        while (cur <= p2) {
            if (nums[cur] == 0) {
                swap(nums, p0, cur);
                cur++;
                p0++;
            } else if (nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, p2);
                p2--;
            }
        }

    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{2,0,2,1,1,0};
        s.sortColors(nums);
        for (int tmp : nums) {
            System.out.print(tmp + " ");
        }
    }
}
