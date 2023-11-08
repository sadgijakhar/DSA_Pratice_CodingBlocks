package STRING;

public class CountAllPalindromicSubstring {
   public static void main(String[] args) {
    String str = "nitin";
    int count = 0;
    int a = str.length();
    for(int i = 0 ; i < a; i++){
        int j = i+1;
        while(j < a+1){
            if(palindrome(str.substring(i, j))){
                count++;
            }
            j++;
        }
    }
    System.out.println(count);
    
   } 
   public static void solve(String str){
    for(int axis =0 ; axis < str.length() ; axis++){
        grow(str, axis, axis);
        grow(str,axis,axis+1);
    }
   }
   public static void grow(String str, int L , int R){
    while(L>=0 && R<str.length()){
        if(str.charAt(L)==str.charAt(R)){
            System.out.println(str.substring(L, R+1));
            L--;R++;
        }
        else{
            break;
        }
    }
   }
   public static boolean palindrome(String a){
    a = a.toLowerCase();
    String t ="";
    for(int i = a.length() - 1 ; i >= 0  ; i--){
        char c = a.charAt(i);
        t+=c;
    }
    if(a.equals(t)){
        return true;
    }
    else{
        return false;
    }
   }
}
