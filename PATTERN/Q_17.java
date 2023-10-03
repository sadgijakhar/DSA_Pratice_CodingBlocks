package PATTERN;

public class Q_17 {

// * * *   * * * 
// * *       * * 
// *           * 
//               
// *           * 
// * *       * * 
// * * *   * * * 
   public static void main(String[] args) {
    int n = 7;
    int row = 1;
    int total_space = 1;
    int total_star1 = 3;
    int total_star2 = 3;
    int s = 0;
    if(n%2 == 0){
        s = n/2;
    }
    else{
        s = (n+1)/2;
    }
   

    while(row <= n){
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
        while(cnt_star2<total_star2){
            System.out.print("* ");
            cnt_star2++;
        }
        System.out.println();
        row++;
        if(row <= s){
            total_space = total_space+2;
            total_star1--;
            total_star2--;
        }
        else{
            total_space = total_space-2;
            total_star1++;
            total_star2++;
        }
    }

   } 
}
