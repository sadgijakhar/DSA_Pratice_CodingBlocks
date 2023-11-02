package CodingBlocksAssignment;

import java.util.Scanner;
public class Inverse_of_an_array {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max = 0;
    for(int i = 0 ; i <n ;i++){
        arr[i] = sc.nextInt();
        if(max < arr[i]){
            max = arr[i];
        }
    }
    int result [] = new int[n];
    for(int i = 0 ; i<n ; i++){
        result[arr[i]] = i;
    }
    for(int i = 0 ; i<n;i++){
        System.out.print(result[i]+" ");
    }
    sc.close();

   } 
}
