package Recusrion_CBA;

import java.util.Scanner;

public class FormBiggestNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0 ; i < n ;i++){
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int j = 0 ;j < m ;j++){
            arr[j] = sc.nextInt();
        }
        String str = "";
        str = str+arr[0];
        System.out.println(testcase(arr,m,str,1,0,10));

    }
    
    sc.close();
   } 

   static String testcase(int arr[],int n , String str ,int i,int j,int num){
    if(i < n){
        if(charToNumber(str.charAt(j)) < arr[i]/num){
            str = ""+arr[i]+str;
            return testcase(arr, n, str, i+1, j, num);
        }
        else if(charToNumber(str.charAt(j)) > arr[i]/num){
            str = str+arr[i];
            return testcase(arr, n, str, i+1, j, num);
        }
        else{
            return testcase(arr, n, str, i ,j+1,num*10);
        }

    }
    return str;

   }
   static int charToNumber(char c) {
    // Subtract the character '0' to get the numeric value
        return c - '0';
    }
}
