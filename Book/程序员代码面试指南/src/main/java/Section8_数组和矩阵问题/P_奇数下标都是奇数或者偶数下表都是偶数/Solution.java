package Section8_数组和矩阵问题.P_奇数下标都是奇数或者偶数下表都是偶数;

public class Solution {
    public void modify(int[] arr) {
        int even = 0;
        int odd = 1;
        int tmp;
        while (even <= arr.length - 1 && odd <= arr.length - 1) {
            if (Math.floorMod(arr[arr.length - 1], 2) == 0) {
                tmp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[even];
                arr[even] = tmp;
                even += 2;
            } else {
                tmp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[odd];
                arr[odd] = tmp;
                odd += 2;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6,7,8,9,10,11,12};
        s.modify(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
