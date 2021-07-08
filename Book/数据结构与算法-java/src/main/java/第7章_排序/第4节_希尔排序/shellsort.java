package 第7章_排序.第4节_希尔排序;

public class shellsort {
    public static <AnyType extends Comparable<? super AnyType>> void
    shellsor(AnyType[] anyTypes) {
        for (int i = 0; i < anyTypes.length / 2; i++) {
            for (int j = 0; j < anyTypes.length; j++) {
                AnyType tmp = anyTypes[i];
                
            }
        }
    }

    public static <AnyType extends Comparable<? super AnyType>> void
    swap(AnyType[] anyTypes, int a, int b) {
        AnyType tmp = anyTypes[a];
        anyTypes[a] = anyTypes[b];
        anyTypes[b] = tmp;
    }
}
