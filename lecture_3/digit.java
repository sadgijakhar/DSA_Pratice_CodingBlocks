package lecture_3;

public class digit {
    
        static long change(long n){
            long sum = 0;
            int i = 0;
            while(n != 0){
                long c = n%10;
                sum += c* (int)Math.pow(10,i);
                n = n/10;
                i++;
            }
            return sum;
            
        }
        public static void main(String[] args) {
            long n = 1234;
            System.out.println(change(n));
        }
     
}
