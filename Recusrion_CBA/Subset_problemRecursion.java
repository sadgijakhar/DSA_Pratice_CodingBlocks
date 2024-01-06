package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_problemRecursion {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
    }
    int sum = sc.nextInt();
    ArrayList<Integer> arr1 = new ArrayList<>();
    int count[] = {0};
    count[0] = recurr(arr, n, 0, sum, 0, arr1,count);
    System.out.println();
    System.out.println(count[0]);

    sc.close();

   } 

   static int recurr (int[] arr, int n , int i , int sum, int curr, ArrayList<Integer> arr1 , int count[]){
    if(i >= n ){
        if(sum == curr){
            count[0] = count[0]+1;
            for(int t : arr1){
                System.out.print(t+" ");
            }
            System.out.print(" ");
        }
        return count[0];
    }

        arr1.add(arr[i]);
        recurr(arr, n, i+1, sum, curr+arr[i], arr1,count);
        arr1.remove(arr1.size()-1);
        recurr(arr, n, i+1, sum, curr, arr1,count);
    
    return count[0];
   }

}
