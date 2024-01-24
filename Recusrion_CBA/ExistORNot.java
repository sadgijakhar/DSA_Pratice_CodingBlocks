package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class ExistORNot {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int j = 0 ; j < n ; j++){
            arr[j] = sc.nextInt();
        }
        int q = sc.nextInt();
        // ArrayList<Integer> ar = new ArrayList<>();
        for(int k = 0 ; k < q ; k++){
            // ar.add(sc.nextInt());
            int a = sc.nextInt();
            // System.out.println();
            fun1(arr,a,n);
        }
        // fun(arr, n, ar, 0);
        t--;
    }
    sc.close();
   } 

   //Linear Search
   static void fun1(int arr[] ,int a ,int n){
    for(int i = 0 ; i < n ;i++){
        if(arr[i] == a){
            System.out.println("Yes");
            return;
        }
    }
    System.out.println("No");
   }

   // Recursion
   static void fun(int arr[], int n, ArrayList<Integer> ar,int j){
    if(j >= ar.size()){
        return;
    }
    boolean loopCompleted = true;
    for(int i = 0 ; i < n ; i++){
        if(ar.get(j) == arr[i]){
            System.out.println("Yes");
            loopCompleted = false;
            fun(arr, n, ar, j+1);
        }
    }
    if(loopCompleted){
        System.out.println("No");
        fun(arr, n, ar, j+1);
    }
   }
}
