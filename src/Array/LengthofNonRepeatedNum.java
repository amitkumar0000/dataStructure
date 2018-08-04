package Array;

public class LengthofNonRepeatedNum {


    public int getLengthOfNonRepeatedNum(int[] a){
        int start = 0;
        int end = 0;
        int length = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1] > a[i]){
                end = i+1;
            }else{
                if((end-start+1) > length){
                    length = end - start + 1;
                }
                start = i+1;
                end = i+1;
            }
        }
        if((end-start+1) > length){
            length = end - start + 1;
        }
        return length;
    }
}
