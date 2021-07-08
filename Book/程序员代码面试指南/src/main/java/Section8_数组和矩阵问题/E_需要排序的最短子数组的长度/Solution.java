package Section8_数组和矩阵问题.E_需要排序的最短子数组的长度;

public class Solution {

    public int getMinLength(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int min = arr[arr.length - 1];
        int noMinIndex = -1;
        for (int i = arr.length - 2; i != -1; i--) {
            if (arr[i] > min) {
                noMinIndex = i;
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        if (noMinIndex == -1) {
            return 0;
        }
        int max = arr[0];
        int noMaxIndex = -1;
        for (int i = 1; i != arr.length; i++) {
            if (arr[i] < max) {
                noMaxIndex = i;
            } else {
                max = Math.max(max, arr[i]);
            }
        }
        return noMaxIndex - noMinIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,4,2,6,7};
        int[] arr2 = new int[]{2,6,4,8,10,9,15};
        int[] arr3 = new int[]{2,1};

        Solution s = new Solution();
        System.out.println(s.getMinLength(arr));
        System.out.println(s.getMinLength(arr2));
        System.out.println(s.getMinLength(arr3));
    }

}
