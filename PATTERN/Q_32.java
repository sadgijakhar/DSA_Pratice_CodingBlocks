package PATTERN;

public class Q_32 {

    // 1 
    // 2 * 2 
    // 3 * 3 * 3 
    // 4 * 4 * 4 * 4 
    // 5 * 5 * 5 * 5 * 5 
    // 4 * 4 * 4 * 4 
    // 3 * 3 * 3 
    // 2 * 2 
    // 1 
   public static void main(String[] args) {
    int n = 5;
    int row = 1;
    int total_digit1 = 1;
    int t = 1;
    while(row <= 2*n-1){
        int cnt_digit = 0;
        while(cnt_digit < total_digit1){
            if(cnt_digit %2 ==0){
                System.out.print(t+" ");
            }
            else{
                System.out.print("* ");
            }
            cnt_digit++;
        }
        row++;
        System.out.println();
        if ( row <= n){
            total_digit1+= 2;
            t++;
        }
        else{
            total_digit1 -=2;
            t--;
        }
    }

   } 
}
