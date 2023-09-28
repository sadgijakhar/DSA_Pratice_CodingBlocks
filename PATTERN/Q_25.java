package PATTERN;

public class Q_25 {

//               1
//            2  3  4
//         5  6  7  8  9
//     10  11  12  13  14  15  16  
// 17  18  19  20  21  22  23  24  25  
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_digit = 1;
    int total_space = 4;
    int i = 1;
    while(row <= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("   ");
            cnt_space++;
        }
        int cnt_digit = 0;
        while(cnt_digit < total_digit){
            if(i / 10 != 0){
                System.out.print(i+"  ");
                cnt_digit++;
                i++;
            }
            else{
                System.out.print("  "+i+"");
                cnt_digit++;
                i++;
            } 
        }
        
        row++;
        System.out.println();
        total_digit +=2;
        total_space--;
    }

   } 
}
