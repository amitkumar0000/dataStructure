package problems;

public class MatrixRelatedProblems {
    /*
    Minimum time required to rot all oranges in a matrix.

    sol:- Use BFS to solve the problems
    Store cell of all rotten oranges in a Queue
    Insert a delimiter in the end.

    Get ele from queue until delimiter is reached . And adjacent cell which got rotten in Queue.
    Add second delimiter.
    Repeat the process until no new cell is added.
    Check matrix, if any fresh orange is left.

     */
    public void getMinTimeToRotOranges(int[][] matrix){

    }

    /*
    Find number of island in a Matrix of 0 and 1

    Use DFS .
    Insert cell of 1 in a stack. keep adding adjacent cell with value in stack.
    pop the stack. and check any further adjacent cell can be inserted.
    Do until stack becomes empty. All inserted cell is marked as visited.

    The number of time stack is empty is answer.

     */
    public void getNumIslands(int[][] matrix){

    }

    /*
    Rate in a maze. Find the path of rat of source cell to destination cell
    Use DFS
     */

    public void findPath(int[][]  matrix){

    }

    /*
    Word Boggle Problem.
    Given a Dictionary and m*n matrix of character . Find all possible word that can formed by sequence of character.
     */
    public void wordBoggle(int[][] matrix, String[] dic){

    }
}
