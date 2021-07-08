package Section1_栈和队列.A_设计一个有getMin功能的栈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_Method1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Solution_Method1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        Solution_Method1 s = new Solution_Method1();
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
