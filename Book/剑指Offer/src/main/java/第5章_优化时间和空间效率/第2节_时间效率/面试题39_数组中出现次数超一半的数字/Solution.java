package 第5章_优化时间和空间效率.第2节_时间效率.面试题39_数组中出现次数超一半的数字;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int tmp = array[0];
        if (array.length == 1) {
            return tmp;
        }
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == tmp) {
                index++;
            }else if (index >= 1){
                index--;
            } else if (i < array.length - 1){
                tmp = array[i++ + 1];
            }else {
                return 0;
            }
        }
        index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tmp) {
                index++;
            }
        }
        if (index < array.length / 2) {
            return 0;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,4,2,4};
        Solution s = new Solution();
        System.out.println(s.MoreThanHalfNum_Solution(arr));
    }
}