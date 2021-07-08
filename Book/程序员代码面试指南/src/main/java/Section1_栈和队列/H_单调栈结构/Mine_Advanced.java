package Section1_栈和队列.H_单调栈结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Mine_Advanced {
    public static int[][] getNearLess(int[] arr) {
        int[][] res = new int[arr.length][2];
        Stack<List<Integer>> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek().get(0)]) {
                List<Integer> popIndexList = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek().get(stack.peek().size() - 1);
                for (int tmp : popIndexList) {
                    res[tmp][0] = left;
                    res[tmp][1] = i;
                }
            }
            if (!stack.isEmpty() && arr[i] == arr[stack.peek().get(0)]) {
                stack.peek().add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                stack.push(list);
            }
        }
        while (!stack.isEmpty()) {
            List<Integer> popIndexList = stack.pop();
            int left = stack.isEmpty() ? -1 : stack.peek().get(stack.peek().size() - 1);
            for (int tmp : popIndexList) {
                res[tmp][0] = left;
                res[tmp][1] = -1;
            }
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
            int[][] res = getNearLess(nums);
            for (int[] tmp : res) {
                for (int tmp2 : tmp) {
                    System.out.print(tmp2 + " ");
                }
                System.out.println();
            }
        }
    }

}
