package 第5章_优化时间和空间效率.第2节_时间效率.面试题42_连续子数组的最大和;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        int max = array[0];
        int i = 0;
        while (i < array.length){
            if (sum + array[i] < 0) {
                while (i < array.length && array[i] + sum < 0) {
                    sum = 0;
                    i++;
                }
                if (i < array.length){
                    sum = array[i++];
                }else{
                    if (max <= 0) {
                        int tmp = Integer.MIN_VALUE;
                        for (int j = 0; j < array.length; j++) {
                            if (tmp < array[j]){
                                tmp = array[j];
                            }
                        }
                        max = tmp;
                    }
                    return max;
                }
            } else if (sum + array[i] > max) {
                max = sum + array[i];
                sum += array[i++];
            } else {
                sum += array[i++];
            }
        }
        if (max <= 0) {
            int tmp = Integer.MIN_VALUE;
            for (int j = 0; j < array.length; j++) {
                if (tmp < array[j]){
                    tmp = array[j];
                }
            }
            max = tmp;
        }
        return max ;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{-2,-8,-1,-5,-9};
        System.out.println(s.FindGreatestSumOfSubArray(arr));
    }
}