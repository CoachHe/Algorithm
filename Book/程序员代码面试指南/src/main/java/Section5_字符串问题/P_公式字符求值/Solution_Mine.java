package Section5_字符串问题.P_公式字符求值;

import java.util.LinkedList;
import java.util.List;

public class Solution_Mine {

    public int getValue(String exp) {
        return value(exp.toCharArray(), 0);
    }

    public int value(char[] chars, int i) {
        
        List<String> list = new LinkedList<>();

        while (i < chars.length && chars[i] != ')') {

        }

        return 0;
    }
}
