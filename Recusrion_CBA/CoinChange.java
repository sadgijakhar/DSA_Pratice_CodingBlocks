package Recusrion_CBA;

import java.util.Scanner;
import java.util.ArrayList;


public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        
        for(int i = 0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr); 
        ArrayList<Integer> arrq = new ArrayList<>();
        int count[] ={0};
        int t = recurr(arr, 0, n, 0, arrq, m,count);
        System.out.println(t);
        sc.close();
       } 
    
       static int recurr(int arr[] , int sum , int n, int i ,ArrayList<Integer> arrq,int m,int count[]){
        if(i >= m || sum > n){
            return count[0];
        }
        if(sum == n){
            // System.out.println(arrq);
            count[0] = count[0]+1;
            return count[0];
        }
    
        // System.out.println(arrq);
        arrq.add(arr[i]);
    
        recurr(arr, sum+arr[i] , n, i , arrq, m,count);
    
        arrq.remove(arrq.size()-1);
    
        recurr(arr, sum, n, i+1,arrq,m,count);
        
        return count[0];
       }
}
