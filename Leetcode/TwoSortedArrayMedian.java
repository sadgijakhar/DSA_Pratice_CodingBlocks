package Leetcode;

public class TwoSortedArrayMedian {
   public static void main(String[] args) {
    int arr[] = {1,2};
    int arr1[] = {3,4};
    int n = 2;
    int m = 2;
    int i = BSearch(arr, n, 0);
    int j = BSearch1(arr1, m, m, 4, 0);
    if((i+j) < (m+n)/2){

    }
    System.out.println(j);
   } 

   static int BSearch(int[] arr, int n, int low ){
    int mid = (n+low)/2;
    return mid;
   }
   
   static int BSearch1(int arr[] , int m ,int high,int target, int low){
    while(low <= high){
        int mid = (high+low)/2;
        if(arr[mid] == target){
            // System.out.println(mid);
            return mid;
        }
        else if(arr[mid] > target){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return low;
    
   }
}
