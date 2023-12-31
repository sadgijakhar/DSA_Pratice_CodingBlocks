package Recusrion_CBA;

import java.util.Scanner;

public class RecursionObedientString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        char c = str.charAt(i);
        int length = str.length();
        i++;
        if(c == 'a'){
            System.out.println(ObedientString(c, str , i ,length));
        }
        else{
            System.out.println("false");
        }
        
        sc.close();
    }

    static boolean ObedientString(char c,String str, int i, int length){
        if(i < length){
            char ch = str.charAt(i);
            i++;
            if(ch == 'a'){
                return ObedientString(ch, str, i, length);
            }
            else if ( c == 'b' && ch == 'b'){
                System.out.println("hjfg");
                return false;
            }
            else if(ch == 'b'){
                if(i < length){
                    char c1 = str.charAt(i);
                    i++;
                    if(c1 != 'b'){
                        return false;
                    }
                    return ObedientString(c1, str, i, length);
                }
                else{
                    return false;
                }
            }

        }
        return true;
        
    }
}
