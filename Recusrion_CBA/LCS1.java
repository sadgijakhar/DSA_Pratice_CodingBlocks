package Recusrion_CBA;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
// import java.util.HashSet;
import java.util.Scanner;

public class LCS1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        // String s3 = sc.next();
        ArrayList<String> str = new ArrayList<>();
        str = recurr(s1 , s2 , 0, 0,"",str);

        // str = recurr(s2 , s3 , 0, 0,"",str);
        Collections.sort(str, Comparator.comparing(String::length).reversed());
        System.out.println(str.get(0));
        sc.close();
    }

    static ArrayList<String> recurr(String s1 , String s2 , int i, int j, String s,ArrayList<String> str){
        // String s = "";
        
        if( i >= s1.length() || j >= s2.length()){
            str.add(s);
            // System.out.println(str);
            return str;
        }
        // System.out.println(s);
        if(s1.charAt(i) == s2.charAt(j)){
            s += s1.charAt(i);
        }
        recurr(s1, s2, i+1, j,s,str);
        recurr(s1, s2, i, j+1,s,str);

        return str;

    }
}

