package 选择排序;

public class Solution {
    public static void choose_sort(int[] arr) {
        //每次都选出范围内的最大值，放到最后，arr的长度为多少就比较多少次
        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            //这里将范围缩小，因为每次都已经将当前最大值放入最后
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[tmp] < arr[j]) {
                    tmp = j;
                }
            }
            swap(arr, tmp, arr.length - i - 1);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 3, 2, 5, 6, 9};
        choose_sort(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
