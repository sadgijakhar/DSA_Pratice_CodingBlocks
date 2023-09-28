package PATTERN;

public class Q_29 {
//         1 
//       2 0 2 
//     3 0 0 0 3 
//   4 0 0 0 0 0 4 
// 5 0 0 0 0 0 0 0 5 
   public static void main(String[] args) {
    int row =1;
    int n = 5;
    int total_digit1 =1;
    int total_digit2 =0;
    int total_space = 4;
    int total_zero = 0;
    while(row <= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("  ");
            cnt_space++;
        }
        int cnt_digit1 = 0;
        while(cnt_digit1 < total_digit1){
            System.out.print(row+" ");
            cnt_digit1++;
        }
        int cnt_zero = 0;
        while(cnt_zero < total_zero){
            System.out.print("0 ");
            cnt_zero++;
        }
        int cnt_digit2 = 0;
        while(cnt_digit2 < total_digit2){
            System.out.print(row+" ");
            cnt_digit2++;
        }
        row++;
        System.out.println();
        total_space--;
        
        if(row ==2){
            total_zero++;
            total_digit2++;
        }
        else{
            total_zero +=2;
        }
        
    }
   } 
}
