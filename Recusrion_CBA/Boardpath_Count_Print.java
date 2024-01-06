package Recusrion_CBA;
import java.util.ArrayList;
import java.util.Scanner;

public class Boardpath_Count_Print {


    // Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). 
    // Take as input M, a number. M is the number of faces of the dice.

    // a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. 
    // Print the value returned.

    // b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function)
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] samplecase = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> arr = new ArrayList<>();
        int count[] = {0};
        recur(N, M, arr, 0, samplecase,count);
        System.out.println();
        System.out.println(count[0]);
        sc.close();
    }

    static int recur(int N, int M, ArrayList<Integer> arr, int currSum, int[] samplecase, int count[]) {
        if (currSum == N) {
            count[0] = count[0]+1;
            for(int i : arr){
                System.out.print(i);
            }
            System.out.print(" ");
            return count[0];
        }

        if (currSum > N) {
            return count[0];
        }

        for (int i = 0; i < M; i++) {
            arr.add(samplecase[i]);
            recur(N, M, arr, currSum + samplecase[i], samplecase,count);
            arr.remove(arr.size() - 1);
        }
        return count[0];
    }
}
