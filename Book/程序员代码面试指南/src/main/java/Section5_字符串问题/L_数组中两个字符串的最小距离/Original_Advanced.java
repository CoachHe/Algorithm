package Section5_字符串问题.L_数组中两个字符串的最小距离;

import java.util.HashMap;
//不太行
public class Original_Advanced {

    public HashMap<String, HashMap<String, Integer>> outerHash;
    public HashMap<String, Integer> innerHash;

    public static int HashNumber(HashMap<String, Integer> hash, String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (hash.get(strings[i]) != null) {
                hash.put(strings[i], 1);
            }
        }
        return hash.size();
    }

    public static void SetHash(String[] strings) {
        HashMap<String, Integer> hash = new HashMap<>();
        int length = HashNumber(hash, strings);

    }

    public static int minDistance_between2(String[] strings, String string1, String string2) {
        if (string1 == null || string2 == null) {
            return -1;
        }
        if (string1.equals(string2)) {
            return 0;
        }
        int index1 = -1;
        int index2 = -1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(string1)) {
                index1 = i;
                minLen = Math.min(minLen, index2 == -1 ? minLen : i - index2);
            } else if (strings[i].equals(string2)) {
                index2 = i;
                minLen = Math.min(minLen, index1 == -1 ? minLen : i - index1);
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static int minDistance(String[] strings, String string1, String string2) {


        return 0;
    }
}
