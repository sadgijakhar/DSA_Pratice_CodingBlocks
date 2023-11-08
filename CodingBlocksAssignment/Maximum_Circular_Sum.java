package CodingBlocksAssignment;

import java.util.Scanner;

public class Maximum_Circular_Sum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ;i <n ;i++){
        arr[i] = sc.nextInt();
    }
    // int sum = 0;
    // int max = 0;
    // int index = 0;
    // for(int i = 0 ; i < n ; i++){
    //     if(max < arr[i]){
    //         max = arr[i];
    //         index = i;
    //     }
    // }
    // int a  = n ;
    // while(a > 0){
    //     // int i = index;
    //     int sum1 = 0;
    //     for(int i =  0 ; i  < a ;i++){
    //         sum1 += arr[(i - 1 + n) % n];
    //     }
    //     a--;
    // }
    sc.close();
   } 
}
