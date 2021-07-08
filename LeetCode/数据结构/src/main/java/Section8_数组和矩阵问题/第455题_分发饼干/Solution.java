package Section8_数组和矩阵问题.第455题_分发饼干;

import java.util.Arrays;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int g_index = g.length - 1;
        int s_index = s.length - 1;
        while (s_index >= 0 && g_index >= 0) {
            if (s[s_index] >= g[g_index]) {
                res++;
                s_index--;
            }
            g_index--;
        }
        return res;
    }



    public static void main(String[] args) {
        Solution so = new Solution();
        int[] g = new int[]{1, 2};
        int[] s = new int[]{1, 2, 3};
        System.out.println(so.findContentChildren(g,s));
    }
}
