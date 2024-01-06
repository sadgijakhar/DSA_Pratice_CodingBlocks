// package Recusrion_CBA;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.Scanner;

// public class RecursionAsciiSubsequences {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String str = sc.next();
//     int n = str.length();
//     char ch [] = new char[n];
//     for(int i = 0 ; i < n ; i++){
//         ch[i] = str.charAt(i);
//     }
//     int i = 0;
    
//     ArrayList<String> s1 = new ArrayList<>();
//     s1.add(" ");
//     String s = "";
//     subset(ch, n, i, s1,s);
//     Collections.sort(s1, Comparator.comparing(String::length));
//     System.out.println(s1.size());
//     System.out.println(s1);

//     int m = s1.size();
//     for(int j = 1 ; j < m ;j++){
//         String stri = s1.get(j);
//         String get = ascii(stri);
//         s1.add(get);
//     }
//     System.out.println(s1);
    
    
//     sc.close();
//    } 

//    static ArrayList<String> subset(char str[] , int n, int i, ArrayList<String> arr, String s1){
//     if(i < n){
//         s1 += String.valueOf(str[i]);
//         arr.add(String.valueOf(s1));

//         subset(str,n,i+1,arr,s1);
        

//         String s2 = s1.substring(0, i);

//         subset(str, n, i+1, arr,s2);
//         // System.out.println(arr );
//         // System.out.println(count);

//     }
//     return arr;

//    }
//    static String ascii(String s1) {
//         if (s1.isEmpty()) {
//             return "";
//         }

//         char currentChar = s1.charAt(0);
//         String asciiRepresentation = Integer.toString((int) currentChar);

//         if (s1.length() > 1) {
//             asciiRepresentation += ascii(s1.substring(1));
//         }

//         return asciiRepresentation;
//     }

    
//     // String s1 = arr.get(i);

// }

package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RecursionAsciiSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char ch[] = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }
        int i = 0;

        ArrayList<String> s1 = new ArrayList<>();
        s1.add(" ");
        StringBuilder s = new StringBuilder();
        subset(ch, n, i, s1, s);
        Collections.sort(s1, Comparator.comparing(String::length));
        System.out.println(s1.size());
        System.out.println(s1);

        int m = s1.size();
        for (int j = 1; j < m; j++) {
            String stri = s1.get(j);
            String get = ascii(stri);
            s1.add(get);
        }
        System.out.println(s1);

        sc.close();
    }

    static ArrayList<String> subset(char str[], int n, int i, ArrayList<String> arr, StringBuilder s1) {
        if (i < n) {
            s1.append(str[i]);
            arr.add(s1.toString());

            subset(str, n, i + 1, arr, s1);

            s1.deleteCharAt(s1.length() - 1); 

            subset(str, n, i + 1, arr, s1);
        }
        return arr;
    }

    static String ascii(String s1) {
        if (s1.isEmpty()) {
            return "";
        }

        char currentChar = s1.charAt(0);
        String asciiRepresentation = Integer.toString((int) currentChar);

        if (s1.length() > 1) {
            asciiRepresentation += ascii(s1.substring(1));
        }

        return asciiRepresentation;
    }
}
