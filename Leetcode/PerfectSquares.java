package Leetcode;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 12;
        // int l = (int)Math.sqrt(n);
        // int arr [] = new int[l+1];
        // for (int i = 0 ; i < l+1 ; i++ ){
        //     arr[i] = i*i;
        // }
        // int count[] = {Integer.MAX_VALUE};
        // Perfect(arr, n, 0, 1,0,count);
        // System.out.println(count[0]);

        // int k = PerSquare(n);
        int k = numSquares(n);
        System.out.println(k);
    } 

    // Best Solution
    // Time complexity: O(sqrt(N))
    // Space complexity: O(1)
	
    public static int numSquares(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) // Perfect square
            return 1;

        while (n % 4 == 0){ // 4^a (8b + 7)
            n = n / 4;
        }

        if (n % 8 == 7){
            return 4;
        }

        for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
            int square = i * i;
            int base = (int) Math.sqrt(n - square);
            if (base * base == n - square){
                return 2;
            }
        }

        return 3;
    }

    // With Dp 
    static int PerSquare(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int count = 1;
        while(count*count <= n){
            int square = count*count;
            for(int i = square ; i <= n ; i++){
                dp[i] = Math.min(dp[i-square]+1,dp[i]);
            }
            count++;
        }
        
        return dp[n];

    }
    // With Reecursion
    static void Perfect(int arr[], int n, int sum ,int i, int calls, int c[]){
        if(i >= arr.length){
            return;
        }
        if(sum == n){
            c[0] = Math.min(c[0], calls);
            return ;
        }
        if(sum > n){
            return;
        }
        else{
            Perfect(arr, n, sum+arr[i], i,calls+1 ,c);
            Perfect(arr, n, sum, i+1,calls,c);
        }
    }
}
