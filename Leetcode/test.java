package Leetcode;

import java.util.ArrayList;

public class test{
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> arr = new ArrayList<>();
        subArray(str, "",arr);
        System.out.println(arr);
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