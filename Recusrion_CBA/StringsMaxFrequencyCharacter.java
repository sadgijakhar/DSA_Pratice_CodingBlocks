package Recusrion_CBA;

// import java.util.Arrays;
// import java.util.Scanner;

// public class StringsMaxFrequencyCharacter {
//     // Take as input S, a string. Write a function that returns the character with maximum frequency. 
//     // Print the value returned.
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String s = sc.next();
//     int len = s.length();
//     int i = 0;
//     char[] arrq = new char[len];
//     while(i < len){
//         arrq[i] = s.charAt(i);
//         i++;
//     }
//     Arrays.sort(arrq);
//     String str = "";
//     recur(arrq, len, 0 , 1, 0 , str);
//     sc.close();
//    } 
//    static void recur( char[] arr, int length, int i ,int count, int max , String str){
//     if(i+1 >= length){
//         System.out.println(str);
//         return;
//     }
//     if(arr[i] == arr[i+1]){
//         if(max < count){
//             max = count;
//             str = String.valueOf(arr[i]);
//         }
//         recur(arr, length, i+1, count+1, max,str);
//     }
//     else{
//         if(max < count){
//             max = count;
//         }
//         recur(arr, length, i+1, 0, max,str);
//     }

                                   

//    }
// }


import java.util.Arrays;
import java.util.Scanner;

public class StringsMaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        char[] arrq = new char[len];
        for (int i = 0; i < len; i++) {
            arrq[i] = s.charAt(i);
        }
        Arrays.sort(arrq);
        recur(arrq, len, 0, 1, 0, '\0');
        sc.close();
    }

    static void recur(char[] arr, int length, int i, int count, int max, char maxChar) {
        if (i + 1 >= length) {
            if (max < count) {
                System.out.println(arr[i]);
            } else {
                System.out.println(maxChar);
            }
            return;
        }

        if (arr[i] == arr[i + 1]) {
            if (max < count) {
                max = count;
                maxChar = arr[i];
            }
            recur(arr, length, i + 1, count + 1, max, maxChar);
        } else {
            if (max < count) {
                max = count;
                maxChar = arr[i];
            }
            recur(arr, length, i + 1, 1, max, maxChar);
        }
    }
}
