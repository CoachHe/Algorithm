package Section8_数组和矩阵问题.第54题_螺旋矩阵;

import java.io.*;
public class Main{
    public static void oneCircle(int[][] arr, int k){
        for(int i = k; i < arr[0].length - k; i++){
            System.out.print(arr[k][i] + " ");
        }
        for(int i = k + 1; i < arr.length - k; i++){
            System.out.print(arr[i][arr[0].length - k - 1] + " ");
        }
        for(int i = arr[0].length - k - 2; i > k; i--){
            System.out.print(arr[arr.length - k - 1][i] + " ");
        }
        for(int i = arr.length - k - 1; i > k; i--){
            System.out.print(arr[i][k] + " ");
        }
    }
    public static void printCircle(int[][] arr){
        int k = Math.min(arr.length, arr[0].length) % 2 == 0 ? (Math.min(arr.length, arr[0].length) / 2) : ((Math.min(arr.length, arr[0].length) / 2 ) + 1);
        for(int i = 0; i < k; i++){
            oneCircle(arr, i);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings1 = br.readLine().split(" ");
        int n = Integer.parseInt(strings1[0]);
        int m = Integer.parseInt(strings1[1]);
        int[][] arr = new int[n][m];
        String[] strings;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            strings = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                arr[tmp][j] = Integer.parseInt(strings[j]);
            }
            tmp++;
        }
        printCircle(arr);
    }
}