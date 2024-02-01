package Leetcode;

public class ReversePairs {
    public static void main(String[] args) {
        // int n = 5;
        // int arr[] = {1,3,2,3,1};
    
        int n = 5;
        int arr[] = {2,4,3,5,1};
        int count = 0;
        int i = 0;
        int j = i+1;
        while(i < n && j < n){
            if(arr[i] > 2*arr[j]){
                count += 1;
            }
            j++;
            if(j >= n){
                i++;
                j = i+1;
            }
            
        }

        System.out.println(count);
    }

//  Brute Force

//    public static void main(String[] args) {
//     int n = 5;
//     int arr[] = {1,3,2,3,1};

//     // int n = 5;
//     // int arr[] = {2,4,3,5,1};
//     int count = 0;
//     for(int i = 0 ; i < n ; i++){
//         for(int j = i+1 ; j < n ; j++){
//             if(arr[i] > 2*arr[j]){
//                 count+= 1;
//             }
//         }
//     }
//     System.out.println(count);
//    } 
}
