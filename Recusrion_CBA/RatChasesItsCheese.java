package Recusrion_CBA;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesItsCheese {
    static boolean b = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        // int arr1[][] = new int[n][m];
        recurr(0, 0, arr);

        sc.close();
    } 
    static void recurr (int i ,int j , char[][] arr){
    
        int n = arr.length;
        int m =  arr[0].length;
        // int arr1[][] = new int[n][m];

    
        if(i >= n || j >= m || i < 0 || j < 0 || arr[i][j] == 'X' || b || arr[i][j] == '1'){
            return;
        }
        if (i == n - 1 && j == m - 1) {
            arr[i][j] = '1';
            print(arr);
            
            b = true;
            return;
        }
        arr[i][j] = '1'; 
        recurr(i-1, j, arr);
        recurr(i, j+1, arr);
        recurr(i, j-1, arr);
        recurr(i+1, j, arr);
        arr[i][j] = '0';
    }
    static void print(char arr[][]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if(arr[i][j] == '1'){
                    System.out.print('1'+" ");
                }
                else{
                    System.out.print('0'+" ");
                }
            }
            System.out.println();

        }
    }

//    5
//    4
//    O X O O
//    O O O X
//    X O X O
//    X O O X
//    X X O O
}
