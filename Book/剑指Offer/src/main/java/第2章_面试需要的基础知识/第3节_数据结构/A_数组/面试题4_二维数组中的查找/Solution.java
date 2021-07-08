package 第2章_面试需要的基础知识.第3节_数据结构.A_数组.面试题4_二维数组中的查找;

public class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length < 1 || array[0].length < 1) {
            return false;
        }
        int length = 0;
        int column = array[0].length - 1;
        while (length < array.length && column >= 0) {
            if (array[length][column] > target) {
                column--;
            } else if (array[length][column] < target) {
                length++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Solution s = new Solution();
        System.out.println(s.Find(0, array));
    }
}
