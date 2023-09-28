package PATTERN;

public class Q_28 {


//         1 
//       2 3 2 
//     3 4 5 4 3 
//   4 5 6 7 6 5 4 
// 5 6 7 8 9 8 7 6 5 

   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int total_digit = 1;
    int total_space = 4;
    int i = 1;

    while(row <= n){
        int cnt_space = 0;
        while(cnt_space < total_space){
            cnt_space++;
            System.out.print("  ");
        }
        int cnt_digit = 0;
        
        // int s = i;
        int t = i;
        int s = 0;
        if(total_digit %2 ==0){
            s = total_digit/2;
        }
        else{
            s = (total_digit+1)/2;
        }
        while(cnt_digit < total_digit &&  s > 0){
            System.out.print(t+" ");   
            cnt_digit++;
            s--; 
            t++;
                
        }
        t--;
        while(cnt_digit < total_digit ){   
            t--;
            System.out.print(t+" ");
            cnt_digit++;
        }
            
        row++;
        System.out.println();
        total_digit+=2;
        total_space--;
        i++;
    }
   } 
}
