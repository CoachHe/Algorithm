package Section1_栈和队列.G_生成窗口最大值数组;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Mine {
    public static int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w > arr.length || w < 1) {
            return null;
        }
        int[] res = new int[arr.length - w + 1];
        LinkedList<Integer> qmax = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.getLast()] <= arr[i]) {
                qmax.removeLast();
            }
            qmax.add(i);
            if (qmax.getFirst() <= i - w) {
                qmax.removeFirst();
            }
            if (i >= (w - 1)) {
                res[i - (w - 1)] = arr[qmax.getFirst()];
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
            int[] res = getMaxWindow(nums, Integer.valueOf(num[1]));
            for (int tmp : res) {
                System.out.print(tmp + " ");
            }
        }
    }

}
