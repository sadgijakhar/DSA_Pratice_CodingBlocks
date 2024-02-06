package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        // String[] str = {"eat","tea","nat","ate","tan","bat"};
        String [] str = {""};
        System.out.println(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();

        for(String s : strs){
            char[]  c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(mp.containsKey(str)){
                ans.get(mp.get(str)).add(s);
            }
            else{
                mp.put(str, ans.size());
                ans.add(new ArrayList<>(Arrays.asList(s)));
            }
        }
        return ans;
    }
}
