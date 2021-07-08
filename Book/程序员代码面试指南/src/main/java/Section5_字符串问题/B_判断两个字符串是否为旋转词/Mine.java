package Section5_字符串问题.B_判断两个字符串是否为旋转词;

public class Mine {
    public static boolean isRotation(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        String string = b + b;
        return string.contains(a);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("12345", "34512"));
    }
}
