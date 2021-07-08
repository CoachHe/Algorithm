package Section1_栈和队列.E_用一个栈实现另一个栈的排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Mine {
    public static void sorStackByStack(Stack<Integer> stack) {
        Stack<Integer> helpStack = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (helpStack.isEmpty() || cur < helpStack.peek()) {
                helpStack.push(cur);
            } else {
                while (!helpStack.isEmpty() && cur >= helpStack.peek() ) {
                    stack.push(helpStack.pop());
                }
                helpStack.push(cur);
            }
        }
        while (!helpStack.isEmpty()) {
            stack.push(helpStack.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bf.readLine());
        String[] numStr = bf.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.valueOf(numStr[i]));
        }
        sorStackByStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        bf.close();
    }
}
