package lecture_3;

public class Extraction {
   public static void main(String[] args) {
    int n = 12345;
    // int i = 0;
    int sum = 0;
    while(n!=0){
        int c = n%10;
        sum = sum *10 +c;
        n = n/10;
        // i++;
    }
    System.out.println(sum);
   } 
}
