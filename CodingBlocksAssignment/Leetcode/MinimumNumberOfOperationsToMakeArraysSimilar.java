package CodingBlocksAssignment.Leetcode;

import java.util.*;

public class MinimumNumberOfOperationsToMakeArraysSimilar {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5};
        int[] target = {4, 1, 3};
        ArrayList<Integer> evenArr1 = new ArrayList<>();
        ArrayList<Integer> oddArr1 = new ArrayList<>();
        ArrayList<Integer> evenArr2 = new ArrayList<>();
        ArrayList<Integer> oddArr2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
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
        int sum1 = 0;
        for (int num : nums) {
            sum1 += num;
        }
        int sum2 = 0 ;
        for (int num : target) {
            sum2 += num;
        }
        int count1 = 0;
        int count2 = 0;
        if(sum1 == sum2){
            int n = evenArr1.size();

            for (int i = 0; i < n; i++) {
                while (evenArr1.get(i) != evenArr2.get(i)) {
                    if (evenArr1.get(i) < evenArr2.get(i)) {
                        count2++;
                        evenArr1.set(i, evenArr1.get(i) + 2);
                    } else {
                        count1++;
                        evenArr1.set(i, evenArr1.get(i) - 2);
                    }
                }
            }
            int n1 = oddArr1.size();

            for (int i = 0; i < n1; i++) {
                while (oddArr1.get(i) != oddArr2.get(i)) {
                    if (oddArr1.get(i) < oddArr2.get(i)) {
                        count2++;
                        oddArr1.set(i, oddArr1.get(i) + 2);
                    } else {
                        count1++;
                        oddArr1.set(i, oddArr1.get(i) - 2);
                    }
                }
            }
        }
        else{
            System.out.println(-1);
            return;
        }
        

        if (count1 == count2) {
            System.out.println(count1);
        }
        else{
            System.out.println(0);
        }
    }
}
