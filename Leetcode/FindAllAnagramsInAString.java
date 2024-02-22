package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    } 

    static List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()){
            return new ArrayList<>();
        }
        int T[] = new int[26];
        int src[] = new int[26];
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < p.length() ;i++){
            T[p.charAt(i)-'a']++;
            src[s.charAt(i) -'a']++;
        }
        if(Arrays.equals(T, src)){
            arr.add(0);
        }
        int n = p.length();
        for(int i = n ; i < s.length() ;i++){
            src[s.charAt(i) -'a']++;
            src[s.charAt(i-n)-'a']--;
            if(Arrays.equals(src, T)){
                arr.add(i-n+1);
            }
        }
        return arr;
    }
}
