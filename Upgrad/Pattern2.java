package Upgrad;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = n ; i > 0 ;i--){
            int j = 0;
            for(int k = n ; k > i ; k--){
                System.out.print("  ");
                j++;
            }
            while(j < n){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
        }
       } 
}
