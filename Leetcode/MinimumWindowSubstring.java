package Leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        minWindow(s, t);

    } 
    static String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        if( s.length() == t.length()){
            if(s.equals(t)){
                return s;
            }
            else{
                return "";
            }
        }
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0 ; i < t.length() ; i++){
            arr.add(t.charAt(i));
        }
        String str  = "";
        // int i = 0;
        ArrayList<String> arr1 = new ArrayList<>();
        subArray(s , str,arr1);
        arr1.sort(Comparator.comparingInt(String::length));
        System.out.println(arr1);
        for(String s1 : arr1){
            if(s1.length() >= t.length()){
                HashMap<Character, Integer> hm = new HashMap<>();
                int i = 0;
                while(i <= t.length()){
                    hm.put(t.charAt(i),0);
                }

            }
        }
        
        return s;
    }
    static void subArray(String str, String s, ArrayList<String> arr) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                s += str.charAt(j);
                arr.add(s); 
                // System.out.println(s); // Print the substring (optional)
            }
            s = ""; 
        }
    }
}
