public class Armstrong{
    public static boolean isArm(int n){
        int sum = 0;
        int a = n;
        int count = numOfDigit(n) ;
        while(a > 0){
            int c =a%10;
            sum += Math.pow(c,count);
            a = a/10;
        }
        if(n == sum){
            return true;
        }
        return false;
    }

    public static int numOfDigit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static void printAllArmstrong(int n){
        for(int i = 1 ; i <= n ; i++){
            if(isArm(i)){
                System.out.println(i);
            }
        }
    } 

    public static void main(String[] args) {
        int n = 1000;
        printAllArmstrong(n);
    }
}