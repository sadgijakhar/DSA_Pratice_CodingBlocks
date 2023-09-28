package PATTERN;

public class Q_23 {

//             1  
//          1  1  1  
//       1  1  1  1  1  
//    1  1  1  1  1  1  1  
// 1  1  1  1  1  1  1  1  1
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_space = 4;
    int total_one = 1;

    while(row <= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("   ");
            cnt_space++;
        }
        int cnt_one = 0;
        while(cnt_one < total_one){
            System.out.print("1  ");
            cnt_one++;
        }
        row++;
        System.out.println();
        total_one+=2;
        total_space--;
    }
   } 
}
