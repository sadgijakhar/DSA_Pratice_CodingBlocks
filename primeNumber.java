

public class primeNumber{

    static boolean check(int a){
        if(a == 1 || a == 0){
            return true;
        }
        int n = a/2;
        for(int i = n ; i > 1 ; i--){
            if(a % i ==0){
                return true;
            }
        }
        return false;
    }

    static int prime(int n){
        int count = 1;
        int a = n/2;
        int i = 1 ;
        if( n == 0 && n == 1){
            return 0;
        }
        while( i <= a){
            if(a % i == 0){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        boolean a = check(1);
        if(a){
            System.out.println("No, It is not prime number");
        }
        else{
            System.out.println("Yes, It is prime number");
        }
        // int n = 1;
        // int factor = prime(n);
        // if(factor > 2){
        //     System.out.println(n+" is not a prime Number");
        //     System.out.println("It is having "+factor+" factors");
        // }
        // else{
        //     System.out.println(n+ " is a prime Number");
        //     System.out.println("It is having "+factor+" factors");
        // }
        
    }
}