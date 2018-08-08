package Array;

public class MaxDiff {

    public int getMaxDiff(int a[]) {
        int min = a[0];
        int max = 0;
        int start=0,end=0,pos=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] - min > max) {
                max = a[i] - min;
                start = pos;
                end = i;
            }
            if(a[i] < min) {
                min = a[i];
                pos = i;
            }
        }
        System.out.println(" Start ::" + start+ " end::"+end);
        return max;
    }
}
