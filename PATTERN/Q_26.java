package PATTERN;

public class Q_26 {
//         1 
//       1 2 3 
//     1 2 3 4 5 
//   1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 9 
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_digit = 1;
        int total_space = 4;
        while(row <= n){
            int cnt_space = 0;
            while(cnt_space < total_space){
                System.out.print("  ");
                cnt_space++;
            }
            int cnt_digit = 0;
            int i =1;
            while(cnt_digit < total_digit){
                System.out.print(i+" ");
                cnt_digit++;
                i++;
            }

            row++;
            System.out.println();
            total_space--;
            total_digit+=2;
        }
    }
}
