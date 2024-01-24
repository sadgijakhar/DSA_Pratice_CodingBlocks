package Recusrion_CBA;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessboardProblem_CountPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        String s = "{0-0}";
        recur(n, 0, 0, arr, s);
        System.out.println("Total paths: " + arr.size());
        for (String path : arr) {
            System.out.println(path);
        }
        sc.close();
    }

    static void recur(int n, int i, int j, ArrayList<String> arr, String s) {
        if (i > n || j > n) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            arr.add(s);
            return;
        }

        recur(n, i + 2, j + 1, arr, s + "K{" + (i + 2) + "-" + (j + 1) + "}");
        recur(n, i + 1, j + 2, arr, s + "K{" + (i + 1) + "-" + (j + 2) + "}");

        recur(n, i, j + 1, arr, s + "R{" + i + "-" + (j + 1) + "}");
        recur(n, i, j + 2, arr, s + "R{" + i + "-" + (j + 2) + "}");
        recur(n, i + 1, j, arr, s + "R{" + (i + 1) + "-" + j + "}");
        recur(n, i + 2, j, arr, s + "R{" + (i + 2) + "-" + j + "}");

        // Corrected bishop moves
        for (int k = 1; i + k < n && j + k < n; k++) {
            recur(n, i + k, j + k, arr, s + "B{" + (i + k) + "-" + (j + k) + "}");
        }
    }
}
