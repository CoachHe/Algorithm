package Section8_数组和矩阵问题.O_自然数组的排序;

public class Solution {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            while (arr[i] != i + 1) {
                tmp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{2, 1, 4, 5, 3};
        s.sort(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
