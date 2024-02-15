package Upgrad;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0 ; i < n ;i++){
            int j = 0;
            for(int k = 0 ; k < i ; k++){
                System.out.print("  ");
                j++;
            }
            while(j < n){
                System.out.print(i+1+" ");
                j++;
            }
            System.out.println();
        }
       } 
}
