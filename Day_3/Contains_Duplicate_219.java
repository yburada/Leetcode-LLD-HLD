package Day_3;

import java.util.Map;
import java.util.LinkedHashMap;

public class Contains_Duplicate_219 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int k =1, n = arr.length;
        Map<Integer,Integer> set = new LinkedHashMap<>();

        for (int i=0;i<n;i++){
            if(set.containsKey(arr[i])){
                    if(Math.abs(i-set.get(arr[i]))<=k){
                        System.out.println("True");
                        return;
                    }
                set.put(arr[i],i);
            }
            else{
                set.put(arr[i],i);
            }
        }
        System.out.println("False");
    }


}
