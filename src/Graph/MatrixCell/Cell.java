package Graph.MatrixCell;

public class Cell {
    public int r,c,dist;
    public Cell prev;
    public Cell(int r, int c,int dist, Cell cell){
        this.r = r;
        this.c = c;
        this.dist = dist;
        this.prev = cell;
    }
}
