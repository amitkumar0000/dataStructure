package Array;

public class ArrayRotation {

    public void rotate(int a[],int n, int d){
        int temp =0; int j;
        for(int i=0; i<gcd(n,d); i++){
            temp = a[i];
            j=i;
            int k;
            while(true){
                k = j+d;
                if(k>=n)
                    k = k - n;
                if(k==i)
                    break;
                a[j]=a[k];
                j=k;
            }
            a[j] = temp;
        }

        System.out.println("Array after "+ d+ " rotation -->");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    private int gcd(int a, int b) {
        if(b==0)
            return a;
        else
           return gcd(b, a%b);
    }

    public void leftRotate(int a[],int n, int d){
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);

        System.out.println("\nArray after "+d+ " left rotation ");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    public void rightRotate(int a[],int n, int d){
        reverse(a,n-d,n-1);
        reverse(a,0,n-d-1);
        reverse(a,0,n-1);

        System.out.println("\nArray after "+d+ " right rotation ");
        for(int i: a){
            System.out.print(i+" ");
        }
    }

    private void reverse(int a[], int s, int e){
        while(s<e){
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++; e--;
        }
    }

    //Find the pivot point from where next ele is less than prev ele.
    // Once find ... do binary search from 0 to pivot ele and pivotele_+1 to n
    public void searchInRotatedArray(int a[],int sEle){}

    //In rotated ele find PairofSum
    public void pairSumInRotateArray(int a[], int sum){

        int piv = 0;
        int n = a.length;
        for(int i=0; i<n-1; i++){
            if(a[i] > a[i+1]){
                piv = i;
                break;
            }
        }
        int l = (piv+1)%n;
        int r = piv;

        while(l!=r){
            if(a[l]+a[r] == sum){
                System.out.print("\n pair " + a[l]+ " +"+a[r]+ " = "+sum);
                l = (l+1)%n;
                r = (n+r-1)%n;
            }else if(a[l]+a[r]<sum){
                l = (l+1)%n;
            }else
                r = (n+r-1)%n;
        }
    }
}
