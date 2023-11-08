package STRING;

public class Concate {
   public static void main(String[] args) {
    String str = "abcd";
    int n = str.length();
    int index = 2;
    if(index < n){
        String str1 = str.substring(0,index);
        String str2 ="";
        if(index > 0){
            str2 = str.substring(index+1,n);;
        }
        System.out.println(str1+str2);
    }
    else{
        System.out.println(-1);
    }
    
    
   } 
}
