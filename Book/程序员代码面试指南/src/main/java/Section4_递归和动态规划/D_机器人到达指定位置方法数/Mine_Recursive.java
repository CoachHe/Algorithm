package Section4_递归和动态规划.D_机器人到达指定位置方法数;

public class Mine_Recursive {
    public int walk(int N, int cur, int rest, int P) {
        if (rest == 0) {
            return cur == P ? 1 : 0;
        }
        if (cur == 1) {
            return walk(N, cur + 1, rest - 1, P);
        }
        if (cur == N) {
            return walk(N, cur - 1, rest - 1, P);
        }
        return walk(N, cur - 1, rest - 1, P) + walk(N, cur + 1, rest - 1, P);
    }

    public int ways1(int N, int M, int K, int P) {
        if (P < 1 || P > N || K < 0 || M < 1 || M > N) {
            return 0;
        }
        return walk(N, M, K, P);
    }

    public static void main(String[] args) {
        Mine_Recursive m = new Mine_Recursive();
        System.out.println(m.ways1(5, 2, 3, 3));
    }
}
