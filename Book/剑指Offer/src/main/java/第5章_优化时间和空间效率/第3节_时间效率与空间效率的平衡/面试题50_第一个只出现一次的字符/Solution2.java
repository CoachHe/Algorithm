package 第5章_优化时间和空间效率.第3节_时间效率与空间效率的平衡.面试题50_第一个只出现一次的字符;

import java.util.HashMap;

public class Solution2 {
    //Insert one char from stringstream
    int index = 1;
    int[] count = new int[255];
    public void Insert(char ch) {
        if (count[ch] == 0) {
            count[ch] = index++;
        } else {
            count[ch] = -1;
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int tmp = Integer.MAX_VALUE;
        int co = count[0];
        char res = '#';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0 && tmp > count[i]) {
                tmp = count[i];
                res = (char) i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.Insert('g');
        System.out.println(s.FirstAppearingOnce());
        s.Insert('o');
        System.out.println(s.FirstAppearingOnce());
        s.Insert('o');
        System.out.println(s.FirstAppearingOnce());
        s.Insert('g');
        System.out.println(s.FirstAppearingOnce());
        s.Insert('l');
        System.out.println(s.FirstAppearingOnce());
        s.Insert('e');
        System.out.println(s.FirstAppearingOnce());
    }
}