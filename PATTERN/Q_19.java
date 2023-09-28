package PATTERN;

public class Q_19 {

// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 
// * *       * * 
// * * *   * * * 
// * * * * * * *

   public static void main(String[] args) {
    int n = 7;
    int row =1;
    int total_space = 0;
    int total_star1 = 4;
    int total_star2 = 3;
    int s = (n+1)/2;
    while(row<=n){
        int cnt_star1 = 0;
        while(cnt_star1 < total_star1){
            System.out.print("* ");
            cnt_star1++;
        }
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("  ");
            cnt_space++;
        }
        int cnt_star2 = 0;
        while(cnt_star2 < total_star2){
            System.out.print("* ");
            cnt_star2++;
        }
        row++;
        System.out.println();
        if(row == 2){
            total_star1--;
            total_space++;
            // System.out.println(total_star2);
        }
        else if(row == n){
            total_star1++;
            total_space--;
            
            // System.out.println(total_star2);
        }
        else if(row <= s){
            total_space = total_space+2;
            total_star1--;
            total_star2--;
            // System.out.println();
        }
        else{
            total_space = total_space-2;
            total_star1++;
            total_star2++;
        }
        
    }
   } 
}
