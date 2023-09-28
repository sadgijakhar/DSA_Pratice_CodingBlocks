package PATTERN;

public class Q_30 {
    // 5 4 3 2 1 
    // 5 4 3 2 1 
    // 5 4 3 2 1 
    // 5 4 3 2 1 
    // 5 4 3 2 1
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_digit = 5;
    

    while(row <= n){
        int cnt_digit = 0;
        int t = n;
        while(cnt_digit < total_digit){
            System.out.print(t+" ");
            cnt_digit++;
            t--;
        }
        row++;
        System.out.println();
    }
   } 
}
