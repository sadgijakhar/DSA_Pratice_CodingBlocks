package Leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
   public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    int n = arr.length;

    int left[] = new int[n];
    int product = 1;
    for(int i = 0 ; i < n ; i++){
        product *= arr[i];
        left[i] = product;
    }

    int right[] = new int[n];
    product = 1;
    for(int i = n-1 ; i >= 0 ; i--){
        product *= arr[i];
        right[i] = product;
    }
    int i = 0 ; 
    while(i < n ){
        if(i == 0){
            arr[i] = right[i+1];
        }
        else if(i == n-1){
            arr[i] = left[i-1];
        }
        else{
            arr[i] = left[i-1]*right[i+1];
        }
        i++;
    }
    System.out.println(Arrays.toString(arr));
   } 
}
