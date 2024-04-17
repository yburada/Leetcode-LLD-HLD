package LeetCode.Day_2;

public class DistinctElements {

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,2,1};
        final int length = arr.length;
        // Checking the arr length is 1
        if (length == 1) {
            System.out.println("false");
            return;
        }
        // Checking if it is 2 comparing and retuning the result
        if (length == 2) {
            System.out.println(arr[0] == arr[1]);
            return;
        }

        // taking for loop for second element of array and taking current element and previous element
        // checking if current element is less than previous element running while loop
        for (int i = 1; i < length; i++) {
            int current = arr[i];
            int j = i - 1;
            int prevVal = arr[j];

            //While loop iterating from backwards and replacing the elements using temp variable;
            while (current<prevVal){
                arr[i] = prevVal;
                arr[j] = current;
                 if(j-- ==0){
                     break;
                 }
                 current = arr[--i];
                 prevVal = arr[j];
            }

            // Finally the array would be sorted array If we have similar elements they will be closer, we can check current value with previous value and return the result.
            if (j > -1 && current == prevVal) {
                System.out.println("True");
                return;           
            }
        }
        System.out.println("False");

    }
}
