package Leetcode;

public class Median_of_Two_Sorted_Arrays1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int arr1[] = {2};
        int mid1 = (arr.length+arr1.length)/2;
        bre(arr, arr1, mid1);
    } 
    static void bre(int arr[], int arr1[],int mid1){
        int n = arr.length ;
        int low = 0;
        int high = n-1;
        int small = 0;
        while(low <= high){
            int mid = (low+high)/2;
            small = mid + check(arr1, arr[mid]);
            System.out.println(check(arr1, arr[mid]) + " "+ mid1+" "+small);
            if(small == mid1){
                System.out.println(arr[mid]);
                return;
            }
            else if(small < mid1){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("knnl");
        n = arr1.length;
        low = 0;
        high = n-1;
        small = 0;
        System.out.println(low +" "+high);
        while(low <= high){
            int mid = (low+high)/2;
            small = mid + check(arr, arr1[mid]);
            // System.out.println(small);
            if(small == mid1){
                System.out.println(arr1[mid]);
                return;
            }
            else if(small < mid1){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }


    }
    static int check(int arr[], int x){
        int low = 0;
        int high = arr.length-1 ;
        int small = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                small = mid;
                return small;
            }
            else if(arr[mid] < x){
                small = mid+1;
                low = mid+1;
            }
            else{
                // small = mid+1;
                high = mid-1;
            }
        }
        return small;
    }
}
