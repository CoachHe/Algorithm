package Section1_栈和队列.C_如何仅用递归函数和栈操作逆序一个栈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Mine {
    public static int getLast(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 0;
        }
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getLast(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getLast(stack);
        reverse(stack);
        stack.push(i);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer>sta=new Stack<>();
        int n=Integer.parseInt(buff.readLine());
        String str=buff.readLine();
        String []str1=str.split(" ");
        for(int i=0;i<str1.length;++i) {
            sta.push(Integer.parseInt(str1[i]));
        }
        reverse(sta);
        //System.out.println(sta.peek());
        for(int i=0;i<str1.length;++i) {
            System.out.print(getLast(sta)+" ");
        }
    }
}
