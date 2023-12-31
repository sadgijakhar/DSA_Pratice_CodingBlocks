package Recusrion_CBA;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    //Question
    // Piyush is lost in a magical park which contains N rows and M columns.
    // In order to get out of park safely and return home, he needs atleast K amount of strength.
    // Given a N by M pattern, your task is to find weather Piyush can ever escape the park.

    // Piyush enters the park with strength S. 
    // The park is filled with some obstacles denoted by ‘.’ , 
    // some magical beans denoted by ‘*’ and some blockades denoted as ‘#’. 
    // If he encounters an obstacle (.) , strength decreases by 2. 
    // If he encounters a magic bean (' * ') , his strength increases by 5. 
    // Piyush can only walk row wise, so he starts from left of a row and moves towards right and 
    // he does this for every row. However when he encounters a blockade (#) , 
    // he cannot go any further in his current row and simply jumps to the start of a new line without 
    // losing any strength. Piyush requires a strength of 1 for every step. 
    // His strength should always be greater than K while traversing or else Piyush will get lost.
    // Assume that Piyush can shift immediately from last of one row to the start of next one without loss 
    // of any strength, help out Piyush to escape the park. His escape is successful if he is able to return 
    // home with atleast K strength.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        char c [][] = new char[N][M];
        for(int i = 0 ; i < N ;i++){
            for(int j = 0 ; j < M ;j++){
                String str = sc.next();
                c[i][j] = str.charAt(0);
            }
        } 
        int i = 0 ; int j =0;
        puzzle(c, i, j, N, M, K, S);
        sc.close();

    }

    static void puzzle(char c[][], int i, int j, int N, int M, int K, int S){
        if( K <= S && N > 0){
            char ch = c[i][j];
            j++;
            System.out.println(ch+" i= " + i+ " j= "+ j + " N= "+N+" M= "+M);
            if(ch == '.'){
                S = S-2;
            }
            else if( ch == '*'){
                S = S+5;
            }
            
            if( ch=='#' || j == M){
                N--;
                j = 0;
                i++;
                S++;
                System.out.println("N = " +N+" i= " + i+ " j= "+ j);
            }
            System.out.println(S);
            
            S--;
            
            puzzle(c, i, j, N, M, K, S);

        }
        else if( N > 0 ){
            System.out.println("No");
        }
        else{
            System.out.println(S);
            System.out.println("Yes");
        }
    }

    



}
