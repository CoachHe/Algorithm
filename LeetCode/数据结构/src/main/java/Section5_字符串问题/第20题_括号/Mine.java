package Section5_字符串问题.第20题_括号;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mine {
    public String isValid(String s) {
        Map map = new HashMap();
        map.put(")","(");
        map.put("]","[");
        map.put("}","{");
        ArrayList array = new ArrayList();
        array.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(array.get(i-1).equals(s.charAt(i))){
                array.add(s.charAt(i));
            } else {
                array.remove(array.get(i-1));
            }
        }

        return array.toString();
    }

    public static void main(String[] args) {
        Solution a = new Solution();

        System.out.println(a.isValid("{}{}"));
    }

}
