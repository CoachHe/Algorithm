package Section8_数组和矩阵问题.E_需要排序的最短子数组的长度;

public class Mine {

    public static int getMinLength(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        // 从右往左遍历，找到无序数组的起点
        int min = arr[arr.length - 1];            //从右往左找，最小值所在位置
        int min_index = -1;     //从右往左找，无序数的起点位置
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] <= min) {
                min = arr[i];
            } else {
                min_index = i;
            }
        }
        if (min_index == -1) {
            return 0;
        }

        // 从左往右遍历，找到无序数组的重点
        int max = arr[0];
        int max_index = -1;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else {
                max_index = i;
            }
        }

        return max_index - min_index + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,4,2,5,8,7,6,9,10,11};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{2,1};

        System.out.println(getMinLength(arr));
        System.out.println(getMinLength(arr2));
        System.out.println(getMinLength(arr3));
    }

}
