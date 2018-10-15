package Array;

public class RotateNDegree {
    String[][] inputArr;
    int r= 3,c=4;
    String[][] rotate90D;

    public RotateNDegree(){
        inputArr = new String[][]{
                {"a1", "a2", "a3", "a4"},
                {"b1", "b2", "b3", "b4"},
                {"c1","c2","c3","c4"},
        };

        rotate90D = new String[c][r];
    }

    public void rotate90D(){
        for(int i=0; i<r; i++){
            for(int j=0;j<c;j++){
                rotate90D[j][i] = inputArr[r-i-1][j];
            }
        }

        for(int i=0; i<c; i++){
            for(int j=0;j<r;j++){
                System.out.print(rotate90D[i][j]+" ");
            }
            System.out.println();
        }
    }

}
