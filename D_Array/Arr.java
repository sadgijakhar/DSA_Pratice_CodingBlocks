package D_Array;

public class Arr {
   public static void main(String[] args) {
        int[][] arr =  {{11,12,13,14,15},
                        {21,22,23,24,25},
                        {31,32,33,34,35},
                        {41,42,43,44,45},
                        {51,52,53,54,55}};;
        int minrow = 0;
        int maxCol = arr[0].length-1;
        int minCol = 0;
        int maxRow = arr.length-1;
        int tt = arr.length * arr[0].length;
        int cnt = 0;
        while(minrow <= maxRow && minCol <= maxCol){
            for(int j = minrow ; j <= maxRow && cnt < tt; j++){
                System.out.print(arr[j][minCol]+" "); // else if(j == 0 || i ==)
                cnt++;
            }

            for(int j = minCol+1 ; j <= maxCol && cnt < tt; j++){
                System.out.print(arr[maxRow][j]+" ");
                cnt++; // else if(j == 0 || i ==)
            }

            for(int j = maxRow-1 ; j >= minrow && cnt < tt; j--){
                System.out.print(arr[j][maxRow]+" "); 
                cnt++;// else if(j == 0 || i ==)
            }
            for(int j = maxCol -1  ; j >= minCol+1&& cnt < tt ; j--){
                System.out.print(arr[maxRow][j]+" "); 
                cnt++;// else if(j == 0 || i ==)
            }
            minrow++;
            minCol++;
            maxCol--;
            maxRow--;
        }
   } 
}
