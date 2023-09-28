package PATTERN;

public class Q_33 {
//                   0 
//                 9 0 9 
//               8 9 0 9 8 
//             7 8 9 0 9 8 7 
//           6 7 8 9 0 9 8 7 6 
//         5 6 7 8 9 0 9 8 7 6 5 
//       4 5 6 7 8 9 0 9 8 7 6 5 4 
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
   public static void main(String[] args) {
    int n = 10;
    int row =1;
    int total_space = 9;
    int total_digit = 1;
    while(row <= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            cnt_space++;
            System.out.print("  ");
        }
        int cnt_digit = 0;
        int t = 0;
        if(total_digit %2 == 0){
            t = total_digit/2;
        }
        else{
            t = (total_digit+1)/2;
        }
        int i = 9-t+2;
        while(cnt_digit < total_digit && t>0){
            
            if(t == 1){
                System.out.print(0+" ");
            }
            else{
                System.out.print(i+" ");
                i++;
            }
            
            t--;
            cnt_digit++;
        }
        i--;
        while(cnt_digit < total_digit && t <= 0){
            System.out.print(i+" ");
            i--;
            cnt_digit++;
        }
        row++;
        System.out.println();
        total_digit +=2;
        total_space--;
    }
   } 
}
