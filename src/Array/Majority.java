package Array;

import java.util.Arrays;

public class Majority {

    public boolean isMajorityInSortedArray(int[] arr, int x){
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

    public int getMajorityEleInUnSortedArray(int[] a){
        int count = 1;
        int indx = 0;
        for(int i = 1; i<a.length; i++){
            if(a[indx] == a[i])
                count++;
            else
                count--;
            if(count == 0){
                count = 1;
                indx = i;
            }
        }

        count = 0;
        for(int i = 0; i< a.length; i++){
            if(a[indx] ==  a[i]){
                count++;
            }
        }

        if(count > a.length/2){
            return a[indx];
        }else
            return -1;
    }
}
