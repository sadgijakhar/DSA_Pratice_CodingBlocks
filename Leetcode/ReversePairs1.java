package Leetcode;


public class ReversePairs1 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        // int arr[] = {2,4,3,5,1};
        System.out.println(reversePairs(arr));
    } 

    static int reversePairs(int[] nums) {
        // System.out.println(nums.length);
        int t = divide(nums, 0, nums.length-1);
        // System.out.println(Arrays.toString(nums));
        return t;
    }

    static int  divide(int arr[],int low, int high ){
        int count = 0;
        if(low < high){
            int mid = (low+high)/2;
            count = divide(arr,low,mid) + divide(arr,mid+1,high);
            for (int i = low, j = mid+1; i <= mid && j <= high;){
                if (arr[i] > (long) arr[j] * 2){
                    count += mid - i + 1;
                    j++;
                }
                else i++;
            }
            merge(arr, low, mid, high,count);
        }
        return count;
    }

    static int merge(int [] nums, int low, int mid, int high, int count){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left [] = new int[n1];
        int right [] = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            left[i] = nums[low+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            right[i] = nums[i+mid+1];
        }      
        int i = 0 ;
        int j = 0 ;
        int k = low;

        while(i < n1 && j < n2){
            if(left[i] < right[j]){
                nums[k] = left[i];
                i++;
            }
            else{
                nums[k] = right[j];
                j++;  
            }
            k++;
        }
        while(i < n1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = right[j];
            j++;
            k++;
        }
        return count;
    }
}
