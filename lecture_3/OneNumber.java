package lecture_3;

import java.util.Scanner;

// public class OneNumber {
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int i = 0 ;
//     int b = 0;
//     while( i < n){
//         int c = sc.nextInt();
//         b += c*Math.pow(10,i);
//         i++;
//     }
//     System.out.println(b);
//     sc.close();
//    } 
// }



public class OneNumber {

    // static boolean armStrong(int n , int l){
    //     int sum = 0;
    //     int a = n;
    //     while(n != 0){
    //         int c = n % 10;
    //         sum+= (int)Math.pow(c,l);
    //         n = n/10;
    //     }
    //     if(sum  ==  a){
    //         return true;
    //     }
    //     return false;
    // }
    // static int len(int n){
    //     String a = String.valueOf(n);
    //     int l = a.length();
    //     return l  ;
    // }

    static int lcm(int n1, int n2){
        int a = n1;
        int b = n2;
        while(n1*n2 >0){
            int R = n1%n2;
            n1 = n2;
            n2 = R;
        }
        int lcm = (a*b)/n1;
        return lcm;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    System.out.println(lcm(n1,n2));
    // int l = len(n);
    // System.out.println(armStrong(n, l));
    sc.close();
   } 
}
