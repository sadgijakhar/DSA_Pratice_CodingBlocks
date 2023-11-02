package CodingBlocksAssignment;

import java.util.Scanner;
public class Calculate_The_Sum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        while(Q > 0){
            int dummy[] = new int[n];
            int op = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
                dummy[i] = arr[i]+arr[(n+i-op)%n];
            }
            for(int i = 0 ; i <n ;i++){
                arr[i] = dummy[i];
            }
            Q--;
        }
        
        int sum = 0 ;
        for(int i = 0 ; i<n ;i++){
            sum+=arr[i];
        }
        System.out.println(sum % ((int)Math.pow(10,9)+7));
        sc.close();  
   } 
}
