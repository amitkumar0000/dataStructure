import Array.*;
import DP.CoinChangeProblem;
import DP.SubSetSum;
import DP.knapsack0_1_Problem;
import Graph.GraphTraversal;
import Graph.Graph;
import Graph.MatrixCell.Cell;
import Graph.ShortestPath;
import Tree.Trie;

public class Main {

    static Graph graph;

    public static void main(String[] args) {
        System.out.println("Hello World!");


//        arrayOperation();
//        graphOperation();
//        dpOperation();
        TreeOperation();

    }

    private static void TreeOperation() {
        Trie trie = new Trie();

        //1. Insert
        String[] data0 = {"abc", "abcd", "bcdf", "fgh"};
        for (String d : data0) {
            trie.insert(d);
        }

        //2. Search
        String[] data1 = {"a","d","c","abc", "abcd","abcde", "bcd", "fgh","fg","bcdf","bcdfw"};
        System.out.println("=========Prefix Search in Trie=========");
        for(String d: data1){
            System.out.println(d+ " is found in trie:: "+ trie.prefixSearch(d));
        }
        System.out.println("=========Word Search in Trie===========");
        for(String d: data1){
            System.out.println(d+ " is found in trie:: "+ trie.wordSearch(d));
        }

    }


    private static void dpOperation() {

        //1. Coin Change Problem
        // Number of making a sum by using given set of coins.
        // Each coin is given infitnit number of times.
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();
        System.out.println("Num of way to making " + 5 + " using {1,2,3} infinite num each :: "
                + coinChangeProblem.minNumOfCoins(3, 5));


        //2. SubSet Problem
        // For given array is there subset preset with sum equal to given sum
        SubSetSum setSum = new SubSetSum();
        int num[] = {2, 3, 7, 8, 10};
        int sum = 21;
        System.out.println("is subset equal " + sum + " using {2,3,7,8,10}  :: "
                + setSum.isSubsetSum(num, sum));

        //3. 0/1 Knapsack problem
        knapsack0_1_Problem knapsack01Problem = new knapsack0_1_Problem();
        int wt[] = {0, 1, 2, 4, 5};
        int[] val = {0, -100, 40, 5, -700};

        System.out.println("Max value using wt{1,3,4,5} and value{1,4,5,7} " +
                "that can make a max weight 7 is " + knapsack01Problem.maxValue(wt, val, 7));

        //4. Egg Dropping Problem
        // Given num of egg and number of floor. Find in minimum number of steps to find
        //from which floor the egg will break.
    }

    private static void arrayOperation() {
        //1. Largest sum contiguous subarray
        int a[] = {-2, -3, 4, -1, -2, 5, -3, 8, -89, -100, 456, 900};
        LargestSumContNum sumContNum = new LargestSumContNum();
        System.out.println("Largest Sum contiguous subarray:: " + sumContNum.getLargestSumContNum(a));
        int b[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Largest Sum contiguous subarray:: " + sumContNum.getLargestSumContNum(b));


        //2. Find the length of the non repeated numbers in an array.
        int c[] = {1, 2, 2, 3, 4, 5, 6, 2, 3};
        LengthofNonRepeatedNum nonRepeatedNum = new LengthofNonRepeatedNum();
        System.out.println("Length of largest non repeated num:: " + nonRepeatedNum.getLengthOfNonRepeatedNum(c));
        int d[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Length of largest non repeated num:: " + nonRepeatedNum.getLengthOfNonRepeatedNum(d));

        //3. Max profit by buying and selling stock one.
        int e[] = {100, 200, 400, 300, 500, 40, 800};
        StockSellBuy sellBuy = new StockSellBuy();
        System.out.println("Length of largest non repeated num:: " + sellBuy.getMaxProfitBuySellOnce(e));

        System.out.println("Length of largest non repeated num:: " + sellBuy.getMaxProfifSellingOnce(e));


        //4. One Missing Num in 1 to N
        OneMissingNum missingNum = new OneMissingNum();
        int[] f = {1, 2, 3, 4, 5, 7};
        System.out.println("Missing num " + missingNum.getMissingNum(f, 7));

        //5. Sort by Freq
        SortByFreq sortByFreq = new SortByFreq();
        int g[] = {5, 5, 2, 8, 2, 6, 8, 8};
        sortByFreq.Sort(g);

        //6. Two smallest num
        FindTwoSmallestNum twoSmallestNum = new FindTwoSmallestNum();
        int h[] = {7, 6, 8, 10, 11, 5, 4, 99};
        twoSmallestNum.smallestNum(h);

        //7. Majority
        Majority majority = new Majority();
        int i[] = {2, 1, 2, 2, 4};
        int x = 2;
        System.out.println(x + " is majority:: " + majority.isMajorityInSortedArray(i, 2));

        int i1[] = {4, 3, 1, 4, 3, 4, 5, 4, 4, 2, 4, 2, 4, 4};
        System.out.println("  majority num:: " + majority.getMajorityEleInUnSortedArray(i1));


        //8 Max diff such that number in sequence smaller ---- larger
        MaxDiff diff = new MaxDiff();
        int j[] = {4, 7, 2, 18, 3, 6, 8, 11, 21, 1, 234};
        System.out.println(" Max diff : " + diff.getMaxDiff(j));

        //9. Closest Pair sum
        ClosestSumPair sumPair = new ClosestSumPair();
        int k[] = {4, 16, 28, 37, 42, 64, 65, 124, 245};
        sumPair.printClosestSumPair(k, 201);

        //10. Print Distinct ele
        DistinctEle distinctEle = new DistinctEle();
        int l[] = {14, 16, 19, 14, 46, 19, 16, 16, 110};
        distinctEle.printDistinctEle(l);

        //11. Common ele in given arrays
        CommonEleInArray eleInArray = new CommonEleInArray();
        int m[] = {1, 5, 10, 20, 40, 80};
        int n[] = {6, 7, 20, 80, 100};
        int o[] = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println("Common ele is:: " + eleInArray.getCommonEle(m, n, o));


        //12. Max Sum non adjacent number
        MaxDiffNonAdjacent maxDiffNonAdjacent = new MaxDiffNonAdjacent();
        int p[] = {23, 2, 1, 5};
        System.out.println("Max sum non adjacent num:: " + maxDiffNonAdjacent.getMaxSumNonAdj(p));


    }


    private static void graphOperation() {
        createGraph();
        graphTraversal();

        //Shortest Path b/w two cell in a matrix
        int N = 4, M = 4;
        int[][] a = {
                {0, 1, 0, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}
        };
        Cell src = new Cell(0, 3, 0, null);
        Cell dst = new Cell(3, 0, 0, null);
        ShortestPath shortestPath = new ShortestPath();
        System.out.println("Shortest dist:: " + shortestPath.getMinDisBwTwoGridInMatrix(a, N, M, src, dst));
    }

    private static void createGraph() {
        graph = new Graph(true);
        addEdges();
    }


    private static void addEdges() {
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(5, 3);
        graph.addEdge(6, 5);
    }

    private static void graphTraversal() {
        GraphTraversal traversal = new GraphTraversal();

        traversal.bfsTraversal(graph);
        traversal.dfsTraversal(graph);
    }


}
