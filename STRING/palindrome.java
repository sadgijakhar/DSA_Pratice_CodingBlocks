package STRING;

public class palindrome {
   public static void main(String[] args) {
    String a = "NITIn";
    a = a.toLowerCase();
    String t ="";
    for(int i = a.length() - 1 ; i >= 0  ; i--){
        char c = a.charAt(i);
        t+=c;
    }
    if(a.equals(t)){
        System.out.println("Yes");
    }
    else{
        System.out.println("NO");
    }
   } 
}
