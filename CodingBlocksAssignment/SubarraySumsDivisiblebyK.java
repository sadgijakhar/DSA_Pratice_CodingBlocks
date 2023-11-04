package CodingBlocksAssignment;

import java.util.Scanner;

public class SubarraySumsDivisiblebyK {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ;i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();

    
        
        long[] prefixSum = new long[n];
        int count = 0;
        long sum = 0;
        long[] moduloCounts = new long[k];

        for (int i = 0; i < n; i++) {
            sum = (sum + arr[i] % k + k) % k;
            prefixSum[i] = sum;
            moduloCounts[(int) sum]++;
        }

        for (int i = 0; i < k; i++) {
            if (moduloCounts[i] > 1) {
                count += (moduloCounts[i] * (moduloCounts[i] - 1)) / 2;
            }
        }

        count += moduloCounts[0];
        System.out.println(count);

     


    //Brut force
    // int count = 0;
    // for(int i = 0 ; i<n ;i++){
    //     int sum = 0;
    //     for(int j = i ; j < n ; j++ ){
    //         // System.out.println(arr[j]+"--------->"+sum+"---------->"+count);
    //         sum += arr[j];
    //         if(sum % k == 0){
    //             // System.out.println(sum +"-------->"+count);
    //             count++;
    //         } 

    //     }
    // }
    // System.out.println(count);
    sc.close();
   } 
}
