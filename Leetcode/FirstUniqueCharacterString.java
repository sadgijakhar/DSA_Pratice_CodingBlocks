package Leetcode;

import java.util.HashMap;
// import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueCharacterString {
   public static void main(String[] args) {
        String str = "loveleetcode";
    //     char [] arr = new char[str.length()];
    //     for(int i = 0 ; i < str.length() ;i++){
    //         arr[i] = str.charAt(i);
    //     }
    //     int i = 0;
    //     int j = 1 ;
    //     int n = str.length();
    //     boolean check = true;
    //     while(i < n && j < n){
    //         if(i == j){
    //         j++;
    //     }
    //     else if(arr[i] != arr[j]){
    //         j++;
    //         check = false;
    //     }
    //     else{
    //         check = true;
    //     }
            
    //     if(check){
                
    //         i = i+1;
    //         j = 0;
                
    //     }
    //         // System.out.println(i+" "+ j+" "+check);
    //     if(j == n){
    //         if(!check){
    //             // return i;
    //             System.out.println(i);
    //         }
    //         i = i+1;
    //         j=i+1;
    //     }
    // }
    //     // return -1;
    //     System.out.println(-1);

        int j = firstUniqChar(str);
        System.out.println(j);
   } 

    public static int firstUniqChar(String str) {
        HashMap<Character, Integer> arr = new HashMap<>();
        int i = 0;
        while(i<str.length()){
            char c = str.charAt(i);
            if(arr.containsKey(c)){
                int val = arr.get(c);
                arr.put(c, val+1);
            }
            else{
                arr.put(c,1);
            }
            i++;
        }
        for (Entry<Character, Integer> entry : arr.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        for(int j = 0 ; j < str.length() ;j++){
            if(arr.get(str.charAt(j)) == 1){
                return j;
            }
        }
        
        return -1;
    }
}
