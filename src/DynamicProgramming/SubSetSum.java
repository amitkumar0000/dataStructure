package DynamicProgramming;

public class SubSetSum {

    public boolean isSubsetSum(int num[], int sum){
        int temp[] = new int[num.length + 1];
        int r = num.length + 1;
        int c = sum+1;
        boolean a[][] = new boolean[r][c];

        temp[0] = 0;
        int k = 1;
        for(int i = 0; i<num.length; i++)
            temp[k++] = num[i];

        a[0][0] = true;
        for(int i = 1; i<c; i++){
            a[0][i] = false;
        }

        for(int i = 1; i<r; i++){
            for(int j=0; j<c; j++){
                if(temp[i]>j){
                    a[i][j] = a[i-1][j];

                }else{
                    a[i][j] = a[i-1][j] || a[i-1][j-temp[i]];
                }
            }
        }

        return a[num.length][sum];
    }
}
