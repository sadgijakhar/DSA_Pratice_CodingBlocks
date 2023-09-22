package lecture_3;

import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(n!= 0){
            int c = n%10;
            sum+= c*(int)Math.pow(2,i);
            // System.out.println(c+" "+sum);
            n = n/10;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
