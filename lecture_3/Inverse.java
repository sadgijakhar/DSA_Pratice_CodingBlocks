package lecture_3;
import java.util.Arrays;
import java.util.Scanner;
public class Inverse {

  public static int len(int n){
    String a = Integer.toString(n);
    int length = a.length();
    return length;
  }

//   static int[] invert(int arr[] , int n){
//     int i = n-1;
//     int j = 1;
//     int sw = 0;
//     while(i > -1 && arr[i] != i + 1){
//       if(arr[i] != j){
//         int l = 0;
//         for(int k = n-1 ; k > -1 ;k--){
//           if(arr[k] == j){
//             l++;
//             break;
//           }
//           l++;
//         }
//         if( l == arr[i - 1]){
//           i--;
//           j++;
//         }
//         else{
//           if(sw < 2){
//             int t = arr[i];
//             arr[i] = arr[n - l];
//             arr[n - l] = t;

//             System.out.println(Arrays.toString(arr));
//             sw++;
//           }
//           else{
//             i--;
//             j++;
//           }
//         }
//       }
//     }
//     return arr;

//   }
   
  static int[] invert(int[] arr, int n){
    int arr1[] = new int[n];
    int j = 1;
    int i = n-1;
    while( i > -1){
        
        if(arr[i] != j && arr[n-i] != arr[i]){
            System.out.println(arr[n-i]+"  "+arr[i]);

            arr1[n-i-1] = arr[i];
            arr1[i] = arr[n-i-1];
            System.out.println(Arrays.toString(arr1));
        }
        else{
            arr1[i] = arr[i];
            System.out.println("kjhwf "+Arrays.toString(arr1));
        }
        i--;
        j++;
        
    }
    return arr1;

  } 
   
   static int inverse(int digit){
        String num = Integer.toString(digit);
        int len = num.length();
        for(int i = len-1;i<=0;i--){
            int j = 1;
            if(num.charAt(j)!=Integer.toString(i).charAt(0)){
                
            }
        }
        return -1;
   }
   
   
   
   

  static int[] digit(int n, int c, int arr[]){
    int i =n-1;
    while(c!=0){
      int c1 = c%10;
      arr[i] = c1;
      c = c/10;
      i--;
    }
    return arr;
  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[len(n)]; // Initialize the variable `sw` to 0.
  System.out.println(Arrays.toString(digit(len(n),n,arr)));
  System.out.println(Arrays.toString(invert(arr,len(n))));

  sc.close();
  } 


}