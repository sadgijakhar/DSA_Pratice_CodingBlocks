package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessboardProblem_Count_Print {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int arr[][] = new int[n][n];
    ArrayList<String> arr1 = new ArrayList<>();
    String s ="{0-0}";
    arr1 = recurr(n, 0, 0, arr1, s);
    for(String t : arr1){
        System.out.print(t+" ");
    }
    System.out.println();
    System.out.println(arr1.size());
    sc.close();
   } 

   static ArrayList<String> recurr(int n, int i , int j, ArrayList<String> arr , String s){
    if( i > n || j > n){
        return arr;
    }
    if( i== n-1 && j == n-1){
        arr.add(s);
        return arr;
    }
    // System.out.println(s);
    recurr(n, i+2, j+1,arr,s+"K{"+(i+2)+"-"+(j+1)+"}");
    recurr(n, i+1, j+2,arr,s+"K{"+(i+1)+"-"+(j+2)+"}");

    for(int r = 1 ; r < n ; r++){
        recurr(n, i, j+r, arr, s+"R{"+(i)+"-"+(j+r)+"}");
        recurr(n, i+r, j, arr, s+"R{"+(i+r)+"-"+(j)+"}");
    }

    for(int b = 1 ; b < n ; b++){
        recurr(n, i+b, j+b, arr, s+"B{"+(i+b)+"-"+(j+b)+"}");
    }
    return arr;
   }
}
