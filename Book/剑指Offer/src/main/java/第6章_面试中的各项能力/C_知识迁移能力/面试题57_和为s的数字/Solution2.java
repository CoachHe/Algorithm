package 第6章_面试中的各项能力.C_知识迁移能力.面试题57_和为s的数字;

import java.util.ArrayList;

public class Solution2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<Integer> midArray = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int begin = 0;
        int end = 0;
        int tmpsum = 0;
        while (end <= sum) {
            if (tmpsum < sum) {
                tmpsum += end;
                end++;
            } else if (tmpsum > sum) {
                tmpsum -= begin;
                begin++;
            } else {
                midArray = new ArrayList<>();
                for (int i = begin; i <= end - 1; i++) {
                    if (i != 0) {
                        midArray.add(i);
                    }
                }
                res.add(midArray);
                tmpsum -= begin++;
                tmpsum += end++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ArrayList<ArrayList<Integer>> arrayLists = solution2.FindContinuousSequence(15);
        System.out.println(arrayLists);
    }
}