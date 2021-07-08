package Section4_递归和动态规划.第70题_爬楼梯;

public class Solution_Dynamic {
    public int climbStairs(int n){
        int f_0 = 0;
        int f_1 = 1;
        int tmp = 0;
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            tmp = f_0 + f_1;
            f_0 = f_1;
            f_1 = tmp;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution_Dynamic s = new Solution_Dynamic();
        System.out.println(s.climbStairs(3));
    }
}
