package Section5_字符串问题.K_删除多余字符得到字典序最小的字符串;

import java.io.IOException;

public class Main_Mine {
    public static void removeDuplicateLetters(String string) {
        char[] chars = string.toCharArray();
        int[] map = new int[26];
        for (char tmp : chars) {
            map[tmp - 'a']++;
        }
        int index = 0; //结果索引
        int L = 0;     //最小的位置
        int R = 0;     //索引为0的位置
        char min = 'z';
        int pick = 0;
        while (R < chars.length) {
            if (map[chars[R] - 'a'] == -1 || --map[chars[R] - 'a'] > 0) {
                R++;
            } else {
                //1
                for (int j = L; j <= R; j++) {
                    if (min >= chars[j]) {
                        min = chars[j];
                        pick = j;
                    }
                }
                //1此时求出了最小位置到索引为0的位置的最小值
                //2
                for (int j = pick; j < R; j++) {
                    if (min != chars[j]) {
                        map[chars[j] - 'a']++;
                    }
                }
                //2此时将最小值到当前索引位置的值给补上
                chars[index++] = min;
                map[chars[pick] - 'a'] = -1;
                L = pick + 1;
                R = L;
                min = 'z';
            }
        }
        System.out.println(String.valueOf(chars, 0, index));
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String string = br.readLine();
//        removeDuplicateLetters(string);
        removeDuplicateLetters("dbcacbca");
    }
}
