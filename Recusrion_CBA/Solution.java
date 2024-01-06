package Recusrion_CBA;

public class Solution {
    static int distinctSubsequences(String S) {
        // code here
        // String V = "";
        int n = S.length();
        StringBuilder str = new StringBuilder();
        int i = 0;
        int count[] = {0};
        recur(i,S, str, n,count);
        System.out.println(str);
        return count[0];
        
    }
    static int recur(int i ,String s, StringBuilder V, int n,int count[] ){
        if(i >= n){
            System.out.println(V +" " + count[0]);
            count[0] = count[0]+1;
            return count[0];
        }
        char c = s.charAt(i);
        // System.out.println("char ==="+c);
        V.append(c);
        // System.out.println("Add === " + V);/
        recur(i+1, s, V, n,count);
        V.deleteCharAt(V.length() - 1);
        // System.out.println("Delete = " +V);
        recur(i+1, s, V, n,count);
        return count[0];
    }
    public static void main(String[] args) {
        String str = "ggg";
        System.out.println(distinctSubsequences(str));
    }
}