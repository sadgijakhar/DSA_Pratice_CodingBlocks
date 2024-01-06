package Recusrion_CBA;

import java.util.Scanner;

public class RecursionWhAtIsInTheParenthesis {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int i = 0;
    String str ="";
    boolean flag = false;
    recur(s, n, i, str, flag);
    sc.close();
   } 

   static void recur (String s, int n, int i, String str, Boolean flag){
    if(i >= n){
        if(flag){
            System.out.println("");
            return;
        }
        else{
            System.out.println(str);
            return;
        }
        
    }
    char c = s.charAt(i);
    if(c == '(' || c == ')'){
        flag = !flag;
    }
    else if(flag){
        str += String.valueOf(c);
    }
    recur(s, n, i+1, str, flag);
   }
}
