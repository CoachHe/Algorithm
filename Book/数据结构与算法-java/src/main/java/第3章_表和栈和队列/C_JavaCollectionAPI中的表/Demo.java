package 第3章_表和栈和队列.C_JavaCollectionAPI中的表;

import java.util.Iterator;
import java.util.List;

public class Demo {


    public static void removeEvensVer1(List<Integer> list) {  //低效但是可行
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i ++;
            }
        }
    }

    public static void removeEvensVer2(List<Integer> list) {
        for (Integer x : list) {
            if (x % 2 == 0) {
                list.remove(x);
            }
        }
    }

    public static void removeEvensVer3(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            if (itr.next() % 2 == 0) {
                itr.remove();
            }
        }
    }



    }
