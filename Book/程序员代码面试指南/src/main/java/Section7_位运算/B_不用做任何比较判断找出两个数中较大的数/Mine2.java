package Section7_位运算.B_不用做任何比较判断找出两个数中较大的数;

public class Mine2 {
    public static int getMax2(int a, int b) {
        int signa = a >>> 31;
        int signb = b >>> 31;
        int signdif = signa ^ signb;
        int difa = a - b;
        int difb = b - a;
        int signda = difa >> 31;
        int signdb = difb >> 31;
        int returna = 1;
        return 0;
    }
}
