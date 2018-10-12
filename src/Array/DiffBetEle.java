package Array;

/*
Maximum difference between two elements in the array
such that larger element occurs after the smaller one.
 */
public class DiffBetEle {

    public int getMaxDiff(int a[]){
        int diff, maxdiff,indx=0;

        diff = a[indx];
        maxdiff = indx;

        for(int i=0; i<a.length-1; i++){
            if(a[i+1] > a[indx]){
                diff = a[i+1] - a[indx];
                if(diff > maxdiff){
                    maxdiff = diff;
                }
            }else{
                indx = i+1;
                i++;
            }
        }
        return maxdiff;
    }
}
