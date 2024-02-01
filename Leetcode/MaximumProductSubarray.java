package Leetcode;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        // int n = 4;
        // int arr[] = {2,3,-2,4};

        int n = 3;
        int arr[] = {-2,3,-4};

        // int n = 1;
        // int arr[] = {-2};

        // int n = 3;
        // int arr[] = {-3,-1,-1};

        // int n = 2;
        // int arr[] = {0,2};
    
        // int n = 3;
        // int arr[] ={-2,0,-1};
        int k = 0;
        int product = Integer.MIN_VALUE;
        int newPr = 1;
        while(k < n){
            newPr *= arr[k];
            System.out.println(newPr);
            newPr = Math.max(arr[k], newPr);
            product = Math.max(newPr, product);
            System.out.println(product+" . "+newPr);
            k++;
        }
    
        System.out.println(product);
        
    } 

    //  Average Case Solution

    // public static void main(String[] args) {
    //     int n = 4;
    //     int arr[] = {2,3,-2,4};
    //     // int n = 1;
    //     // int arr[] = {-2};
    
    //     // int n = 3;
    //     // int arr[] ={-2,0,-1};
    //     int k = 0;
    //     int product = Integer.MIN_VALUE;
    //     int newPr = 1;
    //     while(k < n){
    //         newPr = 1;
    //         for(int i = k ; i  < n ; i++){
    //             newPr *= arr[i];
    //             product = Math.max(newPr, product);
    //         }
    //         k++;
    //     }
    
    //     System.out.println(product);
        
    // } 

    // Brute Force

    // public static void main(String[] args) {
    //     // int n = 4;
    //     // int arr[] = {2,3,-2,4};
    //     int n = 1;
    //     int arr[] = {-2};
    
    //     // int n = 3;
    //     // int arr[] ={-2,0,-1};
    //     int k = 0;
    //     int product = Integer.MIN_VALUE;
    //     int newPr = 1;
    //     while(k < n){
    //         for(int i = k ; i  < n ; i++){
    //             for(int j = k ; j <= i; j++){
    //                 newPr *= arr[j];
    //                 // System.out.print(arr[j]+" ");
    //             }
    //             product = Math.max(newPr, product);
    //             // if(i < n-1){
    //             //     newPr = arr[k];
    //             // }
    //             newPr = 1;
    //             // System.out.println();
        
    //         }
    
    //         // System.out.println();
    //         k++;
    //     }
    
    //     System.out.println(product);
        
    //    } 
}
