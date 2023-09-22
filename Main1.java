import java.util.*;
public class Main1 {
    static int change(int n){
        int sum = 0;
        int i = 0;
        while(n != 0){
            int c = n%10;
            if(c == 0){
                sum += 5* (int)Math.pow(10,i);
            }else{
                sum += c* (int)Math.pow(10,i);
            }
            
            n = n/10;
            i++;
        }
        return sum;
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = change(n);
        System.out.println(a);
        sc.close();
    }
}