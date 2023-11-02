package D_Array;

public class intro {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int num = 1;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j< arr[0].length ; j++){
                arr[i][j] = 10*(i+1)+(num);
                num++;
            }
            num =1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            
            if(i%2  == 0 ){
                for(int j = 0; j< arr[0].length ; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j = arr[0].length -1  ; j >= 0; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            
            // System.out.println();
        }

    }
}
