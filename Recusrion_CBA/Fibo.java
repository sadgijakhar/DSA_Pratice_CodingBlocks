package Recusrion_CBA;

public class Fibo {
    
   public static void main(String[] args) {
    // int arr[] = new int[5];
    int n = 6000;
    System.out.println(fib(n, new Integer[n+1]));
    
   }
   
   static int fib(int n ,Integer dp[]){
    if(n <= 1){
        return n;
    }
    if(dp[n]!=null){
        return dp[n];
    }
    int sp1 =  fib(n-1,dp);
    int sp2 =  fib(n-2,dp);
    dp[n] = sp1+sp2;
    return sp1+sp2;
   }
   public static int BU(int N){
    // step 2 : DS
    int[] dp = new int[N+1];
    //Step 3: loop
    for(int n =0; n<=N;n++){
        // dp[n]!!
        if(n <= 1){
            // return n;
            dp[n]=n;
            continue;
        }
        
        int sp1 =  dp[n-1];
        int sp2 =  dp[n-2];
        
        dp[n] = sp1+sp2; 
    }
    return dp[N];
   } 
}
