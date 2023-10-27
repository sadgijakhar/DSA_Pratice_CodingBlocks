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
            int [] a = new int[n];
            int op = sc.nextInt();
            while(op >= n){
                op = op-n;
            }
            for(int i = 0 ; i < n ;i++){
                int t = op;
                if(i < op){
                    t = op-i;
                    t = n-op;
                    a[i] = arr[i]+arr[t];
                }
                else{
                    t = i-op;
                    a[i] = arr[i]+arr[t];
                }
                
            }
            for(int i = 0 ; i < n ;i++){
                arr[i] = a[i];
            }
            Q--;
        }
        int sum = 0 ;
        for(int i = 0 ; i<n ;i++){
            sum+=arr[i];
        }
        System.out.println(sum % ((int)Math.pow(10,9)+7));
    
   } 
}
