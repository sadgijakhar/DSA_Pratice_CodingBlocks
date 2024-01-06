package Recusrion_CBA;

import java.util.Scanner;

public class PlayingWithGoodStrings {
   public static void main(String[] args) {
    // Question
    // A Good String is a string which contains only vowels (a,e,i,o,u) . 
    // Given a string S, print a single positive integer N where N is the length of the longest substring of S that
    // is also a Good String.

    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();
    int index = 0;
    int count = 0;
    int max = 0;
    recur(len, index, str, count, max);
    sc.close();

    
   } 

   static void recur(int len , int i, String str, int count,int max){
    if(i >= len){
        if(max < count){
            max = count;
        }
        System.out.println(max);
        return;
    }
    char c = str.charAt(i);
    if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u'){
        if(max < count){
            max = count;
        }
        // System.out.println(c);
        // System.out.println("count "+count);
        // System.out.println("MAX " +max);

        recur(len, i+1, str, count+1 ,max);
    }
    else{
        if(max < count){
            max = count;
        }
        // System.out.println(c);
        // System.out.println("count "+count);
        // System.out.println("MAX " +max);
        recur(len, i+1, str, 0,max);
    }
    
   }
}
