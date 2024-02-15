package Leetcode;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        // int nums [] = {3,1,-2,-5,2,-4};
        int nums[] = {-1,1};
        // System.out.println(Arrays.toString(rearrangeArray(nums)));
        System.out.println(Arrays.toString(rearrangeArray1(nums)));
    } 

    // Best Solution Ever
    // Another Solution
    public static int[] rearrangeArray1(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        int k = 1;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] > 0){
                arr[j] = nums[i];
                j += 2;
            }
            else{
                arr[k] = nums[i];
                k += 2;
            }
            
        }
        return arr;
    }
    //  Brute Force
    public static int[] rearrangeArray(int[] nums) {
        int count_negative = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] < 0){
                count_negative++;
            }
        }
        int left [] = new int[count_negative];
        int right[] = new int[nums.length - count_negative];
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] < 0){
                left[a] = nums[i];
                a++; 
            }
            else{
                right[b] = nums[i];
                b++;
            }
        }
        int i = 0 ;
        int j = 0 ;
        int index = 0;
        while(i < left.length && j < right.length){
            if(index % 2 == 0){
                nums[index] = right[j];
                j++;
            }
            else{
                nums[index] = left[i];
                i++;   
            }
            index++;
        }
        while(i < left.length){
            nums[index] = left[i];
            i++; 
        }
        while(j < right.length){
            nums[index] = right[j];
            j++;
        }
        return nums;
    }
}
