package Recusrion_CBA;

import java.util.Scanner;

public class Recursion_Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count [] = {0};
        recurr(str, count, str.length() , 0);
        sc.close();
    }

    static void recurr(String str ,int count[], int length , int i){

        if( i >= length){
            return;
        }
    }


}
