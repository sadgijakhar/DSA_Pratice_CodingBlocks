package Recusrion_CBA;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrderSmaller {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    char c[] = new char[n];
    for(int i = 0 ; i < n ;i++){
        c[i] = s.charAt(i);
    }
    Arrays.sort(c);
    recurr(c, 0, n , "");
    sc.close();
   } 
   static void recurr(char c[], int i, int n ,String str){
    if(i >= n || i < 0 || str.length() >= n){
        System.out.println(" .   "+str);
        return;
    }
    System.out.println(str);
    recurr(c, i+1, n, str + String.valueOf(c[i]));
    // recurr(c, i-1, n, str + String.valueOf(c[i]));
   }
}
