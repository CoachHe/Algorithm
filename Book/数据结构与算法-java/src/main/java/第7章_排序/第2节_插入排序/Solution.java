package 第7章_排序.第2节_插入排序;

public class Solution {
    public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType[] anyTypes) {
        int j;
        for (int p = 1; p < anyTypes.length; p++) {
            AnyType tmp = anyTypes[p];
            for (j = p; j > 0 && tmp.compareTo(anyTypes[j - 1]) < 0; j--) {
                anyTypes[j] = anyTypes[j - 1];
            }
            anyTypes[j] = tmp;
        }
    }
    
}
