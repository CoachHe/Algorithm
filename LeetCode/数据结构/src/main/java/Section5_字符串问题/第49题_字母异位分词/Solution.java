package Section5_字符串问题.第49题_字母异位分词;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> reslist = new ArrayList<>();
        for (String tmpstr : strs) {
            judgetmp(tmpstr, reslist);
        }
        return reslist;
    }

    public void judgetmp(String string, List<List<String>> list) {
        int judge = 0;
        for (List<String> strings : list) {
            if (judgetwo(string, strings.get(0))) {
                strings.add(string);
                judge = 1;
                break;
            }
        }
        if (list.size() == 0 || judge == 0) {
            List<String> list1 = new ArrayList<>();
            list1.add(string);
            list.add(list1);
        }
    }

    public boolean judgetwo(String string1, String string2) {
        int[] ints1 = new int[26];
        int[] ints2 = new int[26];
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        for (char tmpchar : chars1) {
            ints1[tmpchar - 'a']++;
        }
        for (char tmpchar : chars2) {
            ints2[tmpchar - 'a']++;
        }
        int tmp = 0;
        for (int i = 0; i < ints1.length; i++) {
            if ((ints1[i] ^ ints2[i]) != 0) {
                tmp = 1;
                break;
            }
        }
        return tmp == 0;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"tao","pit","cam","aid","pro","dog"};
        Solution s = new Solution();
        List<List<String>> list = s.groupAnagrams(strings);
        for (List<String> tmplist : list) {
            for (String tmpstr : tmplist) {
                System.out.print(tmpstr + " ");
            }
            System.out.println();
        }
    }
}