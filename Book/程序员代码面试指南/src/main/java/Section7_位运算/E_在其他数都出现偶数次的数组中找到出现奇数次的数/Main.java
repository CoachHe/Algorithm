package Section7_位运算.E_在其他数都出现偶数次的数组中找到出现奇数次的数;

import java.io.*;
public class Main{
    public static int getNum(int[] arr){
        int res = 0;
        for(int tmp:arr){
            res ^= tmp;
        }
        return res;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] strings = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(getNum(arr));
    }
}