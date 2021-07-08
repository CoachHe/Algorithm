package Section7_位运算.A_不用额外变量交换两个整数的值;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void chan_num(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings1 = br.readLine().split(" ");
        int a = Integer.parseInt(strings1[0]);
        int b = Integer.parseInt(strings1[1]);
        chan_num(a, b);
    }
}