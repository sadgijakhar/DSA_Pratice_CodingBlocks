package Leetcode;

public class ContainerWithMostWater {

    // Best Solution

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        // int arr[] = {1,1};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int area = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        
        while(i <= j){
            if( arr[i] < arr[j]){
                int length = arr[i];
                int breadth = j-i;
                curr = length* breadth;
                area = Math.max(curr,area);

                i++;

            }
            else{
                int length = arr[j];
                int breadth = j-i;
                curr = length* breadth;
                area = Math.max(curr,area);

                j--;
            }
            
            
            
            curr = Integer.MIN_VALUE;
            }
        System.out.println(area);
        
    } 

    // Brute Force

//    public static void main(String[] args) {
//     // int arr[] = {1,8,6,2,5,4,8,3,7};
//     int arr[] = {1,1};
//     int n = arr.length;
//     int i = 0;
//     int j = i+1;
//     int area = Integer.MIN_VALUE;
//     int curr = Integer.MIN_VALUE;
//     while(i < n){
//         int length = Math.min(arr[i],arr[j]);
//         int breadth = j-i;
//         curr = length* breadth;
//         area = Math.max(curr,area);
//         j++;
//         if( j == n){
//             j = 0;
//             i++;
//         }
//         curr = Integer.MIN_VALUE;
        
//     }
//     System.out.println(area);

//    } 
}
