package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        // int arr[][] = {{1,4},{4,5}};
        // int arr[][] = {{1,3}};
        // int arr[][] = {{1,4},{5,6}};
        Arrays.sort(arr, (o1,o2)->o1[0]-o2[0]);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
        
        int i = 1;
        int start = arr[0][0];
        int end = arr[0][1];
        while(i < n){
            int s = arr[i][0];
            int e = arr[i][1];

            if(s <= end){
                end = Math.max(e, end);
                // arr2.add(i-1, new ArrayList<Integer> (Arrays.asList(Math.min(start,s),end)) );
                // System.out.println(Math.min(start, s));
                // System.out.println(arr2);

            }
            else{
                arr2.add(new ArrayList<Integer>(Arrays.asList(start, end)));
                start = s;
                end = e;
            }
            // start = s;
            // end = e;
            i++;
        }
        arr2.add(new ArrayList<Integer>(Arrays.asList(start, end)));
        n = arr2.size();

        int[][] resultArray = new int[n][2];


        for (int k = 0; k < n; k++) {
            for (int j = 0; j < 2; j++) {
                resultArray[k][j] = arr2.get(k).get(j);
            }
        }

        // // Print the result
        System.out.println(Arrays.deepToString(resultArray));

    }
}
