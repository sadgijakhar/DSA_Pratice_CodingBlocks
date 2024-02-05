package Leetcode;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

        // int k = 2;
        // int arr[] = {1,1,1,0,0,0,1,1,1,1,0};

        int k = 3;
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};

        int n = arr.length;
        int i = 0;
        int j = 0;
        int t = 0;
        int fi1 = 0;
        int max1 = 0;
        while(i < n && j < n && t < n){
            if(arr[t] == 1){
                i++;
                if(j > 0 && j <= k){
                    max1 = i + j;
                    k = k-1;
                    j =0;
                    i = 0;
                }
                else if (j > 0 && j > k){
                    max1 = i+k;
                    if(t+1 < n && arr[t+1] == 1){
                        // i = i;
                    }
                    else{
                        i = 0;
                    }
                }
                else{
                    max1 += 1;
                }
                fi1 = Math.max(max1 , fi1);
                System.out.println(fi1);
            }
            else{
                j++;
                System.out.println();
            }
            t++;
        }
        System.out.println(fi1);
        
    }
    
}
