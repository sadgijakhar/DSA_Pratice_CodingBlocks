package CodingBlocksAssignment;

import java.util.*;
public class Buy_and_Sell_Stock {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int sell = arr[i];
            for(int j = 0 ; j < i;j++){
                int buy =arr[j];
                int profit = sell-buy;
                ans = Math.max(ans,profit);

            }
        }

        System.out.println(ans);

        sc.close();
        // int min = arr[0];
        // int minIndex = 0;
        // for(int i = 1 ; i<6;i++){
        //     if(min > arr[i]){
        //         min = arr[i];
        //         minIndex = i;
        //         // System.out.println(min);
        //     }
        // }
        // int max = arr[minIndex];
        // for(int i = minIndex+1 ; i < 7 ;i++){
        //     if(max < arr[i]){
        //         max = arr[i];
        //         // System.out.println(max);
        //     }
        // }

        // if(max-min > 0){
        //     System.out.println(max-min);
        // }
        // else{
        //     System.out.println(0);
        // }
    }
}