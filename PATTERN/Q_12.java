package PATTERN;

public class Q_12 {
//             * 
//          *  !  * 
//       *  !  *  !  * 
//    *  !  *  !  *  !  * 
// *  !  *  !  *  !  *  !  * 
    public static void main(String[] args) {
        int n = 5;
        int s = 1;
        for(int i = n ; i > 0 ;i--){
            for(int j = 0 ; j < i ;j++){
                System.out.print("   ");
            }
            for(int k = 0 ; k < s ;k++){
                if(k %2==0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" ! ");
                }
                
                
            }
            s = s+2;
            System.out.println();
        }
       }  
}
