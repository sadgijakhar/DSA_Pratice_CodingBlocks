package Recusrion_CBA;

import java.util.Arrays;


public class LSC2 {
    public static void main(String[] args) {
        String text1 = "hofubmnylkra", text2 = "pqhgxgdofcvmr";
        // String text1 = "pqhgxgdofcvmr", text2 = "hofubmnylkra"; 
        int i = longestCommonSubsequence(text1, text2);
        System.out.println(i);

    }
   
    static int longestCommonSubsequence(String text1, String text2) {
        
        Integer dp[][] = new Integer[text1.length()][text2.length()];
        int i = recurr(text1,text2,0,0 ,dp);
        System.out.println(Arrays.deepToString(dp));
        return i;

    }

    static int recurr(String s1,String s2, int i,int j, Integer[][] dp){
        if( i >= s1.length() || j >= s2.length()){
            // dp[i][j] = 0;
            return 0 ;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1+recurr(s1, s2, i+1, j+1, dp);
            return dp[i][j];
        }
        else{
            int sp1 = recurr(s1, s2, i+1, j,dp);
            int sp2 = recurr(s1, s2, i, j+1,dp);
            dp[i][j] = Math.max(sp1,sp2);
            return dp[i][j];
        }
    }

}
