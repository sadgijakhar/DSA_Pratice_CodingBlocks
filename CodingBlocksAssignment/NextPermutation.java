package CodingBlocksAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    while(n > 0){
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0 ; i < a ; i++){
            arr[i] = sc.nextInt();
        }
        int i = a-1;
        while(i > 0){
            // System.out.println(arr[i]);
            if(arr[i] > arr[i-1]){
                for(int j = a-1 ; j >= i ;j--){
                    // System.out.println(arr[i]+" ---> "+arr[j]);
                    if(arr[j] > arr[i-1]){
                        int temp = arr[j];
                        arr[j] = arr[i-1];
                        arr[i-1] = temp;
                        break;
                    }
                }
            
                Arrays.sort(arr,i,a);
                break;
            }
            else if(i == 1){
                Arrays.sort(arr);
            }
            i--;
        }
        for(int j = 0 ; j < a ;j++){
            System.out.print(arr[j]+" ");
        }
          

        n--;
    }
    sc.close();
   } 
}
