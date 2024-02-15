package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        // int arr[]= {3,2,3};
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            if(hash.containsKey(nums[i])){
                int n = hash.get(nums[i]);
                hash.put(nums[i], n+1);
            }
            else{
                hash.put(nums[i],1);
            }
        }
        int count = 0;
        int key = nums[0];
        for (Integer value : hash.values()) {
            if(count < value){
                count = value;

            }
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            // If the value of the current entry matches the search value
            if (entry.getValue() == count) {
                // Print the key associated with the value
                key = entry.getKey();
                // System.out.println("Key associated with value " + count + " is: " + entry.getKey());
                // If you want all keys associated with the value, you can store them in a list
            }
        }
        return  key;
    }
}
