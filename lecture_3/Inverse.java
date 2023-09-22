package lecture_3;
import java.util.Scanner;
public class Inverse {

  static int invert(int n){
    int digit = 0;
    int j =1;
    while(n>0){
      int c = n %10;
      digit += j*Math.pow(10,(c-1));
      n=n/10;
      j++;
    }
    return digit;
  }


  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(invert(n));
  sc.close();
  } 


}