package Section7_位运算.C_只用位运算不用算术运算实现整数的加减乘除运算;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int add(int a, int b) {
        int c = 0;
        while ((a & b) << 1 != 0) {
            c = a ^ b;
            b = (a & b) << 1;
            a = c;
        }
        c = a ^ b;
        return c;
    }

    public static int del(int a, int b) {
        int c = add(a, ~b);
        c = add(c, 1);
        return c;
    }

    public static int mul(int a, int b) {
        int c = 0;
        while(b != 0){
            if ((b & 1) == 1){
                c = add(c, a);
            }
            a = a << 1;
            b = b >>> 1;
        }
        return c;
    }

    public static int div(int a, int b) {
        int c = 0;
        int x = isNeg(a) ? add(~a, 1) : a;
        int y = isNeg(b) ? add(~b, 1) : b;
        for (int i = 31; i >= 0; i = del(i, 1)) {
//            if ((y << i) <= x) {
            if ((x >> i) >= y) {
                c = add(c, 1 << i);
                x = del(x, y << i);
            }
        }
//        return ((add(a >>> 31, b >>> 31) & 1) << 31) | c;
        return isNeg(a) ^ isNeg(b) ? add(~c, 1) : c;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("divisor is 0");
        }
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return 1;
        } else if (b == Integer.MIN_VALUE) {
            return 0;
        } else if (a == Integer.MIN_VALUE) {
            int res = div(add(a, 1), b);
            return add(res, div(del(a, mul(res, b)), b));
        } else {
            return div(a, b);
        }
    }

    public static boolean isNeg(int n) {
        return n < 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        if (strings[1].equals("+")) {
            System.out.println(add(a, b));
        } else if (strings[1].equals("-")) {
            System.out.println(del(a, b));
        } else if (strings[1].equals("*")) {
            System.out.println(mul(a, b));
        } else {
            System.out.println(divide(a, b));
        }
    }

}
