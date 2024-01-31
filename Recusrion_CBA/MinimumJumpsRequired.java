package Recusrion_CBA;

import java.util.Scanner;

public class MinimumJumpsRequired {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while(t > 0){
        int n = sc.nextInt();
        if(n == 0){
            // System.out.println(Integer.max(Infinity));
        }
        else{
            int arr[] = new int[n];
            for(int i = 0 ; i < n-1 ; i++){
                arr[i] = sc.nextInt();
            }
            int min [] = {Integer.MAX_VALUE};
            System.out.println(recurr(arr, n, min, 0, 0));
        }
        t--;
    }
    sc.close();
   } 


   static int recurr(int arr[] , int n , int[] min, int i, int jumps){
    if(i >= n){
        min[0] = Math.min(min[0] , jumps);
        // System.out.println(min);
        return min[0];
    }


    for(int j = 0 ; j < arr[i] ; j++){
        recurr(arr, n, min, arr[j]+i, jumps+1);
    }
    
    return min[0];

   }
}
