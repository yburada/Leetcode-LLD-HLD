package Day_2;

import java.util.Arrays;

public class DistinctElements {

    public static void main(String[] args) {
        int[] nums = {1,4,3,5,6,2};
        final int length = nums.length;
        if (length == 1) {
            System.out.println("false");
            return;
        }
        if (length == 2) {
            System.out.println(nums[0] == nums[1]);
            return;
        }

        for (int i = 1; i < length; i++) {
            int current = nums[i];
            int j = i - 1;
            int prevVal = nums[j];
            while (current<prevVal){
                nums[i] = prevVal;
                nums[j] = current;
                 if(j-- ==0){
                     break;
                 }
                 current = nums[--i];
                 prevVal = nums[j];
            }

            if (j > -1 && current == prevVal) {
                System.out.println("True");
                return;           
            }
        }
        System.out.println("False");

    }
}
