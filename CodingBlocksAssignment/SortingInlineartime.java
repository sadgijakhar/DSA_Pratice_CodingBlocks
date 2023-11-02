package CodingBlocksAssignment;

import java.util.Scanner;

public class SortingInlineartime {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i<n;i++ ){
        arr[i] = sc.nextInt();
    }
    int low = 0 ;
    int high = n-1;
    for(int i = 0 ; i <= high;i++){
        if(arr[i] == 0){
            int temp = arr[low];
            arr[low] = arr[i];
            arr[i] = temp;
            low++;
        }
        else if(arr[i] == 2){
            int temp = arr[high];
            arr[high] = arr[i];
            arr[i] = temp;
            high--;
        }
    }
    for(int i = 0 ; i<n ;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
   } 
   
}
