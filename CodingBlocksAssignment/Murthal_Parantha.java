package CodingBlocksAssignment;

import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Cook = sc.nextInt();
        int arr[] = new int[Cook];
        for(int i = 0 ; i<Cook ;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1 ; i < Cook ;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int high = max * ( P*(P-1)/2);
        int low = P;
        while(low < high){
            
            int mid = low+(high-low)/2;
            int count = countTime(arr,mid,P);
            if(count == Cook){
                // System.out.println(check);
                break;
            }
            else if(count < Cook){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        sc.close();

    }

    public static int countTime(int[] arr, int mid,int P) {
        int Cook = 0; 
        int sum = 0;
        int i = 0 ;
        int j =1;
        // int arr1[] = new int[arr.length];
        while( i < arr.length && P>0 ){
            // System.out.println("--------??????????????>>>>>>>>>"+mid);
            if(sum+arr[i]*j <= mid){
                sum += arr[i]*j;
                j++;
                P--;
                // System.out.println(arr[i]+"-------------------->"+sum);
            }
            else{
                // System.out.println(sum);
                // arr1[i] = sum;
                Cook++;
                i++;
                j=1;
                sum = 0;
            }
            
        }
        return Cook;
        // int max = 0;
        // for(int t = 0 ; t < arr.length ;t++){
        //     if(max < arr1[t]){
        //         max = arr1[t];
        //     }
        // }
        // check = max;
        // return Cook;
    }
}