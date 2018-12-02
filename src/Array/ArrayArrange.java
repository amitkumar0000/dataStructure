package Array;

public class ArrayArrange {

    public void rearrangePosNegNum(int a[]){
        int count = -1;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0) {
                count++;
                int t = a[count];
                a[count] = a[i];
                a[i] = t;
            }
        }
        int pi=1;
        int ni = count+1;
        while(ni < a.length && pi < a.length){
            if(a[pi] >= 0){
                int t = a[pi];
                a[pi] = a[ni];
                a[ni] = t;

                pi = pi+2;
                ni = ni+1;
            }else {
                break;
            }
        }
        System.out.print("\n Array After arrange--> \n");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    public void rearrangeInSingleTraverse(int a[]){
        for(int i=0; i<a.length; i++){
            if(i%2==0 && a[i] < 0){
                int e = i;
                while(e < a.length && a[e] < 0 )
                    e = e+1;
                if(e < a.length) {
                    rightRotate(a, i, e);
                }
                i = e;
            }else if(i%2!=0 && a[i] >= 0){
                int e = i;
                while(e < a.length && a[e] >= 0 )
                    e = e+1;
                if(e < a.length) {
                    rightRotate(a, i, e);
                }
                i = e;
            }
        }
        System.out.print("\n Array After arrange--> \n");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    public void moveZero(int a[]){

        int count = 0;
        for(int i=0; i< a.length; i++){
            if(a[i]!=0){
                a[count] = a[i];
                count++;
            }
        }
        for(int i=count ; i< a.length; i++){
            a[i] = 0;
        }
        System.out.println("\n Array after moving zero to end\n");
        for(int i: a){
            System.out.print(i+" ");
        }

    }

    public void moveZeroToEnd(int a[]){
        int count = -1;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                int t = a[++count];
                a[count] = a[i];
                a[i]=t;
            }
        }
        System.out.println("\n Array after moving zero to end\n");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    public void minSwap(int a[],int k){
        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i] <= k){
                count++;
            }
        }
        int bad=0;
        for(int i=0; i<count; i++){
            if(a[i]>k)
                bad++;
        }
        int ans = bad;
        for(int i=0, j=count; j<a.length; j++,i++){
            if(a[i]>k)
                --bad;
            if(a[j]>k)
                ++bad;

            ans = min(ans,bad);
        }
        System.out.print("\n minimum swap required::  "+ ans);
    }

    public void minSwapOne(int a[]){
        int noOfOnes = 0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == 1)
                noOfOnes++;
        }

        int bad=0;
        for(int i=0;i<noOfOnes;i++){
            if(a[i]!=1)
                bad++;
        }
        int ans = bad;

        for(int i=0,j=noOfOnes; j<a.length; j++,i++){
            if(a[i]!=1)
                bad--;
            if(a[j]!=1)
                bad++;
            ans = min(ans,bad);
        }

        System.out.print("\n minimum swap required for ones::  "+ ans);


    }

    public void arrangeInZigZag(int a[]){
        int flag = 0;

        for(int i=0;i<a.length-1;i++) {
            if (flag == 0) {
                if (a[i + 1] < a[i]) {
                    int t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
                flag = 1;
            }else if(flag == 1){
                if(a[i+1] > a[i]){
                    int t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
                flag = 0;
            }
        }

        System.out.println("\nArray in ZigZag fashion --> ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    public void segEvenOdd(int a[]){
        int op=-1;
        for(int i=0; i<a.length; i++){
            if((a[i]&0x01) == 0){
                int t = a[++op];
                a[op]=a[i];
                a[i]=t;
            }
        }
        System.out.println("\n Array after even odd segregation -->" );
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private int min(int a,int b){
        return a>b?b:a;
    }


    private void rightRotate(int a[], int b, int e){
        reverse(a,b,e-1);
        reverse(a,b,e);
    }

    private void reverse(int a[],int start, int e){
        rev(a, start, e);
    }

    static void rev(int[] a, int start, int e) {
        while(start<e){
            int temp = a[start];
            a[start] = a[e];
            a[e] = temp;
            start++;e--;
        }
    }
}
