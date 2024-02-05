package Recusrion_CBA;

public class test {
   public static void main(String[] args) {
    int a[] = {1,2};
    int b[] = a;
    b[0] = 4;
    System.out.println(a[0]);

    int percentage = 0;

    if(percentage >= 90){
        System.out.println("grade A");
    }
    else if(percentage < 90 && percentage >= 70){
        System.out.println("grade B");
    }
    else if(percentage < 70 && percentage >= 50){
        System.out.println("grade C");
    }
    else{
        System.out.println("grade D");
    }
   } 
}
