package CodingBlocksAssignment.Leetcode;

public class MinimumOperationsToMakeArrayEqual {
//    int arr[] = {1,3,5};
//    int l = arr.length;
   public static void main(String[] args) {
    int n = 6; 
    int [] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = (2 * i) + 1;
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    int i = 0;
    int j = arr.length-1;
    int count= 0;
    int mid = (i+j)/2;
    int mid1 = 0;
    if(n%2==0){
        mid1 = mid+1;
        while(arr[mid1] != arr[mid]){
            arr[mid]+=1;
            arr[mid1]-=1;
            count++;
        }
        
    }
    
    while(j-i>1){
        if(arr[i] != arr[mid] && arr[j]!= arr[mid]){
            count++;
            arr[i] += 1;
            arr[j] -= 1;  
            System.out.println(arr[i]+"------->"+arr[mid]+"------->"+arr[j]);
        }
        else{
            i++;
            j--;
        }
    }
    
    System.out.println(count);
   }
   //optimise code then above
   public int minOperations(int n) {
        int ans = 0;
        for(int i = 0 ; i < n/2; i++){
            ans += n - ((2 * i) + 1);
        }
        return ans;
    }

   //optimise code then above
   public int minOperations1(int n) {
        int num = n / 2;
        if (n % 2 == 0) {
            return (num * (2 * 1 + (num - 1) * 2)) / 2;
        } else {
            return (num * (2 * 2 + (num - 1) * 2)) / 2;
        }
    }

    //optimise code same as above
    public int minOperations2(int n) {
        int result = 0;
        
        if (n % 2 == 0) {
            result = (n / 2) * (n / 2);
        } else {
            result = ((n - 1) / 2) * ((n + 1) / 2);
        }
        
        return result;
    }
}
