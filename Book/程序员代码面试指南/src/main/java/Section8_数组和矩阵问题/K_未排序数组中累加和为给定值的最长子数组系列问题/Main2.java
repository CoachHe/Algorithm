package Section8_数组和矩阵问题.K_未排序数组中累加和为给定值的最长子数组系列问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
  
public class Main2 {
      
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String temp[]=br.readLine().split(" ");
        int []arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=Integer.parseInt(temp[i]);
        }
          
        for(int p=0;p<arr.length;p++){
            if(arr[p]>0){
                arr[p]=1;
            }
            else if(arr[p]<0){
                arr[p]=-1;
            }
        }
          
        int sum=0,k=0,len=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(!map.containsKey(sum)){
                map.put(sum,j);
            }
            if(map.containsKey(sum-k)){
                int m=map.get(sum-k);
                len=Math.max(len, j-m);
            }
        }
        System.out.println(len);
    }

}