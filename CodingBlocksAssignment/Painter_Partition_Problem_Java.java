package CodingBlocksAssignment;

import java.util.Scanner;

public class Painter_Partition_Problem_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int painter = sc.nextInt();
        int board = sc.nextInt();
        int arr[] = new int[board];
        for(int i = 0 ; i < board ; i++){
            arr[i] = sc.nextInt();
        }
        int low = arr[0];
        int high = 0;
        for(int i = 0 ; i < board ; i++){
            high += arr[i];
            if(arr[i] > low){
                low = arr[i];
            }
        }
        // System.out.println(low +" "+high);
        while(low <= high){
            int mid = low + (high-low)/2;
            int count = countFun(arr,mid);
            if(count > painter){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(low);

        
        sc.close();

    }

    private static int countFun(int[] arr, int mid) {
        int painter = 1;
        int time = 0;
        int i = 0;
        while(  i < arr.length ){
            if(arr[i]+time <= mid){
                time += arr[i];
                i++;
            }
            else{
                painter++;
                time = 0;
            }
        }
        return painter;
    }
}
