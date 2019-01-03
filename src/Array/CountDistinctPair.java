package Array;

import java.util.Arrays;

public class CountDistinctPair {

    public int countPair(int a[]){
        int count=0;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            if(isSumPair(a,0,a.length-1,a[i])){
                count++;
            }
        }
        return count;
    }

    boolean isSumPair(int a[],int s,int e, int num){
        while(s<e){
            if(a[s]+a[e] == num) {
                System.out.println("pair is "+ a[s]+" "+ a[e]+"  "+ num);
                return true;
            }
            else if(a[s]+a[e] > num)
                e--;
            else
                s++;
        }
        return false;
    }
}
