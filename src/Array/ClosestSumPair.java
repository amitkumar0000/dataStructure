package Array;

import static java.lang.Math.abs;

public class ClosestSumPair {

    public void printClosestSumPair(int a[], int x){
        int i = 0;
        int j = a.length -1;
        int pair1 = i;
        int pair2 = j;
        int diff = a[j] - a[i];

        while(i<j){
            if( abs(a[j]+ a[i] - x)  < diff){
                pair1 = i;
                pair2 = j;
                diff = abs(a[j] + a[i] -x) ;
            }

            if(a[i]+a[j] > x)
                j--;
            else
                i++;
        }

        System.out.println("Pair1::"+a[pair1] + " pair2:"+a[pair2]);
    }
}
