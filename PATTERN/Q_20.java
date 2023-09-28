package PATTERN;

public class Q_20 {

//       * 
//     *   * 
//   *       * 
// *           * 
//   *       * 
//     *   * 
//       * 
   public static void main(String[] args) {
    int row = 1;
    int n = 7;
    int s = (n+1)/2;
    int total_space1 = 3;
    int total_space2 = 0; 
    int total_star1 = 1;
    int total_star2 = 0;

    while(row <= n){
        int cnt_space1 = 0;
        while(cnt_space1 < total_space1){
            System.out.print("  ");
            cnt_space1++;
        }
        int cnt_star1 = 0;
        while(cnt_star1 < total_star1){
            System.out.print("* ");
            cnt_star1++;
        }
        int cnt_space2 = 0;
        while(cnt_space2 < total_space2){
            System.out.print("  ");
            cnt_space2++;
        }
        int cnt_star2 = 0;
        while(cnt_star2 < total_star2){
            System.out.print("* ");
            cnt_star2++;
        }
        row++;
        System.out.println();
        if(row == 2){
            total_star2++;
            total_space1--;
            total_space2++;
        }
        else if(row ==n){
            total_star2--;
            total_space1++;
            total_space2--;
        }
        else if( row <= s){
            total_space1--;
            total_space2 = total_space2+2;
        }
        else{
            total_space1++;
            total_space2 = total_space2-2;
        }
    }
   } 
}
