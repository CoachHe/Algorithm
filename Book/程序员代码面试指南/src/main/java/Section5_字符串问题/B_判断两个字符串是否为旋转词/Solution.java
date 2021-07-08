package Section5_字符串问题.B_判断两个字符串是否为旋转词;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static boolean isRotation(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        String b2 = b + b;
        return b2.indexOf(a) != -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=br.readLine().split(" ");
        int n=Integer.parseInt(strings[0]);
        int m=Integer.parseInt(strings[1]);
        String str1=br.readLine();
        String str2=br.readLine();
        if(n!=m){
            System.out.println("NO");
            return ;
        }
        System.out.println(isRotation(str1,str2)?"YES":"NO");
    }
}
