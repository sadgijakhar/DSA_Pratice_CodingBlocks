package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        // int arr[] = {1,2,3};
        int arr[] = {1,3,7,9};
        // int arr[] = {1,2,4,8}; 
        // LargestDivisible(arr);
        System.out.println(LargestDivisibleSubse(arr));
        
    } 
    
    static List<Integer> LargestDivisibleSubse(int[] nums){
        List<Integer> ls = new ArrayList<>();
        int dp[] = new int[nums.length];
        Arrays.sort(nums);
        for(int i = 0 ;  i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ;j++){
                if(nums[j] % nums[i] == 0){
                    dp[j] +=  1;
                }
            }
        }
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(dp[i] == j){
                ls.add(nums[i]);
                j++;
            }
        }
        return ls;
    }

    static List<Integer> divide(int arr[], int low, int high){
        List<Integer> arr1 = new ArrayList<>();
        if(low < high){
            int mid = (high+low)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            arr1 = merge(arr, low, mid, high);
        }
        return arr1;
    }
    static List<Integer> merge(int arr[], int low, int mid, int high){
        List<Integer> ar  = new ArrayList<>();
        int n1= mid-low+1;
        int n2 = high- mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0 ; i  < n1 ;i++){
            left[i] = arr[low+i];
        }
        for(int i = 0 ; i < n2;i++){
            right[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
        // System.out.println(" Left: "+Arrays.toString(left));
        // System.out.println(" Left: "+Arrays.toString(right));
        while(i < n1 && j < n2){
            
            if(left[i] % right[j] == 0 || right[j]% left[i] == 0){
                // System.out.println(left[i]);
                if(!ar.contains(left[i])){
                    ar.add(left[i]);
                }
                if(!ar.contains(right[j])){
                    ar.add(right[j]);
                }

                // ar.add(right[j]);
            }
            if (j == n2-1){
                i++;
                j=0;
            }
            else{
                j++;
            }
        }
        i = 0; j = 0 ;int k = low;
        while(i < n1 && j <n2){
            
            if(right[j] < left[i]){
                arr[k] = right[j];
                j++;
            }
            else{
                arr[k] = left[i];
                i++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(ar);
        return ar;
    }

    static void LargestDivisible(int arr[]){
        List<List<Integer>> lis = new ArrayList<>();
        int i = 0;
        int j = i+1;
        while( i < arr.length && j <arr.length){
            List<Integer> list = new ArrayList<>();

            if(arr[i] % arr[j] == 0 || arr [j]% arr[i] == 0){
                list.add(arr[i]);
                list.add(arr[j]);
                j++;
            }
            else{
                i++;
                j = i+1;
            }
            lis.add(list);
            
        }
        
        
        System.out.println(lis);
    }
}
