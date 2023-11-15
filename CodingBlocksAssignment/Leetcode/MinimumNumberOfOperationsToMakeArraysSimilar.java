package CodingBlocksAssignment.Leetcode;

import java.util.*;

public class MinimumNumberOfOperationsToMakeArraysSimilar {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5};
        int[] target = {4, 1, 3};
        ArrayList<Integer> evenArr1 = new ArrayList<>(nums.length);
        ArrayList<Integer> oddArr1 = new ArrayList<>(nums.length);
        ArrayList<Integer> evenArr2 = new ArrayList<>(nums.length);
        ArrayList<Integer> oddArr2 = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArr1.add(nums[i]);
            } else {
                oddArr1.add(nums[i]);
            }
            if (target[i] % 2 == 0) {
                evenArr2.add(target[i]);
            } else {
                oddArr2.add(target[i]);
            }
        }

        Collections.sort(evenArr1);
        Collections.sort(oddArr1);
        Collections.sort(evenArr2);
        Collections.sort(oddArr2);
        int diff =0;
        int operation =0;
        for(int i = 0 ;  i <  oddArr1.size() ;i++){
            diff += oddArr1.get(i)-oddArr2.get(i);
            if (oddArr1.get(i) > oddArr2.get(i)) {
                operation += (oddArr1.get(i)-oddArr2.get(i))/2;
            } 

        }
        for(int i = 0 ;  i <  evenArr1.size() ;i++){
            diff += evenArr1.get(i)-evenArr2.get(i);
            if (evenArr1.get(i) > evenArr2.get(i)) {
                operation += (evenArr1.get(i)-evenArr2.get(i))/2;
            } 
        }
        if(diff == 0){
           System.out.println(operation) ;
        }
        else{
           System.out.println(-1);
        }
        
    }
}
