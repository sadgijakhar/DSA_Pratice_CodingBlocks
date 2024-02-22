package Leetcode;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "aaa";
        // int count[] = {0};
        recurr(str, 0);
        // System.out.println(count[0]);
        
    }
    static void recurr(String s , int i){
        // if(i >= s.length()){
            
        //     if(Palindromi(str)){
        //         System.out.println(str+" "+" yes");
        //         count[0]=count[0]+1;
        //     }
        //     return;
        // }
        int ans = 0;
        int n = s.length();
        for(i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(Palindromi(s)) ans++;
            }
        }
        System.out.println(ans);
    }

    static boolean Palindromi(String s){
        int i = 0 ; 
        int j = s.length()-1;
        if(s.length() == 0){
            return false;
        }
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
