package Recusrion_CBA;

import java.util.Scanner;

public class ClimbStairs {
    // Question
    // You are climbing a staircase. It takes n steps to reach the top. 
    // Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        System.out.println(steps(i,n));
        sc.close();
    }
    static int steps(int i, int n){
        if(i == n){
            return 1;
        }
        else if(i < n){
            return steps(i+1,n) +  steps(i+2,n);
        }
        return 0;
    }
}
