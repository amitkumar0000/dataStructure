package Array;

public class CommonEleInArray {

    public int getCommonEle(int a[], int b[], int c[]){
        int ele = -1;
        int i = 0;
        int p,q,r;
        p=q=r=0;
        while(i<a.length && i<b.length && i<c.length){
            if(a[p] == b[q] && b[q] == c[r]){
                ele = a[p];
                break;
            }else if(a[p] < b[q] && a[p] < c[r])
                p++;
            else if(b[q] < a[p] && b[q] < c[r])
                q++;
            else
                r++;
        }
        return ele;
    }
}
