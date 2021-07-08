package Section5_字符串问题.第49题_字母异位分词;

public class test {

    public static void main(String[] args) {
        System.out.println('a' ^ 'b');
        System.out.println(0 ^ 5);
        String string1 = "pit";
        String string2 = "pro";
        int tmp = 0;
        for (char tmpchar : string1.toCharArray()) {
            tmp ^= tmpchar;
        }
        for (char tmpchar : string2.toCharArray()) {
            tmp ^= tmpchar;
        }
        System.out.println("tmp = " + tmp);
        System.out.println('p' ^ 'p' ^ 'i' ^ 'r' ^ 't' ^ 'o');
        System.out.println(1 ^ 1);
    }
}
