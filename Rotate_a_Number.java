public class Rotate_a_Number {
    public static int rotate(int n ,int leng){
        int count =0;
        int i = 0;
        while(n!= 0){
            int c = n%10;
            if(i == 0 ){
                count += c* (int)Math.pow(10,leng-1);
            }
            else{
                count += c * (int)Math.pow(10,i-1); 
            }
            i++;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        int rotate = 1;
        int move = rotate%5;
        System.out.println(move);
        int a = n;
        int count = 0;
        while(a !=0){
            count++;
            a= a/10;
        }
        while (move > 0){{
            n = rotate(n,count);
            move--;
        }
        System.out.println(n);
        }
    }
}
