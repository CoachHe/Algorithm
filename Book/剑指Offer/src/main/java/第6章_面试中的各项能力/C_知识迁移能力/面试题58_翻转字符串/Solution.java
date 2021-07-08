package 第6章_面试中的各项能力.C_知识迁移能力.面试题58_翻转字符串;

public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return " ";
        }
        String[] strings = str.split(" ");
        String res = "";
        for (int i = 0; i < strings.length / 2; i++) {
            String tmp = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - 1 - i] = tmp;
        }
        for (int i = 0; i < strings.length; i++) {
            res += strings[i] + " ";
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.ReverseSentence("I am a student.");
        System.out.println(res);
    }
}