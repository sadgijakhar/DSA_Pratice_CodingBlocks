package CodingBlocksAssignment;

import java.util.Scanner;

// public class Arrays_Target_Sum_Triplets {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for(int i = 0 ; i < n;i++){
//         arr[i] = sc.nextInt();
//     }
//     int target = sc.nextInt();
//     for(int i = 0 ; i < n ;i++){
//         int sum = arr[i];
//         System.out.println(sum);
//         for(int j = i+1 ;j < n ;j++){
//             sum+= arr[j];
//             for(int k = j+1 ; k<n ;k++){
//                 if((sum +arr[k]) == target){
//                     if(sum < arr[j] && sum < arr[k] && arr[j] < arr[k]){
//                         System.out.println(sum +", "+arr[j]+" and "+arr[k]);
//                     }
//                     else if(sum < arr[j] && sum < arr[k] && arr[j] > arr[k]){
//                         System.out.println(sum +", "+arr[k]+" and "+arr[j]);
//                     }
//                     else if(sum > arr[j] && arr[j] < arr[k] && sum < arr[k]){
//                         System.out.println(arr[j]+", "+sum+" and "+arr[k]);
//                     }
//                     else if(sum > arr[j] && arr[j] < arr[k] && sum > arr[k]){
//                         System.out.println(arr[j]+", "+arr[k]+" and "+sum);
//                     }
//                     else if(sum > arr[k] && arr[j] > arr[k] && sum > arr[j]){
//                         System.out.println(arr[k]+", "+arr[j]+" and "+sum);
//                     }
//                     else{
//                         System.out.println(arr[k]+", "+sum+" and "+arr[j]);
//                     }
                    
//                 }
//             }
//         }
//     }
//     sc.close();
//    } 
// }
import java.util.Arrays;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr); // Sort the array to simplify the logic

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        sc.close();
    }
}
