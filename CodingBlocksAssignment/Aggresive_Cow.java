package CodingBlocksAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_Cow {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int arr[]= new int [n];
    for(int i = 0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    // int min = 1;
    // Brute force
    // while(true){
    //     int count = c-1;
    //     int left = 0;
    //     int right = 1;
    //     while(right < n){
    //         if(arr[right] - arr[left] >= min){
    //             count--;
    //             left = right; 
    //         } 
    //         right++;
    //     } 
    //     // System.out.println(min);
    //     if(count > 0){
    //         break;
    //     }
    //     min++;
    // }
 
    // System.out.println(min-1);

    //Binary Search
    int low = 1;
    int high = arr[n-1];
    int mid = 0;
    while(low < high){
        mid  = low+(high-low)/2;
        // System.out.println(mid);
        int count = c-1;
        int left = 0;
        int right = 1;
        while(right < n){
            if(arr[right] - arr[left] >= mid){
                count--;
                left = right; 
            } 
            right++;
        } 
        if(count > 0){
            high = mid-1;
        }
        else {
            low = mid+1;
        }
    }
    System.out.println(mid);
    
    sc.close();
   } 
}
