package 第4章_解决面试题的思路.第3节_举例让抽象问题具体化;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    
    public void push(int node) {
        stack1.push(node);
        if (stack2.size() != 0) {
            int top = stack1.peek();
            while (stack2.size() != 0 && stack2.peek() < node) {
                stack1.push(stack2.pop());
            }
            stack2.push(node);
            while (stack1.peek() != top) {
                stack2.push(stack1.pop());
            }
        } else {
            stack2.push(node);
        }
    }
    
    public void pop() {
        int top = stack1.pop();
        int tmp = stack1.size();
        while (stack2.peek() != top) {
            stack1.push(stack2.pop());
        }
        stack2.pop();
        while (stack1.size() != tmp) {
            stack2.push(stack1.pop());
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(7);
        s.push(2);
        s.pop();
        s.pop();
        Stack<Integer> stack1 = s.stack1;
        Stack<Integer> stack2 = s.stack2;
        while (stack1.size() != 0) {
            System.out.print(stack1.pop());
        }
        System.out.println();
        while (stack2.size() != 0) {
            System.out.print(stack2.pop());
        }
    }
}