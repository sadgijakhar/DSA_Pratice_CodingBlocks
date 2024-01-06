package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

// public class RecursionCodesString {
    
//     //Question
//     // Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. 
//     // Write a recursive function (return type Arraylist) to print all possible codes for the string.
//     // E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int n = s.length();
//         int i = 0;
//         String str ="";
//         ArrayList<String> arr = new ArrayList<>();
//         recur(s, arr, n, i, str);
//         sc.close();
//         System.out.println(arr);
//     }

//     static void recur(String s, ArrayList<String> arr, int n, int i, String str){
//         if( i >= n){
//             arr.add(str);
//             return;
//         }
//         else{
//             char c = s.charAt(i);
//             // System.out.println(c);
//             int a = c-'0';

//             // for one letter
//             if(a < 10 && a > 0){
//                 int n1 = 96 + a;
//                 // System.out.println(n1);   
//                 str += String.valueOf((char) n1);
//                 System.out.println(str); 
//                 recur(s, arr, n, i+1, str);
//                 System.out.println(i);
//                 if( i == n-1){
//                     String s1 = str.substring(0,i-2);
//                 // i = i-2;
//                     str = s1;
//                     System.out.println(s1+ " . Sub " + str + " . y . " +i);
//                 }
//                 else{
//                     String s1 = str.substring(0,i);
//                     str = s1;
//                     System.out.println(s1+" Sub " + str + " . y . " +i);
//                 }
//             }

//             // for two letter
//             if(str.length() < n-1){
//                 char t = s.charAt(str.length()+1);
//                 int m = a*10 + t-'0';
//                 if(m < 27 && m >9){
//                     int n1 = 96 + m;
//                     System.out.println(n1);
//                     str += String.valueOf((char)n1);
//                     System.out.println(str);
//                     System.out.println(i+2);
//                     recur(s, arr, n, i+2, str);
// // 
//                     System.out.println(" I LEFT " +i);
//                 }
//             }
            


//         }
//     }
// }

public class RecursionCodesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int i = 0;
        String str = "";
        ArrayList<String> arr = new ArrayList<>();
        recur(s, arr, n, i, str);
        sc.close();
        System.out.println(arr);
    }

    static void recur(String s, ArrayList<String> arr, int n, int i, String str) {
        if (i >= n) {
            arr.add(str);
            return;
        } else {
            char c = s.charAt(i);
            int a = c - '0';

            // For one letter
            if (a < 10 && a > 0) {
                int n1 = 96 + a;
                str += String.valueOf((char) n1);
                recur(s, arr, n, i + 1, str);
                str = str.substring(0, str.length() - 1); // Reset str
            }

            // For two letters
            if (i < n - 1) {
                char t = s.charAt(i + 1);
                int m = a * 10 + t - '0';
                if (m < 27 && m > 9) {
                    int n1 = 96 + m;
                    str += String.valueOf((char) n1);
                    recur(s, arr, n, i + 2, str);
                    str = str.substring(0, str.length() - 1); // Reset str
                }
            }
        }
    }
}
