package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class Mazepath_D_Count_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int arr[][] = new int[N1][N2];
        int i = 0 ;
        int j = 0;
        String str ="";
        ArrayList<String> aaa = new ArrayList<>();
        recurr(arr, N1, N2, i, j, str,aaa);
        for(String s1 : aaa){
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.println(aaa.size());
        sc.close();
    }

    static ArrayList<String> recurr(int arr[][] , int N1, int N2 ,int i ,int j , String str, ArrayList<String> aa){
        if(i == N1 && j == N2){
            aa.add(str.substring(0,str.length()-1));
            return aa;
        }
        if(j < N2 && i < N1 ){
            // System.out.println("i "+ i+" j "+j);
            recurr(arr, N1, N2, i+1, j, str+"V",aa);
            recurr(arr, N1, N2, i, j+1, str+"H",aa);
            // if(i == j){
                recurr(arr, N1, N2, i+1, j+1, str+"D",aa);
            // }
            

        }
        // if(j < N2 ){
        //     // str += "H";
        //     recurr(arr, N1, N2, i, j+1, str+"H");
        // }

        // if(i < N1){
        //     // str+="V";
        //     recurr(arr, N1, N2, i+1, j, str+"H");
        // }
        return aa;

        

    }
}
