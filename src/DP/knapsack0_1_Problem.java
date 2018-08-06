package DP;

public class knapsack0_1_Problem {

    public int maxValue(int wt[], int val[],int sum){
        int r = wt.length;
        int c = sum + 1;
        int[][] a = new int[r][c];

        for(int i = 0; i<r; i++){
            a[i][0] = 0;
            a[0][i] = 0;
        }

        for(int i=1; i<r; i++){
            for(int j=1;j<c;j++){
                if(wt[i]  >  j){
                    a[i][j] = a[i-1][j];
                }else{
                    a[i][j] = max(a[i-1][j], val[i] + a[i-1][j-wt[i]]);
                }
            }
        }

        return a[r-1][c-1];
    }

    private int max(int a,int b){
        return a>b?a:b;
    }
}
