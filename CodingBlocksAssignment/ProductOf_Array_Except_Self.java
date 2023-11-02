package CodingBlocksAssignment;

import java.util.Scanner;
public class ProductOf_Array_Except_Self {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     int left [] = new int[n];
    //     int right[] = new int[n];
    //     int Output[] = new int[n];
    //     left[0] = arr[0];
    //     right[n-1] = arr[n-1];
    //     for(int i = 1 ; i  < n ; i++){
    //         left[i] = left[i-1]*arr[i];
    //     }
    //     for(int i = n-2 ; i  >=  0 ; i--){
    //         right[i] = right[i+1]*arr[i];
    //     }
    //     for(int i = 0 ; i<n ;i++){
    //         if(i == 0){
    //             Output[i] = right[i+1];
    //         }
    //         else if(i ==n-1){
    //             Output[i] = left[i-1];
    //         }
    //         else{
    //             Output[i] = left[i-1]*right[i+1];
    //         }
    //         System.out.print(Output[i]+" ");
    //     }
    //     sc.close();

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left[] = new int[n];
        int right[] = new int[n];
        int Output[] = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            Output[i] = left[i] * right[i];
            System.out.print(Output[i] + " ");
        }
        sc.close();
    }


}


