package lecture_3;

import java.util.*;
public class DecimalToOctal  {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0 ;
        int mul = 1;
        int a = 0;
        while( n > 0){
            int c = n%8;
            n = n/8;
            if(n  == 0){
                a =c;
                sum += a*mul;
                break;
            }
            sum += c*mul;
            mul *=10;
        }
        sc.close();
        System.out.println(sum);
    }

}
