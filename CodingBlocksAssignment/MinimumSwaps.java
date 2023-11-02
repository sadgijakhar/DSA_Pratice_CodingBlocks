package CodingBlocksAssignment;

import java.util.Scanner;
public class MinimumSwaps {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];
    //     for(int i = 0 ;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int minswap = 0;
    //     int i = n-1;
    //     while(i >= 0){
    //         int j = i-1;
    //         while(j>= 0){
    //             if(arr[j] > arr[i]){
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //                 minswap++;
    //                 break;
    //             }
    //             j--;
    //         }
    //         i--;
    //     }
    //     System.out.println(minswap);

    //     sc.close();

    // } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int minswap = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                while (arr[i] != i + 1) {
                    int temp = arr[i];
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;
                    minswap++;
                }
            }
        }
        
        System.out.println(minswap);

        sc.close();
    }


}
