package Recusrion_CBA;

import java.util.Scanner;
import java.util.ArrayList;
public class RecursionSubsequences {

    // Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

    // a. Write a recursive function which returns the count of subsequences for a given string. 
    // Print the value returned.

    // b. Write a recursive function which prints all possible subsequences for a “abcd” has 
    // following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    ArrayList<String> arr = new ArrayList<>();
    arr = recurr(s, "", arr, s.length(), 0);
    for(String st : arr){
        System.out.print(st+" ");
    }
    System.out.println();
    System.out.println(arr.size());
    sc.close();
   } 

   static ArrayList<String> recurr(String s , String str , ArrayList<String> arr, int n, int i){
    if(i >= n){
        arr.add(0,str);
        return arr;
    }
    
    char c = s.charAt(i);
    // System.out.println(c);
    recurr(s, str+String.valueOf(c), arr, n, i+1);
    // str = str.substring(0,str.length()-1);
    recurr(s, str, arr, n, i+1);
    return arr;

   }
}
