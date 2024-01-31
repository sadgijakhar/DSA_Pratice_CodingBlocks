package PATTERN.upgrad;

import java.util.Arrays;

public class test1 {
   public static void main(String[] args) {
    int arr[] = {5,4,0,3,0,1,2,0,1,0};

    int i = 0 ;
    int j = 0;
    while(j < arr.length && i < arr.length){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;

        }
        i++;
        
    }
    System.out.println(Arrays.toString(arr));
   } 
}
// Arrange the element in such a way that middle element is always smaller than left and right
// Given an integer array of coins of size n representing different type of denominator and an integer sum the task is to count the make to 