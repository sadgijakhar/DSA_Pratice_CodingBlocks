package Recusrion_CBA;

// import java.util.HashMap;
import java.util.Scanner;

public class LCS {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        Integer dp[][][] = new Integer[s1.length()][s2.length()][s3.length()];
        int i = recurr(s1,s2,s3, 0,0,0 , dp);
        System.out.println(i);
        
        sc.close();
    }

    static int recurr(String s1, String s2, String s3 , int i ,int j , int k , Integer dp[][][]){
        if(i >= s1.length() || j >= s2.length() || k >= s3.length()){
            return 0;
        }

        if(dp[i][j][k] != null){
            return dp[i][j][k];
        }

        if(s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)){
            dp[i][j][k] = 1+ recurr(s1, s2, s3, i+1, j+1, k+1,dp);
            return dp[i][j][k] ;
        }
        else{
            int sp1 = recurr(s1,s2,s3, i+1, j,k,dp);
            int sp2 = recurr(s1,s2,s3,i,j+1,k,dp);
            int sp3 = recurr(s1, s2, s3, i, j, k+1,dp);
            dp[i][j][k] = Math.max(sp1,Math.max(sp2,sp3));
            return dp[i][j][k];
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 3;
        
    //     while(n > 0){
    //         String s1 = sc.next();
    //         char c[] = new char[s1.length()];
    //         for(int i = 0 ; i < s1.length() ;i++){
    //             c[i] = s1.charAt(i);
    //         }
    //         // HashMap<String, String> has = new HashMap<>();
    //         recurr(c , 0 ,"");
    //     }
        
    //     sc.close();
    // }

    // static void recurr(char c [] ,int i , String s){
    //     if(i >= c.length){
    //         System.out.println(s);
    //         return;
    //     }
    //     recurr(c, i+1, s+c[i]);
    //     recurr(c, i+1, s);
    // }
    
}
