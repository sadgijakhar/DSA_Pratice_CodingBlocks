package Leetcode;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        // String s = "ABAB";
        String s = "AABA";
        // String s = "AABABBA";
        // String s = "ABAA";
        characterReplacement(s, 1);
    } 
    public static void characterReplacement(String s, int k) {
        int i = 0;
        int j = 1;
        int current_count = 1;
        int previous_count = 1;
        int t = k;
        int last_pointor = j;
        while(i < s.length()){
            while(j < s.length()){
                if(s.charAt(i) == s.charAt(j)){
                    current_count++;
                    i = j;
                    // previous_count++;
                    System.out.println(current_count +" "+ previous_count);
                }
                else if(t > 0){
                    current_count++;
                    t--;
                    System.out.println(current_count +" .......");
                    System.out.println(previous_count +" ........");
                    System.out.println(current_count +" "+ previous_count);
                    last_pointor = j;
                }
                else{
                    if(k == 0){
                        i++;
                    }
                    else{
                        i = last_pointor;
                        t = k;
                    }
                    System.out.println(t+ "t ");
                    current_count = 1;
                    System.out.println(current_count +" "+ previous_count);
                    
                }
                j++;
                previous_count = Math.max(previous_count, current_count);
            }
            j = i+1;

        }
        System.out.println(previous_count);
    }
}
