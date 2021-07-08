package Section8_数组和矩阵问题.F_在数组中找到出现次数大于N比K的数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main_2 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] s = input.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int[] nums = new int[n];
        s = input.readLine().split(" ");
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        printMoreThanHalf(nums);
    }
 
    public static void printMoreThanHalf(int[] arrs){
        int deleteValue = 0;
        int count = 0;
        for(int i=0;i!=arrs.length;i++){
            if(count==0){
                deleteValue = arrs[i];
                count = 1;
            }else if(arrs[i]==deleteValue){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i=0;i!=arrs.length;i++){
            if(arrs[i]==deleteValue){
                count++;
            }
        }
 
        if(count>arrs.length/2){
            System.out.print(deleteValue);
        }else{
            System.out.print(-1);
        }
    }
 
}