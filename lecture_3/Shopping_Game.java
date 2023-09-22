package lecture_3;

import java.util.Scanner;

public class Shopping_Game {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
        int maxA = sc.nextInt();
        int maxHa = sc.nextInt();
        int phone = 1;
        int currH = 0;
        int currA = 0;
        while(true){
            currA = currA+phone;
            phone++;
            if(currA > maxA){
                System.out.println("Harshit");
                break;
            }
            currH = currH+phone;               
            phone++;
            if(currH > maxHa){
                System.out.println("Aayush");
                break;
            }
        }
    }
    
    // while(n > 0){
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     int i = 1;
    //     int j = 1;
    //     while(sum1 <= a && sum2 <=b){
    //         if((sum1+i) > a){
    //             if(sum1 > sum2){
    //                 System.out.println("Aayush");
    //             }
    //             else{
    //                 System.out.println("Harshit");
    //             }
    //             break;
    //         }
    //         sum1 += i ;
    //         if((sum2+2*(j)) > b){
    //             if(sum1 > sum2){
    //                 System.out.println("Aayush");
    //             }
    //             else{
    //                 System.out.println("Harshit");
    //             }
    //             break;
    //         }
    //         sum2 += 2*(j);
    //         i = sum2+1;
    //         j++;
    //     }
        
    //     n--;
    // }
    sc.close();
   } 
}
