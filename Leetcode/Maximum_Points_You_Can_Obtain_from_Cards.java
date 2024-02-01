package Leetcode;

public class Maximum_Points_You_Can_Obtain_from_Cards {
   public static void main(String[] args) {
    // int arr[] = {1,2,3,4,5,6,1};
    // int k = 3;

    // int arr[] = {2,2,2};
    // int k = 2;

    int arr[] = {9,7,7,9,7,7,9};
    int k = 7;

    int sum = recurr(arr, k, 0, arr.length-1, 0);
    System.out.println(sum);

    int sum1 = maxScore(arr,k);
    System.out.println(sum1);

   } 

   public static int maxScore(int[] C, int K) {
    int total = 0;
    for (int i = 0; i < K; i++) {
        total += C[i];
    }
    int best = total;
    int i = K - 1, j = C.length - 1; 
    while(i >= 0) {
        total += C[j] - C[i];
        best = Math.max(best, total);
        i--;
        j--;
    }
    return best;
}

   static int recurr(int arr[] , int k, int i , int j, int sum){
    if(k < 1 || i >= arr.length || j < 0){
        return sum;
    }
    if(arr[i] > arr[j]){
        int sp1 = recurr(arr, k-1, i+1, j, sum+arr[i]);
        return sp1;
    }
    else{
        int sp1 = recurr(arr, k-1, i, j-1, sum+arr[j]);
        return sp1;
    }

   }
}
