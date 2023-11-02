package CodingBlocksAssignment;

import java.util.Arrays;

public class FindtheDuplicateNumber {
   public static void main(String[] args) {
    int nums[] = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
   } 
   public static int findDuplicate(int[] nums) {
    int n = nums.length;
    // for(int i = 0 ; i< n-1 ;i++){
    //     for(int j = i+1;j<n;j++){
    //         if(nums[i]==nums[j]){
    //             return nums[i];
    //         }
    //     }

    // }

    Arrays.sort(nums);
    for(int i = 0 ;i<n-1;i++){
        if(nums[i] == nums[i+1]){
            return nums[i];
        }
    }


    
    return -1;
        
   }
}
