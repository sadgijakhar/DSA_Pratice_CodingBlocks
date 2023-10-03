package PATTERN;
public class Q_13 {
   public static void main(String[] args) {

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
        int n = 5;
        int row = 1;
        int total_str = 1;
        while(row <= 2*n-1){
            int cnt_str = 0;
            while(cnt_str < total_str){
                System.out.print("* ");
                cnt_str++;
            }
            System.out.println();
            row++;
            if(row <= n){
                total_str++;
            }
            else{
                total_str--;
            }
        }
    
   } 
}
