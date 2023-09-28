package PATTERN;

public class Q_9 {

    //         * 
    //      *  *  * 
//       *  *  *  *  * 
//    *  *  *  *  *  *  * 
// *  *  *  *  *  *  *  *  * 
   public static void main(String[] args) {
    int n = 5 ;
    
    for(int i = n ; i > 0 ; i--){
        for(int j = 1 ; j < i ; j++){
            System.out.print("   ");
        }
        // int t = n;
        for(int k = i ; k < n+1; k++){
            System.out.print(" * ");
            if(k != n){
                System.out.print(" * ");
            }
            
        }
        System.out.println();
    }
   } 
}