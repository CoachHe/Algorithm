package Section5_字符串问题.第49题_字母异位分词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> list = hashMap.getOrDefault(Arrays.toString(chars), new ArrayList<String>());
            list.add(str);
            hashMap.put(Arrays.toString(chars), list);
        }

        return new ArrayList<List<String>>(hashMap.values());
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"tao","pit","cam","aid","pro","dog"};
        Solution2 s = new Solution2();
        List<List<String>> list = s.groupAnagrams(strings);
        for (List<String> tmplist : list) {
            for (String tmpstr : tmplist) {
                System.out.print(tmpstr + " ");
            }
            System.out.println();
        }
    }
}
