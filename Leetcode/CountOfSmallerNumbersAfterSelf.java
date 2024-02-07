package Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        // int arr[] = {5,2,6,1};
        int arr [] = {1,9,7,8,5};
        // int arr [] = {0,1,2};
        // int arr[]={-1,-1};
        // int arr[] = {-1,0};

        System.out.println(Sol(arr));
        // System.out.println(countSmaller(arr));

    }
    // Insertation Sort
    static List<Integer> countSmaller(int[] nums) {
        List<Integer> arr = new ArrayList<>(nums.length);
        int j = nums.length-1; 
        arr.add(0,0);
        
        for(int i = nums.length-2 ; i >=0  ; i--){
            int count = 0;
            int k = i;
            while(j < nums.length && j > -1 && nums[k] > nums[j]){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                count += 1;
                j++;
                k++;
            }
            j = i;
            arr.add(0,count);
        }
        return arr; 
    }

    // Merge Sort
    static List<Integer> Sol(int arr[]){
        // int count[] = arr;
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            mp.put(arr[i] , 0);
        }
        int[] arrCopy = arr.clone(); 
        divide(arr,0,arr.length-1,mp);
        List<Integer> lis = new ArrayList<>();
        for (int key : arrCopy) {
            lis.add(mp.get(key));
        }
        return lis;

    }
    static void divide(int arr[],int low, int high , HashMap<Integer, Integer> mp){
        if(low < high){
            int mid = (low+high)/2;
            divide(arr,mid+1,high,mp);
            divide(arr,low,mid,mp);
            merge(arr, low, mid, high,mp);
        }
    }
    static void merge(int arr[],int low, int mid, int high, HashMap<Integer, Integer> mp){
        int n1 = high - mid;
        int n2 = mid-low+1;
        int right[] = new int[n1];
        int left[] = new int[n2];
        for(int i = 0 ; i < n2 ;i++){
            left[i] = arr[i+low];
        }
        for(int j = 0 ; j < n1 ; j++){
            right[j] = arr[j+mid+1];
        }
        int i = 0 ;
        int j = 0;
        int k = low;
        System.out.println(n1+" "+n2);
        
        while(i < n2 && j < n1){
            System.out.println(i+" i $ j "+ j);
            System.out.println(right[j]);
            System.out.println(left[i]);
            // System.out.println(left[2]);
            if(right[j] < left[i]){
                System.out.println("PArtyyyyyyyyyy");
                arr[k] = right[j];
                j++;
            }
            else if(right[j] == left[i]){
                arr[k] = left[i];                
                i++;
            }
            else{
                if(j == 0){
                    arr[k] = left[i]; 
                }
                else{
                    int currentValue = mp.get(left[i]);
                    int updatedValue = currentValue + 1;
                    mp.put(left[i], updatedValue);
                    System.out.println("UPDat "+left[i]+" " +updatedValue);
                    arr[k] = left[i]; 
                }
                               
                i++;
            }
            k++;
        }
        while(i < n2 ){   
            // int currentValue = mp.get(left[i]);
            // int updatedValue = currentValue + 1;
            // System.out.println("UPDat " +left[i]+" "+updatedValue);

            // mp.put(left[i], updatedValue);
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n1){
            arr[k] = right[j];
            j++;   
            k++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
