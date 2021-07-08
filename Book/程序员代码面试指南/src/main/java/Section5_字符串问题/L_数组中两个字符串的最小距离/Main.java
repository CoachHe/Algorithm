package Section5_字符串问题.L_数组中两个字符串的最小距离;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private HashMap<String, HashMap<String, Integer>> hashMapHashMap = new HashMap<>();
    public Main(String[] strs){
        hashMapHashMap = new HashMap<>();
        HashMap<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i != strs.length; i++) {
            String curStr = strs[i];
            update(indexMap, curStr, i);
            indexMap.put(curStr, i);
        }
    }

    public void update(HashMap<String, Integer> hashMap, String str, int i) {
        if (!hashMapHashMap.containsKey(str)) {
            hashMapHashMap.put(str, new HashMap<String, Integer>());
        }
        HashMap<String, Integer> strMap = hashMapHashMap.get(str);
        for (Map.Entry<String, Integer> lastEntry : hashMap.entrySet()) {
            String key = lastEntry.getKey();
            int index = lastEntry.getValue();
            if (!key.equals(str)) {
                HashMap<String, Integer> lastMap = hashMapHashMap.get(key);
                int curMin = i - index;
                if (strMap.containsKey(key)) {
                    int preMin = strMap.get(key);
                    if (curMin < preMin) {
                        strMap.put(key, curMin);
                        lastMap.put(str, curMin);
                    }
                } else {
                    strMap.put(key, curMin);
                    lastMap.put(str, curMin);
                }
            }

        }
    }

    public int minDistance(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return -1;
        }
        if (str1.equals(str2)) {
            return 0;
        }
        if (hashMapHashMap.containsKey(str1) && hashMapHashMap.get(str1).containsKey(str2)) {
            return hashMapHashMap.get(str1).get(str2);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        String str1 = strings[0];
        String str2 = strings[1];
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }
        Main m = new Main(strs);
        System.out.println(m.minDistance(str1, str2));
    }
}

