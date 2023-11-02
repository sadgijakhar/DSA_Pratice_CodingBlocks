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
    while(a > 0){
        int rupees = sc.nextInt();
        int chances = sc.nextInt();
        int count= 0;
        for(int i = 0 ; i<n;i++){
            if(rupees % arr[i] == 0){
                count++;
            }
        }
        if(chances <= count){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        a--;
    }
    sc.close();
   } 
}
