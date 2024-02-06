package Leetcode;

import java.util.List;
import java.util.ArrayList;

public class SequentialDigits {

    // Brute Force

    public static List<Integer> sequentialDigits(int low, int high) {

        List<Integer> arr = new ArrayList<>();
        String str = Integer.toString(low);
        int i = Integer.parseInt(str.substring(0,1));
        int length = str.length();
        int a = 0;
        int t = 0;
        while(a < high){
            int j = length-1 + t;
            int k = i;
            a = 0;
            while(j >= 0){
                if(k > 9){
                    t++;
                    i = 0;
                    a = 0;
                    break;
                }
                a += k * Math.pow(10,j);
                j--;
                k++;
            }
            i++;
            // System.out.println(i);

            if(a > low && a < high){
                arr.add(a);
            }
        }

        return arr;
    }
    //  Optimized Solution

    static List<Integer> sequentialDigits1(int low, int high) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    a.add(num);
                }
                ++nextDigit;
            }
        }

        a.sort(null);
        return a;
    }
    
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> arr = new ArrayList<>();
        arr = sequentialDigits(low, high);
        System.out.println(arr);

        arr = sequentialDigits1(low, high);
        System.out.println(arr);
    }

}
