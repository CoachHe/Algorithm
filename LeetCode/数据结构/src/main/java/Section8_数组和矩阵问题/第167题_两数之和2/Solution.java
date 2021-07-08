package Section8_数组和矩阵问题.第167题_两数之和2;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int tmp = numbers[left] + numbers[right];
        while (tmp != target) {
            if (tmp < target) {
                left++;
            } else {
                right--;
            }
            tmp = numbers[left] + numbers[right];
        }
        return new int[]{left + 1, right + 1};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int tmp : s.twoSum(new int[]{2, 7, 11, 15}, 9)) {
            System.out.print(tmp + " ");
        }
    }
}