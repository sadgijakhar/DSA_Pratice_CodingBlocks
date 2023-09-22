package lecture_3;

import java.util.Scanner;

public class Invert {

    static long change(long n){
        int l = leng(n);
        long sum = 0;
        int i = 0;
        while(n != 0){
            long c = n%10;
            if((9-c) == 0 && i == l-1){
                sum += c* (int)Math.pow(10,i);
            }
            else if(c ==0){
                sum += c* (int)Math.pow(10,i); 
            }
            else if((9-c) > c && (9-c) >= 0){
                sum += c* (int)Math.pow(10,i);
            }
            else{
                sum += (9-c)* (int)Math.pow(10,i);
            }
            n = n/10;
            i++;
        }
        return sum;
        
    }
    static int leng(long n){
        String num = Long.toString(n);
        int length = num.length();
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(change(n));
        sc.close();
    }
}
