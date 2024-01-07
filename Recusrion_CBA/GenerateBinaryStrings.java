package Recusrion_CBA;

import java.util.Scanner;

public class GenerateBinaryStrings {

    // Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings 
    // that can be formed by replacing each wildcard character by ‘0’ or ‘1’.
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    for(int i = 0 ; i < n ;i++){
        String str = sc.next();
        int m = str.length();
        String S = "";
        recurr(str, S, 0, m);
        System.out.println();

    }
    sc.close();
   } 

   static void recurr(String str, String S, int i , int n){
    if(i >= n){
        System.out.print(S+" ");
        return;
    }
    char c = str.charAt(i);
    if(c != '?'){
        recurr(str, S+String.valueOf(c), i+1, n);
    }
    else{
        recurr(str, S+"0", i+1, n);
        // S = S.substring(0,S.length()-1);
        recurr(str, S+"1", i+1, n);
    }
   }
}
