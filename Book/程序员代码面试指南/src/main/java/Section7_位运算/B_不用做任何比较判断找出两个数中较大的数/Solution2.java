package Section7_位运算.B_不用做任何比较判断找出两个数中较大的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public int sign(int n) {
        return flip(n >>> 31);
    }

    public int flip(int n) {
        return n ^ 1;
    }

    public int getMax1(int a, int b) {
        int c = a - b;
        int scA = sign(c);
        int scB = flip(scA);
        return a * scA + b * scB;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        Solution2 s2= new Solution2();
        System.out.println(s2.getMax1(a, b));
    }
}
