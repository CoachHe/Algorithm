package 第2章_面试需要的基础知识.第3节_数据结构.D_栈和队列.面试题9_用两个栈实现队列;

import java.util.Stack;

public class Solution_Mine {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        int size = stack1.size();
        stack1.push(node);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack2.push(node);
        for (int i = 0; i < size; i++) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        int size = stack1.size();
        int res = stack2.pop();
        for (int i = 0; i < size - 1; i++) {
            stack2.push(stack1.pop());
        }
        stack1.pop();
        for (int i = 0; i < size - 1; i++) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_Mine s = new Solution_Mine();

    }
}
