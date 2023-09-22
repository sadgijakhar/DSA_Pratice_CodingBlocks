package lecture_3;

import java.util.Scanner;

public class Fabonacci {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0 ;
    int b = 1;
    int i = 0;
    int c = 0;
    while(i<n){
        c = a+b;
        a = b;
        b=c;
        i++;
    }
    System.out.println(c);
    sc.close();
   } 
}
