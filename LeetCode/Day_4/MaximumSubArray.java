package LeetCode.Day_4;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr ={5,4,-1,7,8};
        //Initializing the values giving max as first element to cover the edge case
        int currentArraySum =0,max = arr[0];

        for(int i=0;i<arr.length;i++){
            //1. First checking the element is less than 0 so making current array sum as 0. This means us to shifting the array
            if(currentArraySum<0){
                currentArraySum=0;
            }
            //2. Adding the elements means shifting the current length of array
            currentArraySum += arr[i];
            //find max between them and storing the element
            max = Math.max(currentArraySum,max);
        }

        System.out.println(max);
    }
}
