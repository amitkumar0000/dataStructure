package Array;

public class LargestSumContNum {

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
}
