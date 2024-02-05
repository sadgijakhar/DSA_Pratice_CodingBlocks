package Leetcode;

public class Edit_Distance {
   public static void main(String[] args) {
    String word1 = "horse";
    String word2 = "ros";

    // String word1 = "intention";
    // String word2 = "execution";
    Integer dp[][] = new Integer[word1.length()][word2.length()];
    int j = recurr(word1, word2, 0, 0 , dp);
    
    System.out.println(j);
   } 

   static int recurr(String word1, String word2 , int i,int j, Integer dp[][]){
        if (i == word1.length()) {
            int str2_l = word2.length() - j;
            return str2_l;
        }
        if (j == word2.length()) {
            int str1_l = word1.length() - i;
            return str1_l;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            dp[i][j] = recurr(word1, word2, i+1, j+1 ,dp);
            return dp[i][j];
        }
        else{
            int sp2 = recurr(word1, word2, i+1 , j,dp);
            int sp1 = recurr(word1, word2, i+1 ,j+1,dp);
            int sp3 = recurr(word1, word2, i ,j+1,dp);

            dp[i][j] = 1+ Math.min(sp1,Math.min(sp2,sp3));
            return dp[i][j];
        }
   }
}
