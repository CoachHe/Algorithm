package 插入排序;

public class Solution {
    public static void insert_choose(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 每次比较的范围是[0,i]和第j位，保证[0,i]内是有序的，每次多一位有序
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        // int[] arr = new int[]{2, 1, 4, 3, 2, 5, 6, 9};
        int[] arr = new int[]{1, 3, 2, 1};
        insert_choose(arr);
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }
}
