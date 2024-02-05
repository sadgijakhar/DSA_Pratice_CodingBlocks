package Leetcode;

public class MedianOfTwoSortedSubarray {
    public static void main(String[] args) {
        // int arr[] = {1,2,3};
        // int arr1[] = {3,4};

        int arr[] = {1,3};
        int arr1[] ={2};
        double j = recurr(arr, arr1);
        System.out.println(j);
    } 
    static double recurr(int arr[], int arr1[]){
        int n = arr.length;
        int m = arr1.length;
        int low = 0;
        int high = n-1;
        int meadian = (m+n-1)/2;
        int store = 0;
        int store1 = 0;
        // if((m+n) % 2 == 0){
            while(low <= high){
                int mid = mid(arr, low, high);
                int small = mid + Small(arr1, 0, m-1, arr[mid]);
                int large = n-mid+Small(arr1, 0, m-1, arr[mid]);
                if(small == meadian && large == meadian && (m+n)%2 != 0){
                    return (double) arr[mid];
                }
                else if(small > meadian){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
                store = arr[mid];
            }
            
                low = 0;
                high = m-1;
                while(low <= high){
                    int mid = mid(arr1, low, high);
                    int small = mid + Small(arr, 0, 0, arr1[mid]);
                    int large = m - mid + Small(arr,0, 0, arr1[mid]);
                    if(small == meadian && large == meadian && (m+n)%2 != 0){
                        return (double) arr1[mid];
                        // continue;
                    }
                    else if(small > meadian){
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }
                    store1 = arr1[mid];
                }
            
            System.out.println(store+" "+store1);
            

        // }
        double mead = ((double)store + (double)store1)/2;
        return mead;
        // else{
        //     while(low <= high){
        //         int mid = mid(arr, low, high);
        //         int small = mid;
        //         int large = m+n - mid;
        //         if(small == meadian || large == meadian){
        //             return (double)arr[mid];
        //         }
        //         else if(small > meadian){
        //             high = mid-1;
        //         }
        //         else{
        //             low = mid+1;
        //         }
        //     }
        //     if(check){
        //         low = 0;
        //         high = m-1;
        //         while(low <= high){
        //             int mid = mid(arr1, low, high);
        //             int small = n+mid;
        //             int large = m+n - mid;
        //             if(small == meadian || large == meadian){
        //                 return (double) arr1[mid];
        //             }
        //             else if(small > meadian){
        //                 high = mid-1;
        //             }
        //             else{
        //                 low = mid+1;
        //             }
        //         }
        //     }
        // }
    }

    static int mid(int arr[] ,int low, int high){
        return (low+high)/2;
    }
    static int Small(int arr[],int low, int high, int search){
        while(low <= high){
        
            int mid = (low+high)/2;
            if(arr[mid] == search){
                // count = mid;
                return mid;
            }
            else if(arr[mid] < search){
                // count = count+mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    // static int Large(int arr[],int low, int high, int search, int count){
    //     while(low <= high){
    //         int mid = (low+high)/2;
    //         if(arr[mid] == search){
    //             count = mid;
    //             return count;
    //         }
    //         else if(arr[mid] < search){
    //             // count = count+mid;
    //             low = mid+1;
    //         }
    //         else{
    //             count = count + arr.length - mid;
    //             high = mid-1;
    //         }
    //     }
    //     return count;
    // }

}
