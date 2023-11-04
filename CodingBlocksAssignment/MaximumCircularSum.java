package CodingBlocksAssignment;

import java.util.Scanner;
public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        
        // Brut force
        // for(int i = 0 ; i < n ; i++){
        //     int sum = arr[i];
        //     for(int j = 0 ; j<n ; j++){
        //         sum+=arr[j];
        //         if(max < sum){
        //             max = sum;
        //         }
        //     }
        // }

        
        System.out.println(maxCircularSum(arr));
        sc.close();
    }

    static int  kadane(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = arr[0] ;
        for(int i = 1 ; i < n ; i++){
            sum += arr[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
        }
        return max;
    }
    public static int maxCircularSum(int[] nums) {
        int n = nums.length;

        int maxSumWithoutCircular = kadane(nums);

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int[] negatedNums = new int[n];
        for (int i = 0; i < n; i++) {
            negatedNums[i] = -nums[i];
        }

        int minSumWithoutCircular = kadane(negatedNums);
        
        int maxSumWithCircular = totalSum + minSumWithoutCircular;

        return Math.max(maxSumWithoutCircular, maxSumWithCircular);
    }
}
