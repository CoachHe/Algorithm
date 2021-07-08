package Section8_数组和矩阵问题.第118题_杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> reslists = new ArrayList<>();
        if (numRows == 0) {
            return reslists;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> firlist = new ArrayList<>();
        firlist.add(1);
        reslists.add(firlist);
        if (numRows == 1) {
            return reslists;
        }
        for (int i = 0; i < numRows - 1; i++) {
            AddOne(reslists, list);
        }
        return reslists;
    }


    public void AddOne(List<List<Integer>> lists, List<Integer> list) {
        List<Integer> newlist = new ArrayList<>();
        int len = list.size();
        newlist.add(1);
        for (int i = 0; i < len - 1; i++) {
            newlist.add(list.get(i) + list.get(i + 1));
        }
        newlist.add(1);
        lists.add(newlist);
        list.clear();
        list.addAll(newlist);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> reslists = s.generate(2);
        for (List<Integer> list : reslists) {
            for (int tmp : list) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}
