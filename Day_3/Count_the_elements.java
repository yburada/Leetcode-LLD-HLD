package Day_3;

import java.util.Arrays;

public class Count_the_elements {

    public static void main(String[] args) {

        int n = 3;
        int a[] = {4,1,2};
        int b[] = {1,7,3};
        int q = 2;
        int query[] = {0,1};

        int[] ints = countElements(a, b, n, query, q);
        // Time complexity O(n+q)

        System.out.println(Arrays.toString(ints));

    }

    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {

        int[] ans = new int[q];
        for(int i=0;i<q;i++){
            int element = a[query[i]],count=0;
            for(int j=0;j<n;j++){
                if(element>=b[j]){
                    count++;
                }
            }
           ans[i] = count;
        }
        return ans;
    }
}
