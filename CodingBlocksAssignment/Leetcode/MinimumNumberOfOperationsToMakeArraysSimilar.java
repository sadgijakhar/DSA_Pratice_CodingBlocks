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

    // Optimise using 2 extra Arraylist
    public long makeSimilar1(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        int len = nums.length, i, p = 0, j = 0, k = 0;
        long sum1 = 0, sum2 = 0;
        List<Integer> odd1 = new ArrayList<>();
        List<Integer> even1 = new ArrayList<>();
        for(i = 0; i < len; i++){
            if(nums[i] % 2 == 0)
                even1.add(nums[i]);
            else
                odd1.add(nums[i]);
        }
        for(i = 0; i < len; i++){
            if(target[i] % 2 == 0){
                sum1 += (long)Math.abs(even1.get(j) - target[i]);
                j++;
            }
            else{
                sum2 += (long)Math.abs(odd1.get(k) - target[i]);
                k++;
            }
        }
        sum1 /= 2;
        sum2 /= 2;
        return (sum1 + sum2) / 2;
    }

    // More optimise code using 2 extra array
    public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);

        int odd = 0, even = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) even++;

        odd = nums.length - even;
        int[] oddNums = new int[odd];
        int[] evenNums = new int[even];
        int countEven = 0;
        int countOdd = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) evenNums[countEven++] = nums[i];
            else oddNums[countOdd++] = nums[i];
        }

        long sum1 = 0;
        long sum2 = 0;
        int  j = 0, k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(target[i] % 2 == 0){
                sum1 += (long)Math.abs(evenNums[j] - target[i]);
                j++;
            }
            else{
                sum2 += (long)Math.abs(oddNums[k] - target[i]);
                k++;
            }
        }
        sum1 /= 2;
        sum2 /= 2;
        return (sum1 + sum2) / 2;
    }

}
