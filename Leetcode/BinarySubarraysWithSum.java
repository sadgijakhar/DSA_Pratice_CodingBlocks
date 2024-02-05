package Leetcode;

public class BinarySubarraysWithSum {
   public static void main(String[] args) {
    int [] nums = {1,0,1,0,1};
    int goal = 2;
    // int nums[] = {0,0,0,0,0};
    // int goal = 0;
    // int sum = 0;
    // Integer dp[][] = new Integer[nums.length][nums.length];
    // int count[] =  {0};
    
    recurr(nums, goal);


   }
   static void recurr(int arr[], int goal){
    int sum = 0;
    int count = 0;
    int j = 0;
    int k = 0;

    for(int i = 0; i < arr.length ; i++){ 
        sum += arr[i];
        
        while(sum > goal){
            sum -= arr[j];
            j++;
        }
        while(k < i && (k < j || arr[k] == 0 )){
            k++;
        }
        if(sum == goal){
            count += k-j+1;
        }
    }
    System.out.println(count);
   }

}
