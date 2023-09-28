package PATTERN;

public class Q_22 {

//  *  *  *  *  *  *  *  *  * 
//  *  *  *  *     *  *  *  * 
//  *  *  *           *  *  * 
//  *  *                 *  * 
//  *                       * 
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_space = 0;
    int total_star1 =  5;
    int total_star2 = 4;
    while(row <= n){
        int cnt_star1 = 0;
        while(cnt_star1 < total_star1){
            System.out.print(" * ");
            cnt_star1++;
        }
        int cnt_space = 0 ;
        while(cnt_space < total_space){
            System.out.print("   ");
            cnt_space++;
        }
        int cnt_star2 = 0;
        while(cnt_star2 < total_star2){
            System.out.print(" * ");
            cnt_star2++;
        }
        row++;
        System.out.println();
        total_star1--;
        if(row == 2){
            total_space++;
        }
        else{
            total_space = total_space+2;
            total_star2--;
        }
    }
   } 
}
