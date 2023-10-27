package CodingBlocksAssignment;

import java.util.Scanner;
public class ProductOf_Array_Except_Self {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        // Calculate the product of elements to the left of each element
        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        // Calculate the product of elements to the right of each element
        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * arr[i + 1];
        }

        int[] result = new int[n];

        // Calculate the final result using leftProduct and rightProduct
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     int[] leftProduct = new int[n];
    //     int[] rightProduct = new int[n];

    //     int product = 1;
    //     for (int i = 0; i < n; i++) {
    //         leftProduct[i] = product;
    //         product *= arr[i];
    //     }

    //     product = 1;
    //     for (int i = n - 1; i >= 0; i--) {
    //         rightProduct[i] = product;
    //         product *= arr[i];
    //     }

    //     int[] result = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         result[i] = leftProduct[i] * rightProduct[i];
    //     }

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(result[i] + " ");
    //     }

    //     sc.close();
    // }
}


