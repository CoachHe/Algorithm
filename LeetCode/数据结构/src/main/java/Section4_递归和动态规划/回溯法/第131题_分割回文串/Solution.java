package Section4_递归和动态规划.回溯法.第131题_分割回文串;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    int len = 0;
    List<List<String>> list = new LinkedList<>();
    Stack<String> stack = new Stack<>();
    public List<List<String>> partition(String s) {
        len = s.length();
        if (len == 0) {
            return list;
        }
        tmp_par(s, 0);
        return list;
    }

    public void tmp_par(String s, int index) {
        if (index == len) {
            list.add(new LinkedList<>(stack));
        }
        for (int i = index; i < len; i++) {
            if (!check_par(s, index, i)) {
                continue;
            }
            stack.add(s.substring(index, i + 1));
            tmp_par(s, i + 1);
            stack.pop();
        }
    }

    public boolean check_par(String s, int begin, int end) {
        while (begin <= end) {
            if (s.charAt(begin++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.partition("aab"));
    }
}
