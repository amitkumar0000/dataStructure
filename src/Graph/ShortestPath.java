package Graph;

import Graph.MatrixCell.Cell;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    public int getMinDisBwTwoGridInMatrix(int[][] matrix, int N, int M, Cell source, Cell dest){
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        queue.add(source);

        visited[source.r][source.c] = true;

        for(int i = 0; i<N; i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()){
            Cell ce = queue.poll();

            if(ce.r == dest.r && ce.c == dest.c){
                return ce.dist;
            }

            //moving up
            if(ce.r -1 >=0 && visited[ce.r-1][ce.c]==false){
                queue.add(new Cell(ce.r-1,ce.c,ce.dist+1,ce));
                visited[ce.r-1][ce.c] = true;
            }

            //moving down
            if(ce.r +1 <N && visited[ce.r+1][ce.c]==false){
                queue.add(new Cell(ce.r+1,ce.c,ce.dist+1,ce));
                visited[ce.r+1][ce.c] = true;
            }

            //moving right
            if(ce.c + 1 < M && visited[ce.r][ce.c+1]==false){
                queue.add(new Cell(ce.r,ce.c+1,ce.dist+1,ce));
                visited[ce.r][ce.c+1] = true;
            }

            //moving left
            if(ce.c -1 >=0 && visited[ce.r][ce.c-1]==false){
                queue.add(new Cell(ce.r,ce.c-1,ce.dist+1,ce));
                visited[ce.r][ce.c-1] = true;
            }
        }

        return -1;
    }
}
