package Leetcode;

public class FindFirstPalindromicStringInTheArray {
    
    public static void main(String[] args) {
        // String words[] = {"abc","car","ada","racecar","cool"};
        // String words[] = {"notapalindrome","racecar"};
        String words[] = {"def","ghi"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        String s = "";
        for(int i = 0 ; i < words.length ; i++){
            s = words[i];
            if(Palindrome(s)){
                return s;
            }
            else{
                s ="";
            }
        }
        return s;
    }

    static boolean Palindrome(String s){
        boolean n = true;
        int low = 0;
        int high = s.length()-1;
        while(low < high){
            if(s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }
            else{
                n = false;
                break;
            }
        }
        return n;
    }


}
