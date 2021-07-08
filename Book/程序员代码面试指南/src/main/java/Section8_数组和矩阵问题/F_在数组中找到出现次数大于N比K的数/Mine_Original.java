package Section8_数组和矩阵问题.F_在数组中找到出现次数大于N比K的数;

public class Mine_Original {

    public static void printHalfMajor(int[] arr) {
        int cand = arr[0];
        int times = 1;
        for (int i = 0; i < arr.length; i++) {
            if (times == 0) {
                cand = arr[i];
                times++;
            } else if (cand == arr[i]) {
                times++;
            } else {
                times--;
            }
        }
        times = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cand) {
                times++;
            }
        }
        if (times > arr.length / 2) {
            System.out.println("超过一半的数为： " + cand);
        } else {
            System.out.println("不存在这样的数");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,2,3,1,1,2,3,1,1,3,1,4,5,6,7,8,9,10,11,12,13};
        int[] arr2 = new int[]{1,1,2,3,1,1,2,3,1,1,3};
        printHalfMajor(arr);
        printHalfMajor(arr2);
    }

}
