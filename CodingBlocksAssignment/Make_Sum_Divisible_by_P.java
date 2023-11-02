// package CodingBlocksAssignment;

// public class Make_Sum_Divisible_by_P {
//     // Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.

//     // Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.
    
//     // A subarray is defined as a contiguous block of elements in the array.
    
     
    
//     // Example 1:
    
//     // Input: nums = [3,1,4,2], p = 6
//     // Output: 1
//     // Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6. 
//     public static void main(String[] args) {
//         int arr[] = {3,1,4,2};
//         int p = 6;
//         System.out.println(minSubarray(arr,p));
//     }
//     public static int minSubarray(int[] nums, int p) {
//         int sum = 0;
//         for(int i = 0 ; i<nums.length;i++){
//             sum += nums[i];
//         }
//         if(sum % p == 0){
//             return -1;
//         }
//         else{
//             if(sum/p >= 1){
//                 sum = sum-p;
//             }
//             else{
//                 return -1;
//             }
//         }

//     }
// }
