package Section5_字符串问题.第387题_字符串中的第一个唯一字符;

import java.util.HashMap;

class Solution_Map {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) != null) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_Map s = new Solution_Map();
        System.out.println(s.firstUniqChar("cc"));
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String s1 = "abc";
        hashMap.put(s1.charAt(1), 1);
        System.out.println(hashMap.get('d'));
    }
}
