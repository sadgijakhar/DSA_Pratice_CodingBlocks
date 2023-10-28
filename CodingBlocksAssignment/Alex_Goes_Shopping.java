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
    for(int i = 0 ;i<a ;i++){
        int rupees = sc.nextInt();
        int chances = sc.nextInt();
        int count = 0;
        int sum = 0;
        int save = 0;
        for(int j = 0 ;j <n ;j++){
            sum += arr[j];
        }
        if(sum == rupees){
            count= 4;
        }
        else if(sum < rupees){
            count = 1;
        }
        else{
            int j = 0;
            while(j < n){
                if(arr[j] < rupees){
                    save = arr[j];
                    int k = j+1;
                    while(k < n){
                        if(arr[j]+arr[k] == rupees){
                            count++;
                        }
                        else if (arr[k] == rupees){
                            count++;
                        }
                        else if (arr[k]+arr[j] < rupees){
                            save = arr[j]+arr[k] ;
                        }
                        k++;
                    }
                }
                else if (arr[j]== rupees){
                    count++;
                }
                j++;
                // System.out.println(count);
            }
        }
        if(count == chances){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        // int check = rupees;
        // int t = 0;
        // for(int j = 0 ; j<n ;j++){
        //     if(t == 0 && arr[j] < check){
        //         int k = j;
        //         while(check > 0 && k < n){
        //             if(check >= arr[k]){
        //                 check -= arr[k];
        //                 count++;
        //             }
        //             k++; 
        //         }
        //         t++;
        //     }
        //     else if(arr[j] == rupees){
        //         count++;
        //     }
        //     // System.out.println(count);
        // }
        // if(count >= chances){
        //     arr1[i] = "Yes";
        // }
        // else{
        //     arr1[i] = "No";
        // }
    }
    // for(int i = 0 ; i < a ;i++){
    //     System.out.println(arr1[i]);
    // }
    sc.close();
   } 
}
