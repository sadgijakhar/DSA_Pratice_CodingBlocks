package Recusrion_CBA;

import java.util.Scanner;

public class PalindromeFunction {
    //Question
    // Write function which returns a boolean, indicating if the input S is a palindrome or not. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int i =0;
        int a =palindrome(str,i,n-1);
        if(a == 0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        sc.close();
    }

    static int palindrome(String str , int i ,int n){
        if(i < n){
            if(str.charAt(i) == str.charAt(n)){
                i++;
                n--;
                return palindrome(str, i, n);
            }  
            else{
                return 0;
            } 
        }
        return 1;

    }

}
