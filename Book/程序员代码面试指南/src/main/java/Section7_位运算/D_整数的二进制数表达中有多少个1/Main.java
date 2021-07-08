package Section7_位运算.D_整数的二进制数表达中有多少个1;

import java.io.*;
public class Main{
    public static int getNum(int n){
        int res = 0;
        while(n != 0){
            n &= (n - 1);
            res++;
        }
        return res;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int N = Integer.parseInt(string);
        System.out.println(getNum(N));
    }
}