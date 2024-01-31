package PATTERN.upgrad;

import java.util.Scanner;

public class test2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0 ; i < n ;i++){
        arr[i] = sc.nextInt();
    }

    int j = arr[0];
    for(int i = 1 ; i < n ; i++){
        if(j+1 != arr[i]){
            System.out.println(j+1);
            break;
        }
        j = j+1;
    }
    sc.close();
   } 
}
