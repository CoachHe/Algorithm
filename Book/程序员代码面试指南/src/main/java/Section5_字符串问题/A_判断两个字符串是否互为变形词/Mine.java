package Section5_字符串问题.A_判断两个字符串是否互为变形词;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine {
    public static boolean isDeformation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < chars1.length; i++) {
            map[chars1[i]]++;
        }
        for (int i = 0; i < chars2.length; i++) {
            map[chars2[i]]--;
            if (map[chars2[i]] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        while((s=bf.readLine())!=null){
            String[] tmp=s.split(" ");
            int n=Integer.valueOf(tmp[0]);
            int m=Integer.valueOf(tmp[1]);
            String str1=bf.readLine().trim();
            String str2=bf.readLine().trim();
            System.out.println(isDeformation(str1,str2)?"true":"false");
        }
    }
}
