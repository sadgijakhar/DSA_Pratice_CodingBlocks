package Recusrion_CBA;

import java.util.ArrayList;

public class Chessboard_Problem_Count_Print {
    public static void main(String[] args) {
        int n = 3;
        String s = "{0-0}";
        ArrayList<String> arr = new ArrayList<>();
        arr = move(0, 0, s, n,arr);
        for(String str : arr){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println(arr.size());
        // System.out.println(s);
    } 
    public static ArrayList<String>  move(int r, int c, String path, int N , ArrayList<String> arr ){
        if(r >= N || c >=N){
            return arr;
        }
        if( r== N-1 && c == N-1){
            // System.out.print(path+" ");
            arr.add(path);
            return arr;
        }
        move(r+2 ,c+1 ,path+"K{"+(r+2)+"-"+(c+1)+"}",N,arr);
        move(r+1 ,c+2 ,path+"K{"+(r+1)+"-"+(c+2)+"}",N,arr);
        if(r == 0 || r == N-1 || c==0 || c== N-1){
            
            for(int i = c+1 ; i < N ; i++){
                move(r,i, path+"R{"+(r)+"-"+(i)+"}" ,N,arr);
            }
            for(int i = r+1 ; i < N ; i++){
                move(i,c, path+"R{"+(i)+"-"+(c)+"}" ,N,arr);
            }
        }
        if( r == c || r+c == N-1){
            int R = r+1;
            int C = c+1;

            while(R < N && C < N){
                move(R, C, path+"B{"+(R)+"-"+(C)+"}", N,arr);
                R++;
                C++;
            }
        }
        return arr;
        
    }
    
}
