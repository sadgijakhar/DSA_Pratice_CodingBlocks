package Leetcode;

public class  Trapping_RainWater {
   public static void main(String[] args) {
    int arr[] = {0,1,5,3,0,2,4,2};
    // int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
    int n = arr.length;

    int i = 1 ; 
    int j = n-2;
    int Lheight = arr[0];
    int Rhight = arr[n-1];
    int t = 0;
    int count = 0;
    while(i < j){
        if(t == 0 && arr[i]  >= Lheight){
            Lheight = arr[i];
            System.out.println(count+ " . "+Lheight+"  "+arr[i]+" " +Rhight);
            i++;
            t = 1;
        }
        if(t == 1 && arr[j] >= Rhight){
            Rhight = arr[j];
            System.out.println(count+ " . "+Lheight+"  "+arr[i]+" "+arr[j]+" " +Rhight);
            j--;
            t = 2;
        }
        if(arr[i] < Lheight && arr[i] < Rhight){
            count += Math.min(Lheight,Rhight) - arr[i]; 
            System.out.println(count+ " . "+Lheight+"  "+arr[i]+" " +Rhight);
            i++;
        }
        else if(arr[j] < Lheight && arr[j] < Rhight){
            count += Math.min(Lheight,Rhight) - arr[j];  
            
            System.out.println(count+ " . "+Lheight+"  "+arr[i]+" " +Rhight);
            j--;
        }
        else{
            t = 0;
        }
        
    }
    System.out.println(count);
   } 
}
