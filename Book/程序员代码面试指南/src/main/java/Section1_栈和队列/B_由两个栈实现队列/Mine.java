package Section1_栈和队列.B_由两个栈实现队列;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Mine {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    public Mine(){
        this.stackPop = new Stack<Integer>();
        this.stackPush = new Stack<Integer>();
    }

    public void PushToPop() {
        while (!stackPop.empty()) {
            stackPush.push(stackPop.pop());
        }
        while (!stackPush.empty()) {
            stackPop.push(stackPush.pop());
        }
    }

    public void push(int x) {
        while (!stackPop.empty()) {
            stackPush.push(stackPop.pop());
        }
        this.stackPush.push(x);
        PushToPop();
    }

    public int pop(){
        if (stackPop == null) {
            throw new RuntimeException("Queue is null");
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop == null) {
            throw new RuntimeException("Queue is null");
        }
        return stackPop.peek();
    }

    public boolean empty(){
        return stackPop.empty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Mine s = new Mine();
        int row = Integer.valueOf(scanner.readLine());
        for (int i = 0; i < row; i++) {
            String[] data = scanner.readLine().split(" ");
            if(data[0].equals("add")) {
                s.push(Integer.valueOf(data[1]));
                continue;
            }
            if (data[0].equals("poll")) {
                s.pop();
                continue;
            }
            if (data[0].equals("peek")) {
                System.out.println(s.peek());
                continue;
            }
        }
        scanner.close();
    }
}
