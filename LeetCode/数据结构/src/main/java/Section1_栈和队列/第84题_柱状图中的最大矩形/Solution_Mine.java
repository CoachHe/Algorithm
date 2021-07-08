package Section1_栈和队列.第84题_柱状图中的最大矩形;

import java.util.Arrays;
import java.util.Stack;

public class Solution_Mine {
    public static int my_largest_rectangle(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        Arrays.fill(right, height.length);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] > height[i]) {
                right[stack.peek()] = i;
                stack.pop();
            }
            left[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            res = Math.max(res, (right[i] - left[i] - 1) * height[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(my_largest_rectangle(new int[]{2, 1, 5, 6, 2, 3}));
    }

}
