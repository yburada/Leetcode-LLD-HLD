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

        //Initializing
        int i=0,j=0,k=0,n1= arr1.length,n2=arr2.length;

        //Initializing a new Arrays with length of arr1+arr2
        int[] arr3 = new int[n1+n2];

        //Checking arr1[i]>arr2[j] if true keeping arr1[i] in arr3[k]  and incrementing i++
        // else arr1[i]>arr2[j] if false keeping arr2[j] in arr3[k] and incrementing j++
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else
                arr3[k++] = arr2[j++];
        }

        //Inserting rest elements from arr1[i] to arr3[k]
        while (i<n1){
            arr3[k++] = arr1[i++];
        }

        //Inserting rest elements from arr2[j] to arr3[k]
        while (j<n2){
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
