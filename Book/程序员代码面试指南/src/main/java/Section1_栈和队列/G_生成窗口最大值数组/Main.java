package Section1_栈和队列.G_生成窗口最大值数组;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
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

            solution(n, nums);
        }
    }

    private static void solution(int n, int[] nums) {
        int[][] res = new int[n][2];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[i] > nums[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                    int index = stack.pop();
                    res[index][1] = i;
                    if (!stack.isEmpty()) {
                        res[index][0] = stack.peek();
                    } else {
                        res[index][0] = -1;
                    }
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            res[index][1] = -1;
            res[index][0] = stack.isEmpty() ? -1 : stack.peek();
        }

        StringBuilder sb = new StringBuilder();
        for (int[] re : res) {
            sb.append(re[0] + " " + re[1] + "\n");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
