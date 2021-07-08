package Section8_数组和矩阵问题.第728题_两数之和;

public class Solution2 {
    public int monotoneIncreasingDigits(int N) {
        char[] arrN = Integer.toString(N).toCharArray();
        int len = arrN.length;
        if (len == 0 || len == 1) {
            return N;
        }
        while (len > 1) {
            if (arrN[len - 1] < arrN[len - 2]) {
                arrN[len - 1] = '9';
                arrN[len - 2] -= 1;
            }
            while (len < arrN.length && arrN[len - 1] > arrN[len]) {
                arrN[len] = '9';
                len++;
            }
            len--;
        }
        return Integer.parseInt(new String(arrN));
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.monotoneIncreasingDigits(120));
    }
}
