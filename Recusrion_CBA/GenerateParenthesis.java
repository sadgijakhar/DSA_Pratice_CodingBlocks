package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateParenthesis {
    // Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
    // The output strings should be printed in the sorted order considering '(' has higher value than ')'.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "(";
        int index = 1;
        ArrayList<String> arr = new ArrayList<>();
        arr = recurr(n, str, index, 1 ,arr);
        for(String t : arr){
            System.out.println(t);
        }
        sc.close();
    }

    static ArrayList<String> recurr(int n, String str, int index, int j, ArrayList<String> arr) {
        if (index == n  && j == 0) {
            arr.add(0,str);
            return arr;
        }
        
        // System.out.println(str + index);
        if(index < n){
            recurr(n, str + "(", index + 1, j + 1,arr);
        }

        if(j > 0){
            recurr(n, str+")", index, j-1,arr);
        }
        return arr;

        
        // recurr(n, str + ")", index, j - 1);
    }
}
