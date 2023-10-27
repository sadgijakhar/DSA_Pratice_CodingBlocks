package CodingBlocksAssignment;

import java.util.Scanner;

public class Arrays_target_sum {
    // first approach
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        for(int i = 0 ; i< n ;i++){
            int sum = arr[i];
            for(int j = i+1 ; j < n; j++){
                if((sum +arr[j]) == target){
                    if(sum < arr[j]){
                        System.out.println(sum +" and "+arr[j]);
                    }
                    else{
                        System.out.println(arr[j] +" and "+sum);
                    }
                    
                }
            }
        }
        sc.close();

    } 

}
