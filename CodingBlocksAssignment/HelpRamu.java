package CodingBlocksAssignment;

import java.util.Scanner;

public class HelpRamu {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n > 0){
        int arr[] = new int[4];
        for(int i = 0 ; i< 4 ;i++){
            arr[i] = sc.nextInt();
        }
        int rick = sc.nextInt();
        int cab = sc.nextInt();
        int arr1[] = new int[rick];
        int arr2[] = new int[cab];
        for(int i = 0 ; i < rick ; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < cab ; i++){
            arr2[i] = sc.nextInt();
        }
        int totalRickCost = RickCost(arr,arr1);
        int totalcabCost = CabCost(arr,arr2);
        System.out.println(Math.min(totalRickCost+totalcabCost,arr[3]));
        n--;
    }
    sc.close();
   }

    private static int CabCost(int[] arr, int[] arr2) {
        int min = 0;
        for(int i = 0 ; i < arr2.length ;i++ ){
            min+= Math.min(arr2[i]*arr[0] , arr[1]);
        }
        min = Math.min(min,arr[2]);
        return min;
    }   

    private static int RickCost(int[] arr, int[] arr1) {
        int min = 0;
        for(int i = 0 ; i < arr1.length ;i++ ){
            min+= Math.min(arr1[i]*arr[0] , arr[1]);
        }
        min = Math.min(min,arr[2]);
        return min;
    } 
}
