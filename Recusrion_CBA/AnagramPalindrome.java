package Recusrion_CBA;


import java.util.Scanner;

public class AnagramPalindrome {
    // Given a String, check if characters of string can be arranged in such a manner that it forms a palindrome.
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int j = 0 ; j < 2 ; j++){
        String s = sc.next();
        int n = s.length();
        int [] arr = new int[n];

        arr = recurr(arr, s, 0, n);
        // System.out.println(Arrays.toString(arr));
        boolean odd = true;
        boolean even = true;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 != 0 ){
                if(odd){
                    odd = false;
                }
                else{
                    System.out.println("NO");
                    even = false;
                    break;
                }
                
            }
        }
        if(even){
            System.out.println("YES");
        }
    }
    
    sc.close();
   } 

   static int[] recurr(int [] arr, String s, int i, int n){
    if(i >= n){
        return arr;
    }
    char c = s.charAt(i);
    int n1 = c - 97;
    // System.out.println(n1%(n-1));
    arr[n1%(n-1)] += 1;
    recurr(arr, s, i+1, n);
    return arr;
    
   }

}
