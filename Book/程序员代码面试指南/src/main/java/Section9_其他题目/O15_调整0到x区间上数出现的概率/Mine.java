package Section9_其他题目.O15_调整0到x区间上数出现的概率;

public class Mine {
    public double randXPowerK(int k) {
        if (k < 1) {
            return 0;
        }
        return Math.max(power2(), randXPowerK(k - 1));
    }

    public double power2() {
        return Math.max(Math.random(), Math.random());
    }

    public static void main(String[] args) {
        Mine s = new Mine();
        System.out.println(s.randXPowerK(5));
    }
}
