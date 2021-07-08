package Section8_数组和矩阵问题.I_不重复打印排序数组中相加和为给定值的所有二元组合三元组;


/**
 * 错误
 * 没有检查重复
 */
public class Mine_eryuan {
    public static void printUniquePair(int[] arr, int K) {
        if (arr.length < 2 || arr == null) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < K) {
                left++;
            } else if (arr[left] + arr[right] > K) {
                right--;
            } else {
                System.out.println(arr[left] + "," +arr[right]);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-8,-4,-3,0,1,1,2,4,5,8,9,9};
        printUniquePair(arr, 10);
    }


}
