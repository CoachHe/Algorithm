package Section5_字符串问题.D_字符串的统计字符串;

public class Mine_Advanced {
    public char getCharAt(String cstr, int index) {
        if (cstr == null || cstr.equals("")) {
            return 0;
        }
        char[] chs = cstr.toCharArray();
        boolean stage = true;
        char cur = 0;
        int num = 0;
        int sum = 0;
        for (int i = 0; i != chs.length; i++) {
            if (chs[i] == '_') {
                stage = !stage;
            } else if (stage) {
                sum += num;
                if (sum > index) {
                    return cur;
                }
                num = 0;
                cur = chs[i];
            } else {
                num = num * 10 + chs[i] - '0';
            }
        }
        return sum + num > index ? cur : 0;
    }
}
