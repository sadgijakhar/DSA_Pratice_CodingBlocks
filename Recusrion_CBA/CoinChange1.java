package Recusrion_CBA;

// import java.util.Arrays;
import java.util.Scanner;

public class CoinChange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i = 0 ;  i < m ;i++){
            arr[i] = sc.nextInt();
        }
        

        int t = recurr(arr, n ,m);
        System.out.println(t);
        sc.close();
    } 

    static int recurr(int arr[], int n, int m){
        int arr1[][] = new int[m+1][n+1];

        for(int i = m-1 ; i >= 0 ;i--){
            for(int j = 0 ; j <= n ; j++){
                if(j == 0){
                    arr1[i][j] = 1;
                    continue;
                }

                int sp1 = 0;
                if(j - arr[i] >= 0){
                    sp1 = arr1[i][j-arr[i]];
                    // System.out.println("sp1  "+sp1);
                }

                int sp2 = arr1[i+1][j];
                arr1[i][j] = sp1+sp2;
            }
        }
        // System.out.println(Arrays.deepToString(arr1));
        return arr1[0][n];
    }
}
