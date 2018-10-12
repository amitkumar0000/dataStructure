package DP;


/*
Given a infinite number of given set of coins.
What is minimum num of coins that adds to given sum
 */
public class CoinChangeProblem {
    int r, c;
    int[][] T;

    public int minNumOfCoins(int numOfCoins, int sum) {
        r = numOfCoins+1;
        int c = sum+1;
        T = new int[r][c];

        int i = 0;
        T[i][0] = 1;
        for (int j = 1; j < c; j++) {
            T[i][j] = 0;
        }
        for (i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (i > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j] + T[i][j-i];
                }

            }
        }
        return T[r-1][c-1];
    }


}
