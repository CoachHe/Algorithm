package 冒泡排序;

public class Solution {

    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (tmp > arr[j]) {
                    swap(arr, j - 1, j);
                }
                tmp = arr[j];
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 3, 2, 5, 6, 9};
        bubble_sort(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
