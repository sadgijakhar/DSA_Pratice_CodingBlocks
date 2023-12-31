package Recusrion_CBA;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0 ;i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int Search = sc.nextInt();
        System.out.println(matrix(arr, n-1,m-1,Search));
        sc.close();
    }

    static int matrix(int arr[][], int i, int j, int Search){
        if(i >= 0 && j >= 0){
            if(arr[i][j] == Search){
                return 1;
            }
            else if(arr[i][j] > Search){
                j--;
                // System.out.println(arr[i][j]);
                return matrix(arr, i, j, Search);
            }
            else{
                i--;
                j = arr[0].length- 1;
                // System.out.println(arr[i][j]);
                return matrix(arr, i, j, Search);
            }
        }
        
        return 0;
    }
}
