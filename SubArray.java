public class SubArray {

     // Subarray -> subset + Contiguous + Sequence

    public static void Maxsum(int [] arr,int n){
        for(int i = 0 ; i < n ; i++){
            int sum = 0 ;
            for(int j = i ; j < n ; j++){
                sum += arr[j];
                System.out.println(sum);

            }
        }
    }

    // Linear
    public static int Max1 (int[] arr ,int n){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int ali : arr){
            sum += ali;
            
            if(sum > ans){
                ans = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
        }
        return ans ;
    }
   public static void main(String[] args) {
    int arr[] = {-1,-2,-3,-4,-5};
    int n = arr.length;
    // Maxsum(arr, n);
    System.out.println(Max1(arr, n));
    
    // for(int i = 0 ; i < n ; i++){
    //     for(int j = i ; j < n ;j++){
    //         // System.out.println(i+" "+arr[j]);
    //         int sum = 0;
    //         for(int s = i ; s <=j ;s++){
    //             System.out.print(arr[s]+" ");
    //             sum = sum+arr[s];
    //         }
    //         System.out.println(" => "+sum);
    //     }
    //     System.out.println();
        
    // }
   } 
    
}
