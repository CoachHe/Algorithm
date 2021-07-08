package Section5_字符串问题.第387题_字符串中的第一个唯一字符;

class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        char[] chars = s.toCharArray();
        int res = -1;
        boolean judge = false;
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars.length; j++){
                if(i != j){
                    if(chars[i] == chars[j]){
                        judge = true;
                        break;
                    }
                }
            }
            if(judge == false){
                return i ;
            }
            judge = false;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstUniqChar("loveleetcode"));
    }
}
