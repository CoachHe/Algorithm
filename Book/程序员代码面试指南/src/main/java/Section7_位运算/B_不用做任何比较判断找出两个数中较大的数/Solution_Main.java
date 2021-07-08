package Section7_位运算.B_不用做任何比较判断找出两个数中较大的数;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Main {
    public static int sign(int n) {
        return flip(n >>> 31);
    }

    public static int flip(int n) {
        return n ^ 1;
    }

    public static int getMax2(int a, int b) {
        int c = a - b;
        int sa = sign(a);
        int sb = sign(b);
        int sc = sign(c);
        int difSab = sa ^ sb;
        int sameSab = flip(difSab);
        int returnA = difSab * sa + sameSab * sc;
        int returnB = flip(returnA);
        return a * returnA + b * returnB;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        System.out.println(getMax2(a, b));
    }
}
