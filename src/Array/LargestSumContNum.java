package Array;

public class LargestSumContNum {

    /*
    This will only work with result as positive number.
    If all input are negative, then this will not work
     */
    public int getLargestSumContNum(int a[]){
        int sum =0;
        int start,end,pos;
        int max_so_far = 0;
        start = end = pos = 0;

        for(int i=0; i< a.length; i++){
            sum += a[i];
            if(sum>max_so_far){
                max_so_far  = sum;
                start = pos;
                end = i;
            }

            if(sum<0){
                sum = 0;
                pos = i+1;
            }
        }
        System.out.println("ind1::" +start +" ind2::" +end + " length::" + (end-start+1));
        return max_so_far;
    }

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
