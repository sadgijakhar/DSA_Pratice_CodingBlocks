package lecture_3;

// Given a series of N Integers, check if it is possible to split sequence into two sequences -
// s1 to si and si to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.

// Input Format
// First line contains a single integer N denoting the number of elements int the series. 
// Next N lines contain a single integer each denoting the elements of the array S.

// Constraints
// 0 < N < 1000 Each number in sequence S is > 0 and < 1000000000

// Output Format
// Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.

// Sample Input
// 5 
// 1 
// 2 
// 3 
// 4 
// 5

// Sample Output
// true

// Explanation
// Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.


import java.util.Scanner;

public class Increasing_Decreasing {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      int i = sc.nextInt();
      boolean decreasing = false;
      int countD = 0;
      boolean increasing = false;
      int countI = 0;
      while(s > 1){
         int j = sc.nextInt();
         if(j < i){
            if(!decreasing){
               countD++;
            }
            // System.out.println(arr[i] + " Decreasing " + arr[i-1]);
            increasing = false;
            decreasing = true;
         }
         else{
            if(!increasing){
               countI++;
            }
            // System.out.println(arr[i] + " Increasing " + arr[i-1]);
            decreasing = false;
            increasing = true; 
         }
         i = j;
         s--;
      }

      System.out.println(countD +" "+ countI);
      if(countD == 0 && countI == 1){
         System.out.println(true);
      }
      else if(countD == 1 && countI == 1 ){
         System.out.println(true);
      }
      else{
         System.out.println(false);
      }
      sc.close();
   }
}