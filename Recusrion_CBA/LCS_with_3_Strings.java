package Recusrion_CBA;

import java.util.Scanner;

public class LCS_with_3_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
    
    
        String str = fun(s1, s2, s3);
        System.out.println(str.length());
        sc.close();
    } 
    
       static String fun(String s1, String s2, String s3){
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        String str ="";
    
        for(int i = 0 ; i < n1 ; i++){
            char c = s1.charAt(i);
            for(int j = 0 ; j < n2 ; j++){
                if(s2.charAt(j) == c){
                    for(int k = 0 ; k < n3 ;k++){
                        if(s3.charAt(k) == c){
                            str += c;
                        }
                    }
                }
            }
        }
        return str;
    
       }
}
