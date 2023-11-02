package D_Array;

public class Sortedarray {
   public static void main(String[] args) {
    int arr[][] =  {{10,20,30,40},
                    {15,25,35,45},
                    {27,28,37,48},
                    {29,33,39,50}};


    int  j = arr[0].length-1;
    int i = 0;
    int count = 0;
    while(j >= 0 && i < arr.length){
        if(arr[i][j] == 22){
            System.out.println(" True ");
            count++;
            break;
        }
        else if(arr[i][j] > 22){
            j--;
        }
        else{
            i++;
        }
    }
    if(count != 1){
        System.out.println(" False ");
    }
   } 
}
