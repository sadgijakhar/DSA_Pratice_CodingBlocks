package Leetcode;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
    }
    static void transpose(int arr[][]){
        // int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr[0].length ;j++){
                if(i == j){
                    continue;
                }
                else{
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            reverse(arr[i]);
        }

        System.out.println(Arrays.deepToString(arr));
    }

    static void reverse(int arr[]){
        int n= arr.length-1;
        for(int i = 0 ; i < (n+1)/2;i++){
            int temp = arr[i];
            arr[i] = arr[n] ;
            arr[n] = temp;
        }
    }
}
