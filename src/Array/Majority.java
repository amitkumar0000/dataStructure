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
    
    /*
    The algorithm for first phase that works in O(n) is known as Moore’s Voting Algorithm.
    Basic idea of the algorithm is that 
    if we cancel out each occurrence of an element e with all the other elements 
    that are different from e 
    then e will exist till end if it is a majority element.
    */

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
