package Leetcode;

public class DistantBarcodes {
   public static void main(String[] args) {
    int arr[] = {1,1,1,2,2,2};
    rearrangeBarcodes(arr);
   } 
   static int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        int i  = 1 , j = 1;
        while(i < n && j < n){
            if(barcodes[j] == barcodes[j-1]){
                // int temp = barcodes[j];
                // barcodes[j] = barcodes
            }
        }
        return barcodes;
   }
}
