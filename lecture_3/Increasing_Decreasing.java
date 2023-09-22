package lecture_3;

import java.util.*;
public class Increasing_Decreasing {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            boolean decreasing = true;
            boolean increasing = false;
            while(n-1 != 0){
                int b = sc.nextInt();
                if(a>b){
                    if(increasing){
                        if (b < a) {
                            if (increasing) {
                                System.out.println("false");
                                return;
                            }
                        }
                    }
                    decreasing = true;
                } 
                else if (b > a) {
                    if (decreasing) {
                       increasing = true;
                    } 
                    else {
                        System.out.println("false");
                        return;
                    }
                } 
                else{
                    System.out.println("false");  
                    return;
                }
                
                a = b;
                n--;
            }

            System.out.println("true");
            sc.close();
        }
    }
}