// import java.util.Arrays;
public class RotateArray {
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int rotation = 2;
    if(rotation > arr.length){
        rotation = rotation % arr.length;
    }

    for(int i = 0 ; i < 5/2 ;i++){
        int temp = arr[i];
        arr[i] = arr[5-i-1];
        arr[5-i-1] = temp;
    }
    for(int i = 0 ; i < rotation/2; i++){
        if(i < rotation/2){
            int temp = arr[i];
            arr[i] = arr[rotation-1-i];
            arr[rotation-1-i] = temp;
        }
        int temp = arr[rotation+i];
        arr[rotation+i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
    }
    // System.out.println(Arrays.toString(arr));

   } 
}
