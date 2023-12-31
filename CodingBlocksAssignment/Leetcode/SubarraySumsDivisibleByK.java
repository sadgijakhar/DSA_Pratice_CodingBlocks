package CodingBlocksAssignment.Leetcode;

public class SubarraySumsDivisibleByK {
   public static void main(String[] args) {
    int arr[] = {4,5,0,-2,-3,1};
    int k = 5;
    int count = 0;

    for(int i = 0 ; i < arr.length ; i++){
        int sum = 0;
        for(int j = i ; j < arr.length ; j++){
            sum += arr[j];
            if(sum%k == 0){
                count++;
            }
            // System.out.println(arr[j]+" "+sum+" "+count);
        }
    }
    System.out.println(count);
   } 
}
