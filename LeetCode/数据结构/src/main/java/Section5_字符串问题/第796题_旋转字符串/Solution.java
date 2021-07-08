package Section5_字符串问题.第796题_旋转字符串;

public class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) {
            return false;
        }
        String string = B + B;
        return string.contains(A);
    }
}
