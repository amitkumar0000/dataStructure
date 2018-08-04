import Array.LargestSumContNum;
import Array.LengthofNonRepeatedNum;
import Array.StockSellBuy;
import Graph.GraphTraversal;
import Graph.Graph;

public class Main {

    static Graph graph;

    public static void main(String[] args) {
        System.out.println("Hello World!");


        arrayOperation();
//        graphOperation();

    }

    private static void arrayOperation() {
        //1. Largest sum contiguous subarray
        int a[] = {-2,-3,4,-1,-2,5,-3,8,-89,-100,456,900};
        LargestSumContNum sumContNum = new LargestSumContNum();
        System.out.println("Largest Sum contiguous subarray:: "+ sumContNum.getLargestSumContNum(a));
        int b[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Largest Sum contiguous subarray:: "+ sumContNum.getLargestSumContNum(b));


        //2. Find the length of the non repeated numbers in an array.
        int c[] = {1,2,2,3,4,5,6,2,3};
        LengthofNonRepeatedNum  nonRepeatedNum  = new LengthofNonRepeatedNum();
        System.out.println("Length of largest non repeated num:: "+ nonRepeatedNum.getLengthOfNonRepeatedNum(c));
        int d[] = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Length of largest non repeated num:: "+ nonRepeatedNum.getLengthOfNonRepeatedNum(d));

        //3. Max profit by buying and selling stock one.
        int e[] = {100,200,400,300,500,40, 800};
        StockSellBuy sellBuy = new StockSellBuy();
        System.out.println("Length of largest non repeated num:: "+ sellBuy.getMaxProfitBuySellOnce(e));

    }


    private static void graphOperation() {
        createGraph();
        graphTraversal();
    }

    private static void createGraph() {
        graph = new Graph(true);
        addEdges();
    }


    private static void addEdges(){
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(5,3);
        graph.addEdge(6,5);
    }

    private static void graphTraversal() {
        GraphTraversal traversal = new GraphTraversal();

        traversal.bfsTraversal(graph);
        traversal.dfsTraversal(graph);
    }




}
