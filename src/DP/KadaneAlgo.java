package DP;

public class KadaneAlgo {
     /*
    Dynamic Programming approach (KADANE’s algorithm)
     */

    public int getLagestSumContNumberDP(int a[]){
        if(a!=null && a.length==0){
            return Integer.MIN_VALUE;
        }
        int maxtillnow = a[0];
        int maxSum = a[0];

        for(int i=1; i< a.length; i++){
            maxtillnow = max(a[i], maxtillnow+a[i]);
            if(maxtillnow > maxSum){
                maxSum = maxtillnow;
            }
        }
        return maxSum;
    }

    int max(int a, int b){
        return a>b?a:b;
    }
}
