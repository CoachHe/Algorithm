package Section5_字符串问题.K_删除多余字符得到字典序最小的字符串;

import java.util.HashMap;

public class Main {
    public static String removeDuplicateLetters(String string) {
        char[] chars = string.toCharArray();
        System.out.println(chars);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char aChar : chars) {
            if (hashMap.containsKey(aChar)) {
                hashMap.put(aChar, hashMap.get(aChar) + 1);
            } else {
                hashMap.put(aChar, 1);
            }
        }
        int index = 0;
        int res = 0;
        char min = 'z';
        int tmp = 0;
        int len = hashMap.size();
        while (res < len) {
            while (index < chars.length && hashMap.get(chars[index]) != null) {
                hashMap.put(chars[index], hashMap.get(chars[index]) - 1);
                if (hashMap.get(chars[index]) == 0) {
                    hashMap.remove(chars[index]);
                    index++;
                    break;
                }
                index++;
            }
            for (int i = tmp; i < index; i++) {
                if (min > chars[i] && (hashMap.containsKey(chars[i]) || chars[i] == chars[index - 1])) {
                    min = chars[i];
                }
            }
            tmp = index;
            chars[res++] = min;
            min = 'z';
        }
        String re = "";
        System.out.println(chars);
        for (int i = 0; i < len; i++) {
            re += chars[i];
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("dbcacbca"));
    }
}
