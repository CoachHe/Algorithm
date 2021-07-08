package Section1_栈和队列.第155题_最小栈;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack_min;

    public MinStack(){
        stack = new Stack<>();
        stack_min = new Stack<>();
    }

    public void push(int x){
        stack.push(x);
        if (stack_min.size() == 0) {
            stack_min.push(x);
        } else if (stack_min.peek() >= x) {
            stack_min.push(x);
        }
    }

    public void pop(){
        int tmp = stack.pop();
        if (tmp == stack_min.peek()) {
            stack_min.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return stack_min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483646);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483646);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

}
