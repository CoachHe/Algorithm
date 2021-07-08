package Section4_递归和动态规划.C_换钱的最少货币数;

public class Mine_Recursive {
    public int minCoins1(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return -1;
        }
        return process(arr, aim, 0);
    }

    public int process(int[] arr, int aim, int i) {
        if (i == arr.length) {
            return aim == 0 ? 0 : -1;
        }
        int res = -1;
        for (int k = 0; k * arr[i] < aim; k++) {
            int next = process(arr, aim - k * arr[i], i + 1);
            if (next != -1) {
                res = res == -1 ? next + k : Math.min(res, next + k);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Mine_Recursive m = new Mine_Recursive();
        int[] arr = new int[]{5, 2, 3};
        int i = m.minCoins1(arr, 10);
        System.out.println(i);
    }
}
