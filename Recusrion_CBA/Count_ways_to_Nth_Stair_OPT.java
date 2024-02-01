package Recusrion_CBA;

import java.util.Scanner;
import java.util.Arrays;

public class Count_ways_to_Nth_Stair_OPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // boolean  a = true;
        Integer dp [][] = new Integer[n+1][2];
        int j = recurr1(n, 1 ,dp);
        // System.out.println(Arrays.deepToString(dp));
        System.out.println(j);
        sc.close();
    }

    // 1 is not taken after 2
    static int recurr1(int n , int a, Integer dp[][]){
        if(n == 0){
            return 1;
            
        }
        else if(n < 0){
            return 0;
        }
        // System.out.println("First " +Arrays.deepToString(dp));

        if(dp[n][a] != null){
            // System.out.println("SAVED "+ dp[n][0]);
            return dp[n][a];
        }
        

        

        if(a == 1){
            int sp1 = recurr1(n-1,1, dp) ;
            int sp2 = recurr1(n-2,0,dp);
            // dp[n][0] = sp1;
            // dp[n][1] = sp2;
            dp[n][a] = sp1+sp2;
            // System.out.println("Second " +Arrays.deepToString(dp));
            // System.out.println("sp1 "+ dp[n][0] + " sp2 " + dp[n][1]);
            return sp1+sp2;
        }
        else{
            int sp1 =  recurr1(n-2,0,dp);
            dp[n][a] = sp1;
            // System.out.println("Third " +Arrays.deepToString(dp));
            // System.out.println("sp2 "+ dp[n][1]);
            return sp1;
        }
        // return 0;
    } 
}
