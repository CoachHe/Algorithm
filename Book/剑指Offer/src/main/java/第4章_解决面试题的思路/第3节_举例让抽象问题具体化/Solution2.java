package 第4章_解决面试题的思路.第3节_举例让抽象问题具体化;

import java.util.Stack;
import java.util.Iterator;

public class Solution2 {

    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        int tmp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(7);
        s.push(2);
        Stack<Integer> stack = s.stack;
        while (stack.size() != 0) {
            System.out.print(stack.pop());
        }
    }
}
