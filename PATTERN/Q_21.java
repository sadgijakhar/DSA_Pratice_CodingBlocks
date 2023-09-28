package PATTERN;

public class Q_21 {

// *                       *  
// *  *                 *  *  
// *  *  *           *  *  *  
// *  *  *  *     *  *  *  *  
// *  *  *  *  *  *  *  *  * 

   public static void main(String[] args) {
    int row =1;
    int n = 5;
    int total_star1 = 1;
    int total_star2 = 1;
    int total_space = 2*n-3; 

    while(row <= n){
        int cnt_star1 = 0;
        while(cnt_star1 < total_star1){
            System.out.print("*  ");
            cnt_star1++;
        }
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("   ");
            cnt_space++;
        }
        int cnt_star2 = 0;
        while(cnt_star2 < total_star2){
            System.out.print("*  ");
            cnt_star2++;
        }
        row++;
        System.out.println();
        // System.out.println(total_space);
        if(row < n){
            total_space = total_space-2;
            total_star1++;
            total_star2++;
        }
        else{
            total_space = total_space -2;
            total_star1++;
        }
    }
   } 
}
