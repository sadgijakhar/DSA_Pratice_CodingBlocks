package Recusrion_CBA;

import java.util.Scanner;

public class SubsetsRecursion {
   

    // Question
    // Find all the subsets of a given array that sum to k.
    // Input Format
    // The first line contains an integer N , the size of the array. The next line conatins N integers. 
    // The next line contains an integer K.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int Targetsum = sc.nextInt();
        int sum = 0;
        // int count[] = {0} ;
        int ar[] = new int[n];
        int j =0 ;
        // System.out.println(subset(arr, n, 0, sum, count, Targetsum));
        subset1(arr, n, 0, j, sum, Targetsum, ar);
        
        sc.close();
    }

    static int subset(int arr[] ,int n, int i, int sum, int count[],int K){
        if(i < n){
            
            if(sum == K){
                count[0] = count[0]+1;
            }
            sum += arr[i];
            subset(arr,n,i+1,sum,count,K);
            sum = sum-arr[i];
            subset(arr, n, i+1, sum, count, K);

            

        }
        return count[0];
    }

    static void subset1(int arr[] , int n ,int i ,int j ,int sum, int K, int arr1[]){
        if(i < n){
            sum += arr[i];
            arr1[j] = arr[i];
            if(sum == K){

                for(int k = 0 ; k <= j ;k++){
                    System.out.print(arr1[k]+" ");
                }
                System.out.println();
            }
            
            subset1(arr, n, i+1 , j+1 , sum, K, arr1);
            sum = sum - arr[i];
            subset1(arr, n, i+1, j, sum, K, arr1);

        }
    }
}
