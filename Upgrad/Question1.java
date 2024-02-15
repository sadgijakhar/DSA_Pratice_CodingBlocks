package Upgrad;

public class Question1 {
    public static void main(String[] args) {
        // pf(10);
        // pf1(-10);
        // System.out.println(fib(6));sout
        int a = 2+3;
        int b = 4+3;
        // System.out.println((a)&&(b));
    } 


    static void pf(int i){
        if(i <- 0){
            return;
        }
        System.out.println(i);
        pf(i-1);
    }

    static void pf1(int i){
        if(i > 10){
            return;
        }
        System.out.println(i);
        pf1(i+1);
    }

    static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    
}
