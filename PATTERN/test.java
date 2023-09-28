package PATTERN;

public class test {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int total_str = 1;
        while(row <= 2*n-1){
            int cnt_str = 0;
            while(cnt_str < total_str){
                System.out.print("* ");
                cnt_str++;
            }
            System.out.println();
            row++;
            if(row <= n){
                total_str++;
            }
            else{
                total_str--;
            }
        }
        // int s = 1;
        // for(int i = n ; i > 0 ;i--){
        //     for(int j = 0 ; j < i ;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k = 0 ; k < s ;k++){
                
        //         System.out.print("* ");
                
        //     }
        //     s = s+2;
        //     System.out.println();
        // }
       }  
}
