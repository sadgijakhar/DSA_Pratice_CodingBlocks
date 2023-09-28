package PATTERN;

public class Q_27 {

//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
    public static void main(String[] args) {
        int n = 5;
        int row =1;
        int total_digit = 1;
        int total_space = 4;

        while(row <= n){
            int cnt_space = 0;
            while(cnt_space < total_space){
                cnt_space++;
                System.out.print("  ");
            }
            int cnt_digit = 0;
            int i = 1;
            int s = 1;
            while(cnt_digit < total_digit && i <= row){
                System.out.print(i+" ");  
                
                i++;
                cnt_digit++;
                s = i; 
                
            }
            i--;
            while(cnt_digit < total_digit && s > row){   
                i--;
                System.out.print(i+" ");
                cnt_digit++;
            }
            
            row++;
            System.out.println();
            total_digit+=2;
            total_space--;
        }
    }
    
}
