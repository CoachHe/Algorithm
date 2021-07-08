package Section5_字符串问题.第58题_最后一个单词的长度;

class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int last_index = chars.length - 1;
        while(last_index >= 0 && chars[last_index] == ' '){
            last_index--;
        }
        if(last_index == -1){
            return 0;
        }
        for(int i = last_index; i >= 0; i--){
            if(chars[i] == ' '){
                return last_index - i;
            }
        }
        return last_index + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord("a"));
    }
}