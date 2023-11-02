package CodingBlocksAssignment;

import java.util.Scanner;
public class RainWaterTrapping {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n > 0){
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0 ; i< s;i++){
            arr[i] = sc.nextInt();
        }
        
        int lPonter = arr[0];
        int rPointer = arr[s-1];
        int count= 0;
        int i = 1 ; int j = s-2;
        while(i <= j){
            if(lPonter <= rPointer){
                int check = lPonter-arr[i];
                if(check > 0){
                    count += check;
                }
                if(lPonter < arr[i]){
                    lPonter = arr[i];
                }
                i++;

            }
            else{
                int check = rPointer-arr[j];
                if(check > 0){
                    count+= check;
                }
                if(rPointer < arr[j]){
                    rPointer = arr[j];
                }
                j--;

            }
        }
        System.out.println(count);
        n--;
    }
    sc.close();
   } 
}
