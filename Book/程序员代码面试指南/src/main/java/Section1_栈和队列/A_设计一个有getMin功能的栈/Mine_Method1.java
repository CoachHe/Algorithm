package Section1_栈和队列.A_设计一个有getMin功能的栈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Mine_Method1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Mine_Method1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (this.stackData.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (stackMin.peek() >= newNum) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("This stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.stackMin.peek()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("This stack is empty");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Mine_Method1 s = new Mine_Method1();
        int row = Integer.valueOf(scanner.readLine());
        for (int i = 0; i < row; i++) {
            String[] data = scanner.readLine().split(" ");
            if(data[0].equals("push")) {
                s.push(Integer.valueOf(data[1]));
                continue;
            }
            if (data[0].equals("pop")) {
                s.pop();
                continue;
            }
            System.out.println(s.getMin());
        }
        scanner.close();
    }
}
