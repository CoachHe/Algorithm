package Section5_字符串问题.第20题_括号;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for (char tmp : chars) {
            if (tmp == '}' || tmp == ']' || tmp == ')') {
                if (stack.size() == 0) {
                    return false;
                } else if (stack.peek() != map.get(tmp)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(tmp);
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isValid("{[()]}"));
    }

}
