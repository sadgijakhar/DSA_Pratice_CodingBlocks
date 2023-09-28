package PATTERN;

public class Q_16 {

//         * * * * * 
//       * * * * 
//     * * * 
//   * * 
// * 
//   * * 
//     * * * 
//       * * * * 
//         * * * * * 
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_space = 4;
    int total_star = 5;
    while(row <= 2*n-1){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("  ");
            cnt_space++;
        }
        int cnt_star = 0;
        while(cnt_star < total_star){
            System.out.print("* ");
            cnt_star++;
        }
        row++;
        System.out.println();
        if(row<= n){
            total_space--;
            total_star--;
        }
        else{
            total_space++ ;
            total_star++;
        }
    }
   } 
}
