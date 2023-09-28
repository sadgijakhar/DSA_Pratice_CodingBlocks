package PATTERN;
public class Q_14 {

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         *

   public static void main(String[] args) {
    int n =5;
    int row = 1; 
    int total_str = 1;
    int total_space = 4;
    while(row <= 2*n-1){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("  ");
            cnt_space++;
        }
        int cnt_star = 0;
        while(cnt_star < total_str){
            System.out.print("* ");
            cnt_star++;
        }
        System.out.println();
        row++;
        if(row <= n){
            total_str++;
            total_space--;
        }
        else{
            total_str--;
            total_space++;
        }
    }
   } 
}
