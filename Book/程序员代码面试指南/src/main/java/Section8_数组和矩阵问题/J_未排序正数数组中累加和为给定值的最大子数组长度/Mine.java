package Section8_数组和矩阵问题.J_未排序正数数组中累加和为给定值的最大子数组长度;

public class Mine {
    public static int getMaxLength(int[] arr, int K) {
        if (arr == null || arr.length < 1 || K < 0) {
            System.out.println("It is not legal");
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < arr.length) {
            if (sum < K) {
                right++;
                if (right == arr.length) {
                    break;
                }
                sum += arr[right];
            } else if (sum > K) {
                sum -= arr[left++];
            } else {
                len = Math.max(len, right - left + 1);
                sum -= arr[left++];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 1, 1};
        System.out.println(getMaxLength(arr, 3));
    }
}
