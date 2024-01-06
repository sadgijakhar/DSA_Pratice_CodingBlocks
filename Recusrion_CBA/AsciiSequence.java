package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;



public class AsciiSequence{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        countAsciiSubsequences(str, 0, "");
        ArrayList<String> arr = new ArrayList<>();
        arr.add(" ");
        printAsciiSubsequences(arr,str, 0, "");
        System.out.println(arr.size());
        for(String str1 : arr){
            System.out.print(str1+" ");
        }
        sc.close();
    }


    static int countAsciiSubsequences(String str, int index, String current) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                return 1;
            }
            return 0;
        }

        int countWithoutCurrent = countAsciiSubsequences(str, index + 1, current);

        int countWithCurrent = countAsciiSubsequences(str, index + 1, current + str.charAt(index));

        return countWithoutCurrent + countWithCurrent;
    }


    static ArrayList<String>  printAsciiSubsequences(ArrayList<String> arr,String str, int index, String current) {
        if (index == str.length()) {

            if (!current.isEmpty()) {
                arr.add(current);
            }
            return arr;
        }

        printAsciiSubsequences(arr,str, index + 1, current);

        printAsciiSubsequences(arr,str, index + 1, current + str.charAt(index));

        return printAsciiSubsequences(arr,str, index + 1, current + (int) str.charAt(index));

    }
}
