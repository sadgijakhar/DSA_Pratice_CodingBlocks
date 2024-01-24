package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean ar[][] = new boolean[n][m];
        ArrayList<Integer> arrr = new ArrayList<>();
        ar[0][0] = true;
        arrr.add(arr[0][0]);
        arrr = recurr(arr, n, m, 0, 0,ar, arrr);
        for(int i : arrr){
            System.out.print(i +" ");
        }
        sc.close();
    
       } 
       static ArrayList<Integer> recurr(int arr[][] , int n ,int m, int i, int j,boolean ar[][], ArrayList<Integer> arrr){
        if( i >= n && i > -1){
            // System.out.println(Arrays.deepToString(arr));
            return arrr;
        }
    
        // Left Diagonal
        if( (i+1 < n) && (j-1 > -1) && !ar[i+1][j-1] ){
            ar[i+1][j-1] = true;
            arrr.add(arr[i+1][j-1]);
            recurr(arr, n, m, i+1, j-1,ar,arrr);
        }
    
        // right diagonal
        else if( i-1 > -1 &&  j+1 < m && !ar[i-1][j+1] ){
            ar[i-1][j+1] = true;
            arrr.add(arr[i-1][j+1]);
            recurr(arr, n, m, i-1, j+1,ar,arrr);
        }
    
        //right
        else if(( i == 0 && j != m-1) || ( i == n-1 && j != m-1) && !ar[i][j+1] ){
            ar[i][j+1] = true;
            arrr.add(arr[i][j+1]);
            recurr(arr, n, m, i, j+1, ar,arrr);
    
        }
        
        // Down
        else if( i+1 < n && !ar[i+1][j]){
            ar[i+1][j] = true;
            arrr.add(arr[i+1][j]);
            recurr(arr, n, m, i+1, j,ar,arrr);
        }
        return arrr;
        
       }
}
