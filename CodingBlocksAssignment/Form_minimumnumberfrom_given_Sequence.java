package CodingBlocksAssignment;

// import java.util.Arrays;
import java.util.Scanner;

public class Form_minimumnumberfrom_given_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.next();
        }

        for(int i = 0 ; i < n ;i++){
            int l = arr[i].length();
            // System.out.println(l);
            int arr1[] = new int[l+1];
            arr1[0] = 1;
            int num = 2;
            int j = 1;
            int t = 0 ;
            while(l > t){
                char c = arr[i].charAt(t);
                if(c == 'I'){
                    // System.out.println(j+" ---- -- > "+num+"------->"+t);
                    arr1[j] = num; 
                    num++;
                    t++;
                    j++;
                    // System.out.println(arr1[j]);
                }
                else if(c == 'D'){
                    int count = 0;
                    while(l > t && arr[i].charAt(t) == 'D'){
                        count++;
                        t++;
                    }
                    int check = 0;
                    if(count ==1){
                        check = j+count;
                    }
                    else{
                        check = j+count;
                    }
                    
                    num += count-1;
                    // System.out.println(check+"------>"+count+"------->"+num+"------>"+j);

                    for (int k = j - 1; k < check; k++) {
                        arr1[k] = num;
                        // System.out.println(arr1[k]);
                        num--;
                    }
                    // System.out.println("yepppppp");
                    j = j + count;
                    // System.out.println(num);
                    num = j+1;
                    // System.out.println(num);
                        
                }

                // System.out.println(l+"-------->"+t);
            }
            
            for(int k = 0 ; k < arr1.length ; k++){
                System.out.print(arr1[k]);
            }
            
            System.out.println();
        }
        // System.out.println(Arrays.toString(arr));


        
        sc.close();
    }


}
