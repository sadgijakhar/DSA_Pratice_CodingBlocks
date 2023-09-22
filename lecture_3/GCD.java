package lecture_3;

import java.util.Scanner;

public class GCD {

    static int GCD1(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return GCD1(n2, n1 % n2);
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    System.out.println(GCD1(n1,n2));

    sc.close();

   } 
}
