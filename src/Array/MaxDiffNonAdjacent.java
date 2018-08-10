package Array;

public class MaxDiffNonAdjacent {

    /*
    a[]  2  3    15
    ----------------
    inc  2  3+0  15+2
    exc  0  2    3
     */
    public int getMaxSumNonAdj(int a[]){
       int max = 0;
       int inc = a[0];
       int exc = 0;
       for(int i=1; i<a.length; i++){
           max = Math.max(inc,exc);
           inc = a[i] + exc;
           exc = max;
       }
       return Math.max(inc,exc);
    }
}
