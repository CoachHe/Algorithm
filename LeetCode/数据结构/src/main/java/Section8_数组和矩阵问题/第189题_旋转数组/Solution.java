package Section8_数组和矩阵问题.第189题_旋转数组;

public class Solution {
    public void rotate(int[] nums, int k) {
        while (k-- > 0) {
            rightMove(nums);
        }
    }

    public void rightMove(int[] arr) {
        int tmp;
        for (int i = arr.length - 1; i > 0; i--) {
            tmp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        Solution s = new Solution();
        s.rightMove(arr);
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        s.rotate(arr, 3);
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
