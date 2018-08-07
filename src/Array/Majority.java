package Array;

import java.util.Arrays;

public class Majority {

    public boolean isMajority(int[] arr, int x){
        int k = -1;
        if(arr[arr.length/2] == x){
            int[] temp = new int[(arr.length/2)];

            System.arraycopy(arr,0,temp,0,(arr.length/2));

            k = Arrays.binarySearch(temp,x);
        }

        if(k < 0 )
            return false;
        else if(arr[k+(arr.length/2)] == x)
            return true;
        else
            return false;
    }
}
