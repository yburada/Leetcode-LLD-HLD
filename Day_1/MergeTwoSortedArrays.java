package Day_1;

import java.util.Arrays;
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {1,11 , 13, 14};

        int arr2[] = {2, 5,10, 12};


        int arr3[] = mergeArrays(arr1, arr2);


        System.out.println("Array after merging - " + Arrays.toString(arr3));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i=0,j=0,k=0,n1= arr1.length,n2=arr2.length;
        int[] arr3 = new int[n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else
                arr3[k++] = arr2[j++];
        }

        while (i<n1){
            arr3[k++] = arr1[i++];
        }

        while (j<n2){
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
