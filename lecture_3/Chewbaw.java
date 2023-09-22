package lecture_3;

import java.util.*;
public class Chewbaw  {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        int mul = 1;
        while(n >0){
            long c = n % 10;
            if(n != 0 && c>= 5){
                c = 9-c;
            }
            sum+= c * mul;
            mul *= 10;
            n = n/10;
        }
        System.out.println(sum);
        sc.close();
    }

}

