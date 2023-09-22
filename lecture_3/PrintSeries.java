package lecture_3;

public class PrintSeries {
    static boolean check(int n ,int b){
        if(n%b == 0){
            return false;
        }
        return true;
    }
    public static void printSeries(int N1, int N2) {
        int count = 0;
        int n = 1;
        
        while (count < N1) {
            int term = 3 * n + 2;
            
            if (term % N2 != 0) {
                System.out.println(term);
                count++;
            }
            
            n++;
        }
    }
   public static void main(String[] args) {
        int n = 10;
        // int i = 1;
        // while( n>0 ){
        //     if(check(i,4)){
        //         int c = 3*(i) +2;
        //         System.out.println(c);
        //         n--;
        //     }
            
        //     i++;

        // }
        printSeries(n, 4);
   } 
}
