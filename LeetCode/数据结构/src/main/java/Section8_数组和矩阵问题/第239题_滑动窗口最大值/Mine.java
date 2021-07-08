package Section8_数组和矩阵问题.第239题_滑动窗口最大值;

import java.util.LinkedList;

public class Mine {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        if (k > nums.length || k < 1) {
            return null;
        }
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> qmax = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!qmax.isEmpty() && nums[qmax.getLast()] <= nums[i]) {
                qmax.removeLast();
            }
            qmax.add(i);
            if (qmax.getFirst() <= i - k) {
                qmax.removeFirst();
            }
            if (i >= k-1) {
                res[i-(k - 1)] = nums[qmax.getFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-7,-8,7,5,7,1,6,0};
//        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(arr, 4);
        for (int tmp : res) {
            System.out.print(tmp + " ");
        }
    }

}

