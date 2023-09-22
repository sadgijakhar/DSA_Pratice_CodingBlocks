package lecture_3;

public class reverse {

    static int prime(int n){
        int count = 1;
        int i = 2 ;
        while( i <= n){
            if(n % i == 0){
                count++;
            }
            i++;
        }
        return count;
    }


   public static void main(String[] args) {
        int a = 10;
        int i = 2;
        while(i <= a){
            int factor = prime(i);
            if(factor == 2){
                System.out.println(i);
            }
            i++;
        }
    
   } 
}
