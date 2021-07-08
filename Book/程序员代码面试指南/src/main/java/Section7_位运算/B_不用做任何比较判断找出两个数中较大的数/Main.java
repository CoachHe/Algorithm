package Section7_位运算.B_不用做任何比较判断找出两个数中较大的数;

import java.io.*;
public class Main {
    public static int getMax1(int a, int b) {
        int c = a - b;
        int d = c >> 31;
        return d == 0 ? a : b;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        System.out.println(getMax1(a,b));
    }
}
