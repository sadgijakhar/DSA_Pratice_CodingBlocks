package Recusrion_CBA;

import java.util.Scanner;

public class CountWaysToNthStair {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count[] = {0};
    recurr(n, 0, 1, count);
    System.out.println(count[0]);
    sc.close();
   } 

   static int recurr(int n,int curr ,int i ,int count[]){
    if(curr > n || i >= 3){
        // System.out.println(arr);
        return count[0];
    }
    if(curr == n){
        count[0] = count[0] +1;
        return count[0];
    }
    recurr(n, curr+i, i,count);
   
    recurr(n, curr, i+1, count);

    return count[0];
   }
}
