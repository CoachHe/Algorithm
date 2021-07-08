package Section8_数组和矩阵问题.第17题_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public HashSet<String> add(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        if (hashSet1.size() == 0) {
            return hashSet2;
        } else if (hashSet2.size() == 0) {
            return hashSet1;
        }
        HashSet<String> resHash = new HashSet<>();
        for (String tmp : hashSet1){
            for (String tmp2 : hashSet2){
                resHash.add(tmp + tmp2);
            }
        }
        return resHash;
    }

    public List<String> letterCombinations(String str){
        char[] chars = str.toCharArray();
        HashSet<String> hashSet = new HashSet<>();
        List<String> res = new ArrayList<>();
        for (char tmp : chars) {
            if (tmp == '2') {
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("a");
                tmp_hash.add("b");
                tmp_hash.add("c");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '3'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("d");
                tmp_hash.add("e");
                tmp_hash.add("f");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '4'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("g");
                tmp_hash.add("h");
                tmp_hash.add("i");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '5'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("j");
                tmp_hash.add("k");
                tmp_hash.add("l");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '6'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("m");
                tmp_hash.add("n");
                tmp_hash.add("o");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '7'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("p");
                tmp_hash.add("q");
                tmp_hash.add("r");
                tmp_hash.add("s");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '8'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("t");
                tmp_hash.add("u");
                tmp_hash.add("v");
                hashSet = add(hashSet, tmp_hash);
            } else if (tmp == '9'){
                HashSet<String> tmp_hash = new HashSet<>();
                tmp_hash.add("w");
                tmp_hash.add("x");
                tmp_hash.add("y");
                tmp_hash.add("z");
                hashSet = add(hashSet, tmp_hash);
            }
        }
        for (String tmp : hashSet) {
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> list = s.letterCombinations("23");
        System.out.println(list);
    }

}
