package PATTERN;

public class Q_24 {

    //             1 
    //          2  2  2 
    //       3  3  3  3  3 
    //    4  4  4  4  4  4  4 
    // 5  5  5  5  5  5  5  5  5 
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_space = 4;
    int total_one = 1;
    int i =1;

    while(row<= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            System.out.print("   ");
            cnt_space++;
        }
        int cnt_digit = 0;
        while(cnt_digit < total_one){
            System.out.print(" "+i+" ");
            cnt_digit++;
        }
        row++;
        System.out.println();
        i++;
        total_one+=2;
        total_space--;
    }
   } 
}
