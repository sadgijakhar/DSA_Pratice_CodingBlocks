package PATTERN;

public class Q_15 {

//    * * * * * 
//        * * * * 
//             * * * 
//                 * * 
//                     * 
//                 * * 
//             * * * 
//         * * * * 
//     * * * * *
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_star = 5;
        int total_space = 0;
        while(row <= 2*n-1){
            
            int cnt_space = 0;
            while(cnt_space < total_space){
                System.out.print("  ");
                cnt_space++;
            }
            int cnt_star = 0;
            while(cnt_star < total_star){
                System.out.print("* ");
                cnt_star++;
            }
            System.out.println();
            row++;
            if(row <= n){
                total_space = (row-1) * 2;
                total_star--;
            }
            else{
                total_space = total_space- 2;
                total_star++; 
            }
        }
    }
    
}
