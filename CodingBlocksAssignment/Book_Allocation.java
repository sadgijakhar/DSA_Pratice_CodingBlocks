package CodingBlocksAssignment;

import java.util.Scanner;

public class Book_Allocation {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int book = sc.nextInt();
    int student = sc.nextInt();
    int arr[] = new int[book];
    for(int i = 0 ; i < book ;i++){
        arr[i] = sc.nextInt();
    }
    if(student > book){
        System.out.println(-1);
    }
    else{
        int sum = 0;
        for(int i = 0 ; i < book ;i++){
            sum+= arr[i];
        }

        int low = arr[book -1];
        int high = sum;
        // int count = 0;
        while(low <= high){
            int mid = low+(high-low)/2;
            int count_student = count(arr, mid);
            // if(count_student == student){
            //     System.out.println(low); 
            //     return;
            // }

            if( count_student >student){
                low = mid+1;
                // count++;
            }
            // else if(count != 0){
            //     break;
            // }
            else {
                high = mid-1;
            }
        }

        System.out.println(low);

    }
    
    
    sc.close();
   }

    private static int count(int[] arr, int mid) {
        int stn = 1;
        int pages_count = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(pages_count+arr[i] <= mid){
                pages_count += arr[i];
            }
            else{
                stn++;
                pages_count = arr[i];
            }
        }
        return stn;
    } 
}
