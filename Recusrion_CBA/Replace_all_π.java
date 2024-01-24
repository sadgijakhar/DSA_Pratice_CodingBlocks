package Recusrion_CBA;

// import java.util.ArrayList;
import java.util.Scanner;

public class Replace_all_π {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < t; i++){
            String str = sc.next();
            fun(str);
            // arr.add(sc.next());
        }
        sc.close();
       } 
    
       static void fun(String str){
        int n = str.length();
        String s = "";
        for(int i = 0 ; i < n ;i++){
            if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
                s += "3.14"; 
    
            }
            else if(str.charAt(i) == 'i'){
                continue;
            }
            else{
                s += str.charAt(i);
            }
            
        }
        System.out.println(s);
       }
}
