package CodingBlocksAssignment;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for(int i = 0 ;i <n ;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n ;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ;j++){
                if(arr[i] == arr1[j]){
                    count++;
                    arr1[j] = -1;
                    break;
                }
            }
            if(count == 0){
                arr[i] = -1;
            }
        }
        Arrays.sort(arr);
        System.out.print("[");
        for(int i = 0 ; i<n; i++){
            
            if(arr[i] != -1 && i != n-1){
                System.out.print(arr[i]+", ");
            }
            else if(arr[i] != -1 ){
                System.out.print(arr[i]+"]");
            }
            
        }
        
        sc.close();
    }
}
