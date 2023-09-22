import java.util.*;
public class Main {

    static void sumOf(int a){
        int Esum =0;
        int Osum =0;
        while(a!=0){
            int c = a%10;
            if(c%2 == 0){
                Esum+=c;
            }
            else{
                Osum +=c;
            }
            a = a/10;
        }
        if(Osum % 3 == 0 || Esum % 4 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n !=0){
            int a = sc.nextInt();
            sumOf(a);
            n--;
        }
        sc.close();
        

    }
}