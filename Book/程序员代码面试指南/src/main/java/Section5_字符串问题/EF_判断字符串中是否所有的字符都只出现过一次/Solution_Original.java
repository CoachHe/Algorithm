package Section5_字符串问题.EF_判断字符串中是否所有的字符都只出现过一次;

public class Solution_Original {
    public boolean isUnique1(char[] chas) {
        if (chas == null) {
            return true;
        }
        boolean[] map = new boolean[256];
        for (int i = 0; i < chas.length; i++) {
            if (map[chas[i]]) {
                return false;
            }
            map[chas[i]] = true;
        }
        return true;
    }
}
