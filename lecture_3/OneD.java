package lecture_3;

import java.util.Scanner;

public class OneD {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0 ;
        int b = 0;
        while( i < n){
            int c = sc.nextInt();
            if(c == 0 && i == n-1){
                c = sc.nextInt();
            }
            b += c*Math.pow(10,i);
            i++;
        }
        System.out.println(b);
        
        sc.close();
   } 
}
