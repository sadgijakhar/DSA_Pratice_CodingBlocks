package Recusrion_CBA;

// import java.util.Scanner;


// public class RatInAMaze {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         String arr[][]= new String[n][m];
//         for(int i =0 ; i < n ;i++){
//             for(int j = 0 ;j < m ;j ++){
//                 arr[i][j] = sc.next();
//             }
//         }
//         int i = 0; 
//         int j = 0;
//         int arr1[][] = new int[n][m];        
//         // System.out.println(Arrays.deepToString(arr));
//         boolean flag = true;

//         // System.out.println;
//         recur(arr, n, m, i, j, arr1,flag);

//         sc.close();

//     }

//     static void recur(String[][] arr, int n, int m ,int i ,int j, int arr1[][],boolean flag){
//         if(i >= n){
//             for( int a = 0 ; a < n ;a++){
//                 for(int b = 0 ; b < m; b++){
//                     System.out.print(arr1[a][b]+" ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }
//         // System.out.println(Arrays.deepToString(arr));
//         if(arr[0][0] == "X"){
//             System.out.println(-1);
//             return;
//         }
//         else{
//             arr1[0][0] = 1;
//         }

//         // System.out.println(i+ " . " + j);
//         // System.out.println(arr[i][j]);
//         if(j+1 < m && !arr[i][j+1].equals("X") &&  flag){
//             // System.out.println("ckedkhcnrkcm");
//             arr1[i][j] = 1;
//             // System.out.println(Arrays.deepToString(arr1));
//             recur(arr, n, m, i, j+1, arr1,flag);
//         }
//         else if ( i+1 < n && !arr[i+1][j].equals("X")){
//             arr1[i][j] = 1;
//             // System.out.println(Arrays.deepToString(arr1));
//             flag = true;
//             recur(arr, n, m, i+1, j, arr1,flag);
//         }
//         else if( j+1 < m && arr[i][j+1].equals("X") && arr[i+1][j].equals("X")  && j > 1 ){
//             flag = false;
//             recur(arr, n, m, i, j-1, arr1,flag);
//         }
//         if( j == m-1 && i < n-1){
//             i = i+1;
//             // System.out.println(i+" .  "+j);
            
//         if ( i< n && !arr[i][j].equals("X")){
//             arr1[i][j] = 1;
//             // System.out.println(Arrays.deepToString(arr1));
//             flag = true;
//             recur(arr, n, m, i+1, j, arr1,flag);
//         }
//         else if( i+1 < n && arr[i][j].equals("X") && arr[i+1][j].equals("X")  && j > 1 ){
//             flag = false;
//             recur(arr, n, m, i, j-1, arr1,flag);
//         }

//         }

//     }
// }

// import java.util.Scanner;

// public class RatInAMaze {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         String arr[][] = new String[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.next();
//             }
//         }
//         int i = 0;
//         int j = 0;
//         int arr1[][] = new int[n][m];
//         boolean flag = true;

//         if (!recur(arr, n, m, i, j, arr1, flag)) {
//             System.out.println(-1);
//         }

//         sc.close();
//     }

//     static boolean recur(String[][] arr, int n, int m, int i, int j, int arr1[][], boolean flag) {
//         if (i >= n || j >= m || i < 0 || j < 0) {
//             return false;
//         }

//         if (arr[i][j].equals("X")) {
//             return false;
//         }

//         arr1[i][j] = 1;

//         if (i == n - 1 && j == m - 1) {
//             for (int a = 0; a < n; a++) {
//                 for (int b = 0; b < m; b++) {
//                     System.out.print(arr1[a][b] + " ");
//                 }
//                 System.out.println();
//             }
//             return true;
//         }

//         if (j + 1 < m && arr1[i][j + 1] == 0 && flag) {
//             if (recur(arr, n, m, i, j + 1, arr1, flag)) {
//                 return true;
//             }
//         }

//         if (i + 1 < n && arr1[i + 1][j] == 0) {
//             if (recur(arr, n, m, i + 1, j, arr1, flag)) {
//                 return true;
//             }
//         }

//         if (j - 1 >= 0 && arr1[i][j - 1] == 0 && flag) {
//             if (recur(arr, n, m, i, j - 1, arr1, flag)) {
//                 return true;
//             }
//         }

//         if (i - 1 >= 0 && arr1[i - 1][j] == 0) {
//             if (recur(arr, n, m, i - 1, j, arr1, flag)) {
//                 return true;
//             }
//         }

//         arr1[i][j] = 0; // Backtrack
//         return false;
//     }
// }

import java.util.Scanner;

public class RatInAMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char arr[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int i = 0;
        int j = 0;
        int arr1[][] = new int[n][m];
        boolean flag = true;

        if (!recur(arr, n, m, i, j, arr1, flag)) {
            System.out.println(-1);
        }

        sc.close();
    }

    static boolean recur(char[][] arr, int n, int m, int i, int j, int arr1[][], boolean flag) {
        if (i >= n || j >= m || i < 0 || j < 0) {
            return false;
        }

        if (arr[i][j] == 'X') {
            return false;
        }

        arr1[i][j] = 1;

        if (i == n - 1 && j == m - 1) {
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    System.out.print(arr1[a][b] + " ");
                }
                System.out.println();
            }
            return true;
        }

        if (j + 1 < m && arr1[i][j + 1] == 0 && flag) {
            if (recur(arr, n, m, i, j + 1, arr1, flag)) {
                return true;
            }
        }

        if (i + 1 < n && arr1[i + 1][j] == 0) {
            if (recur(arr, n, m, i + 1, j, arr1, flag)) {
                return true;
            }
        }

        if (j - 1 >= 0 && arr1[i][j - 1] == 0 && flag) {
            if (recur(arr, n, m, i, j - 1, arr1, flag)) {
                return true;
            }
        }

        if (i - 1 >= 0 && arr1[i - 1][j] == 0) {
            if (recur(arr, n, m, i - 1, j, arr1, flag)) {
                return true;
            }
        }

        arr1[i][j] = 0; // Backtrack
        return false;
    }
}
