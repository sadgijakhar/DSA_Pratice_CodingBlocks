package PATTERN;


public class Star_5_1 {
   public static void main(String[] args) {
    int n = 5;
    int j = 5;
    while(n >0){
        while(j >0){
            System.out.print("* ");
            j--;
        }
        System.out.println();
        n--;
        j = 5;
    }
   } 
}
