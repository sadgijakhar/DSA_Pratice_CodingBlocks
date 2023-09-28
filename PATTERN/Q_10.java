package PATTERN;

public class Q_10 {

    // * * * * * * * * *
    //  * * * * * * *
    //    * * * * *
    //      * * *
    //        *
   public static void main(String[] args) {
    int n = 5;
    int s = 2*n -1;
    for(int i = n ; i > 0 ;i--){
        for(int j = n ; j > i ;j--){
            System.out.print("  ");
        }
        for(int k = s ; k > 0 ;k--){
            System.out.print(" *");
            
        }
        s = s-2;
        System.out.println();
    }
   } 
}
