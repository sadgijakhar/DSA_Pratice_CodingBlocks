package CodingBlocksAssignment;

import java.util.Scanner;


public class Maximum_Sum_Path_in_Two_Arrays {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();
    while(testcase > 0){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[m];
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0 ; j < m ;j++){
            arr1[j] = sc.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        int sum2 =0;
        int i = 0; int j = 0;
        while(n>i && m >j){
            if(arr[i] > arr1[j]){
                // System.out.println(arr1[j]);
                sum2 += arr1[j];
                j++;
            }
            else if (arr[i] < arr1[j]){
                sum1 += arr[i];
                i++;
            }
            else{
                sum+=Math.max(sum1,sum2)+arr[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while(m>j){
            sum2 += arr1[j];
            j++;
        }
        while(n>i){
            sum1+=arr[i];
            i++;
        }
        sum+= Math.max(sum2,sum1);
        System.out.println(sum);
        
        
        testcase--;
    }
    sc.close();
   } 
}
