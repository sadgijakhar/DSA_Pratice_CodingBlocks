package CodingBlocksAssignment;

import java.util.Scanner;

public class Alex_Goes_Shopping {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0 ; i<n ;i++){
        arr[i] = sc.nextInt();
    }
    int a = sc.nextInt();
    String arr1 [] = new String[a];
    for(int i = 0 ;i<a ;i++){
        int rupees = sc.nextInt();
        int chances = sc.nextInt();
        int count = 0;
        int check = rupees;
        int t = 0;
        for(int j = 0 ; j<n ;j++){
            if(t == 0 && arr[j] < check){
                int k = j;
                while(check > 0 && k < n){
                    if(check >= arr[k]){
                        check -= arr[k];
                        count++;
                    }
                    k++; 
                }
                t++;
            }
            else if(arr[j] == rupees){
                count++;
            }
            // System.out.println(count);
        }
        if(count >= chances){
            arr1[i] = "Yes";
        }
        else{
            arr1[i] = "No";
        }
    }
    for(int i = 0 ; i < a ;i++){
        System.out.println(arr1[i]);
    }
    sc.close();
   } 
}
