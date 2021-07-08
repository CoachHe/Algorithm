package Section5_字符串问题.O_有效括号;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static String validkuo(String string) {
        if (string == null || string.length() == 0) {
            return "NO";
        }
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (stack.size() != 0 &&chars[i] == ')' && stack.peek() == '('){
                stack.pop();
            } else {
                return "NO";
            }
        }
        if (stack.size() == 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        System.out.println(validkuo(string));
    }
}
