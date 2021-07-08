package Section8_数组和矩阵问题.I_不重复打印排序数组中相加和为给定值的所有二元组合三元组;

/**
 * 错误
 * 没有检查重复
 */
public class Mine_sanyuan {
    public static void printsanyuan(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr.length < 3) {
                System.out.println("This array is invalid");
            }
            printeryuan(arr, i,i + 1, K - arr[i]);
        }
    }

    public static void printeryuan(int[] arr,int index_now, int start, int K_rest) {
        int left = start;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] < K_rest) {
                left++;
            } else if (arr[left] + arr[right] > K_rest) {
                right--;
            } else {
                System.out.println(arr[index_now] + "," + arr[left] + "," + arr[right]);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-8,-4,-3,0,1,2,4,5,8,9};
        printsanyuan(arr, 10);
    }

}
