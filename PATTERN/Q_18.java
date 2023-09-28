package PATTERN;

public class Q_18 {

//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 
   public static void main(String[] args) {
    int n =7;
    int row = 1;
    int total_space = 3;
    int total_star = 1;
    int s = (n+1)/2;

    while( row <= n){
        int count_space = 0;
        while(count_space < total_space){
            System.out.print("  ");
            count_space++;
        }
        int count_star = 0;
        while(count_star < total_star){
            System.out.print("* ");
            count_star++;
        }
        row++;
        System.out.println();
        if(row <= s){
            total_space--;
            total_star = total_star+2;
        }
        else{
            total_space++;
            total_star = total_star-2; 
        }

    }
   } 
}
