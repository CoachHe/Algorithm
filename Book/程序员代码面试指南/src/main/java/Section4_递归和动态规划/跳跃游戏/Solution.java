package Section4_递归和动态规划.跳跃游戏;

public class Solution {
    public int jump(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int jump = 0;
        int cur = 0;
        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cur == i && next < arr.length && arr[next] == 0) {
                return 0;
            } else if (cur < i) {
                jump++;
                cur = next;
            }
            next = Math.max(next, i + arr[i]);
        }
        return jump;
    }

    public boolean canJump(int[] nums) {
        return jump(nums) != 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2};
        int[] arr2 = new int[]{2, 3, 1, 1, 4};
        Solution s = new Solution();
        s.canJump(arr);
        System.out.println(s.jump(arr));
        System.out.println(s.canJump(arr));
        System.out.println(s.canJump(arr2));
    }
}
