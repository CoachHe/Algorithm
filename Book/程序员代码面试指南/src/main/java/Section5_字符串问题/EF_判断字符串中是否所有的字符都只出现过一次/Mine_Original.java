package Section5_字符串问题.EF_判断字符串中是否所有的字符都只出现过一次;

public class Mine_Original {
    public boolean isUnique1(char[] chars) {
        if (chars.length <= 1) {
            return true;
        }
        boolean[] map = new boolean[256];
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i]]) {
                return false;
            }
            map[chars[i]] = true;
        }
        return true;
    }
}
