package 第6章_面试中的各项能力.C_知识迁移能力.面试题59_队列的最大值;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || size <= 0 || num.length < size) {
            return res;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num[0]);
        for (int i = 1; i < num.length; i++) {
            if (queue.size() == 0) {
                queue.offer(num[i]);
                if (i >= size - 1) {
                    res.add(num[i]);
                }
            } else if (num[i] >= queue.peek()) {
                queue.clear();
                queue.offer(num[i]);
                if (i >= size - 1) {
                    res.add(num[i]);
                }
            } else if (num[i] < queue.peek()) {
                if (queue.size() < size - 1) {
                    if (i >= size - 1) {
                        res.add(queue.peek());
                    }
                    queue.offer(num[i]);
                } else {
                    int tmp = queue.poll();
                    res.add(tmp);
                    if (queue.size() == 0) {
                        queue.offer(num[i]);
                    } else if (queue.peek() < num[i]) {
                        queue.poll();
                    }
                    queue.offer(num[i]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] size = new int[]{10, 14, 12, 11};
        System.out.println(s.maxInWindows(size, 1));
    }
}