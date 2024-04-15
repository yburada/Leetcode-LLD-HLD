package Day_3;

import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        /*int multi = 1,n = nums.length, zerosCount =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
                multi*=nums[i];
            else
                zerosCount++;

        }
        if(zerosCount>1){
            Arrays.fill(nums,0);
            System.out.println(Arrays.toString(nums));
            return;
        } else if (zerosCount ==1) {
            for (int j=0;j<n;j++){
                if(nums[j]==0)
                    nums[j] = multi;
                else
                    nums[j] =0;
            }
            System.out.println(Arrays.toString(nums));
            return;
        }
        else {
            for(int k=0;k<n;k++){
                nums[k]= multi/nums[k];
            }
            System.out.println(Arrays.toString(nums));
            return;
        }*/

        int n = nums.length;
        int[] res = new int[n];
        int prefix=1,postfix=1;
        for(int i=0;i<n;i++){
            res[i] = prefix;
            prefix = nums[i]*prefix;


        }

        for(int i=n-1;i>=0;i--){
            res[i] = res[i] * postfix;
            postfix = postfix * nums[i];
        }
        System.out.println(Arrays.toString(res));

    }
}
