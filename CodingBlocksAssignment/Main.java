package CodingBlocksAssignment;

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for(int i = 0 ; i < 7 ;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int minIndex = 0;
        for(int i = 1 ; i<6;i++){
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
                // System.out.println(min);
            }
        }
        int max = arr[minIndex];
        for(int i = minIndex+1 ; i < 7 ;i++){
            if(max < arr[i]){
                max = arr[i];
                // System.out.println(max);
            }
        }

        if(max-min > 0){
            System.out.println(max-min);
        }
        else{
            System.out.println(0);
        }
    }
}