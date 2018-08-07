package Array;

public class OneMissingNum {
    public int getMissingNum(int[] arr,int N){
        int num = N;
        N = N -1;
        for(int i=0; i<arr.length; i++){
            num^= arr[i]^N--;
        }
        return num;
    }
}
