package Section7_位运算.B_不用做任何比较判断找出两个数中较大的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine2_Main {
    public static int getMax2(int a, int b) {
        int c = a - b;
        int sign_a = sign(a);
        int sign_b = sign(b);
        int sign_c = sign(c);
        int dif_sign = sign_a ^ sign_b;
        int same_sign = flop(dif_sign);
        int returnA = dif_sign * flop(sign_a) + same_sign * flop(sign_c);
        int returnB = flop(returnA);
        return a * returnA + b * returnB;
    }

    public static int sign(int n) {
        return n >>> 31;
    }

    public static int flop(int n) {
        return n ^ 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        System.out.println(getMax2(a, b));
    }
}
