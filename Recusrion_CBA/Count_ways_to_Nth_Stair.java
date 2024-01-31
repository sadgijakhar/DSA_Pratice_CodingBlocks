package Recusrion_CBA;

import java.util.Scanner;

public class Count_ways_to_Nth_Stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = recurr(n);
        System.out.println(i);

        boolean  a = true;
        int j = recurr1(n, a);
        System.out.println(j);
        sc.close();
    }
    // All possible arrangements
    static int recurr(int n){
        if(n==0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        
        return recurr(n-1) + recurr(n-2);
    }

    // 1 is not taken after 2
    static int recurr1(int n , boolean a){
        if(n==0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        if(a){
            return recurr1(n-1,true) + recurr1(n-2,false);
        }
        else{
            return recurr1(n-2,false);
        }
    }
}
