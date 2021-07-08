package Section1_栈和队列.H_单调栈结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Mine_Original {
    public static int[][] getNearLessNoRepeat(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[][] res = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int popIndex = stack.pop();
                if (!stack.isEmpty()) {
                    res[popIndex][0] = stack.peek();
                } else {
                    res[popIndex][0] = -1;
                }
                res[popIndex][1] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            if (!stack.isEmpty()) {
                res[popIndex][0] = stack.peek();
            } else {
                res[popIndex][0] = -1;
            }
            res[popIndex][1] = -1;
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String[] num = s.split(" ");
            int n = Integer.valueOf(num[0]);
            int[] nums = new int[n];

            String[] line = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(line[i]);
            }
            int[][] res = getNearLessNoRepeat(nums);
            for (int[] tmp : res) {
                for (int tmp2 : tmp) {
                    System.out.print(tmp2 + " ");
                }
                System.out.println();
            }
        }
    }
}
