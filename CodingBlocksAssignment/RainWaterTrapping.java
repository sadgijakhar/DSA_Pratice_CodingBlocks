package CodingBlocksAssignment;

import java.util.Scanner;
public class RainWaterTrapping {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n > 0){
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0 ; i< s;i++){
            arr[i] = sc.nextInt();
        }
        int capacity ;
        if(arr[0] < arr[s-1]){
            capacity = arr[0];
        }
        else{
            capacity = arr[s-1];
        }
        int sum = 0;
        for(int i = 1; i < s-1 ;i++){
            if(capacity > arr[i]){
                sum += capacity - arr[i];
            }
        }
        System.out.println(sum);
        n--;
    }
    sc.close();
   } 
}
