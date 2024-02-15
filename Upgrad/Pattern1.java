package Upgrad;

public class Pattern1 {
   public static void main(String[] args) {
    int n = 4;
    for(int i = n ; i > 0 ;i--){
        int j = n;
        for(int k = n ; k > i ; k--){
            System.out.print("  ");
            j--;
        }
        while(j > 0){
            System.out.print(j+" ");
            j--;
        }
        System.out.println();
    }
   } 


}
