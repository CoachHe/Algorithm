package Section5_字符串问题.D_字符串的统计字符串;
import java.io.*;

public class Mine_Original{
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        System.out.println(getCount(s));
    }
    public static String getCount(String str){
        if(str==null||str.equals("")){
            return "";
        }
        char[] chas=str.toCharArray();
        StringBuffer res=new StringBuffer();
        res.append(chas[0]);
        int num=1;
        for(int i=1;i<chas.length;i++){
            if(chas[i]!=chas[i-1]){
                res.append("_" + num+ "_" + String.valueOf(chas[i]));
                num =1;
            }else{
                num++;
            }
        }
        return res.append("_"+String.valueOf(num)).toString();
    }
}