package PATTERN;

public class Q_31 {
    
// 5 4 3 2 * 
// 5 4 3 * 1 
// 5 4 * 2 1 
// 5 * 3 2 1 
// * 4 3 2 1 
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_digit1 = 4;
        int total_digit2 = 0;
        int total_star  = 1;
        
        while(row <= n){
            int cnt_digit1 = 0;
            int t = n;
            while(cnt_digit1 < total_digit1){
                System.out.print(t+" ");
                cnt_digit1++;
                t--;
            }
            int cnt_star = 0;
            while(cnt_star < total_star){
                System.out.print("* ");
                cnt_star++;
                t--;
            }
            int cnt_digit2 = 0;
            while(cnt_digit2 < total_digit2){
                System.out.print(t+" ");
                cnt_digit2++;
                t--;
            }
            row++;
            System.out.println();
            total_digit1--;
            total_digit2++;
        }
    }
    
}
