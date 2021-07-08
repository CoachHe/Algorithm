package Section7_位运算.F_在其他数都出现k次的数组中找到只出现一次的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
     
    static int getOnlyOne(int[]arr,int k){
        int[] eor =  new int[32];
        for(int i=0;i<arr.length;i++){
            int[] kRadixNum = getKRadixNum(arr[i],k);
            for(int j=0;j<eor.length;j++){
                eor[j] = (eor[j]+ kRadixNum[j])%k;
            }
             
        }
         
        return getNumFromKRadix(eor,k);
    }
    static int[] getKRadixNum(int val,int k){
        int[] res = new int[32];
        int idx =0;
        while(val!=0){
            res[idx++] = val%k;
            val /= k;
            
        }
        return res;
    }
    static int getNumFromKRadix(int[] eor,int k){
        int res =0;
        for(int i=eor.length-1;i>=0;i--){
            res = res*k + eor[i];
        }
        return res;
    }
    public static void main(String[] args) throws  IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=bf.readLine())!=null) {
            String[] ss = s.split(" ");
            int n = Integer.valueOf(ss[0]);
            int k = Integer.valueOf(ss[1]);
            String[] arrStr = bf.readLine().split(" ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.valueOf(arrStr[i]);
            }
             
            System.out.println(getOnlyOne(arr,k));
 
 
        }
    }
}
