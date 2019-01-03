import Array.*;
import BinaryHeap.MinBinaryHeap;
import DP.CoinChangeProblem;
import DP.LongestCommonSubSequence;
import DP.SubSetSum;
import DP.knapsack0_1_Problem;
import DisjointSets.DisjointSets;
import Graph.GraphTraversal;
import Graph.Graph;
import Graph.MatrixCell.Cell;
import Graph.ShortestPath;
import GraphDs.DijkstraAlgorithms;
import GraphDs.MinimumSpanningTree;
import GraphDs.TopologocalSort;
import RandomProblem.BinaryNumberProblems;
import RandomProblem.LongestStringInDict;
import StringsQues.StringProblems;
import SuffixPrefix.KMPAlgorithms;
import Tree.*;
import Tree.checkingPrinting.CheckingPrinting;
import Tree.traversal.BFS.LevelOrderTraversal;
import Tree.traversal.DFS.TreeDFS;
import Tree.traversal.DifferentTreeView.*;
import linkedlist.LinkedListClass;
import problems.LruCache;
import problems.StackMinProblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    static Graph graph;

    public static void main(String[] args) {
        System.out.println("Hello World!");


//        arrayOperation();
          linkedListOperation();
//        graphOperation();
//        dpOperation();
//        TreeOperation();
//        SuffixPrefixOperation();
//        createGraphDs();
//        topologicalSortDemo();
//        binaryHeap();
//        dijkstraAlgorithms();
//        disjointSetOperation();
//        minimumSpanningTree();
//        stringQuestion();
//        impQuestion();
//        randomQuestion();
//        LruCache();

    }

    private static void linkedListOperation(){
        LinkedListClass linkedList = new LinkedListClass();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        linkedList.attachRandomPointer(1,30);
        linkedList.attachRandomPointer(2,10);
        linkedList.attachRandomPointer(3,50);
        linkedList.attachRandomPointer(4,30);
        linkedList.attachRandomPointer(5,20);


        linkedList.printlinkedlist();

        linkedList.cloneLinkedListWithRandomPointer();
    }
    private static void LruCache(){
        LruCache cache = new LruCache();

        cache.insertion(1);
        cache.insertion(2);
        cache.insertion(3);
        cache.insertion(4);
        cache.insertion(5);
        cache.insertion(6);

        cache.delete();

        cache.access(4);

        System.out.println("==== LRUCache Done ===");
    }
    private static void randomQuestion() {
        BinaryNumberProblems p = new BinaryNumberProblems();
//        p.printNBinaryNumber(8);

//        p.generateNBinaryNum(10);

        char str1[] = new char[4];
        str1[0] = '0';
//        p.generateBinaryNumberofNlengthWithNo1stogether(str1,1,4);
        char str[] = new char[4];
        str[0] = '1';
//        p.generateBinaryNumberofNlengthWithNo1stogether(str,1,4);

        System.out.println("\n Binary num from pattern");
        char[] str2 = "1??0?101".toCharArray();
//        p.printBnFronPt(str2,0,str2.length);

        p.printBnPt("1??0?101");

        Vector<String> dict = new Vector<>();
        dict.add("ale");
        dict.add("apple");
        dict.add("monkey");
        dict.add("plea");

        LongestStringInDict l = new LongestStringInDict();
        l.findLongestString(dict,"abpcplea");



    }
    private static void impQuestion() {

        StackMinProblems stackMinProblems = new StackMinProblems();

        stackMinProblems.push(18);
        stackMinProblems.push(19);

        stackMinProblems.getMin();

        stackMinProblems.push(29);
        stackMinProblems.getMin();

        stackMinProblems.push(15);
        stackMinProblems.getMin();

        stackMinProblems.push(16);

        stackMinProblems.pop();
        stackMinProblems.getMin();

        stackMinProblems.pop();
        stackMinProblems.getMin();






    }
    private static void stringQuestion() {
        StringProblems sp = new StringProblems();
        String str = "25 + 3 - 2 * 11";

        System.out.println(str+" is palindrome:: "+ sp.isPallindrome(str));
        System.out.println(str+" reverse is :: "+ sp.reverse(str));

        String gStr="amazon";
        String rStr="zonama";
        System.out.println(gStr + " roates two time gives "+ rStr + " is "+ sp.isRotatedTwoTimes(gStr,rStr));

        System.out.println("String sentence in reverse order-------");
        sp.printWordOfStringInReverseOrder("I AM A GEEK");
        sp.printWordOfStringInReverseOrder("GfG IS THE BEST");
        System.out.print("\n");

        System.out.println("Sorted String array based on length------ ");
        String[] strA = {"GeeksforGeeeks", "I", "from", "am"};
        String[] strA1 = {"You", "are", "beautiful", "looking"};
        sp.sortViaStringLeng(strA1);



        System.out.println("String sentence in reverse order 2nd way-------");
        sp.printWordReverse("I AM A GEEK");
        System.out.print("\n");


    }
    private static void TreeOperation() {
//        TrieOperation();

//        BinaryTreeOPeration();

        CheckingAndPrinting();


    }
    private static void CheckingAndPrinting() {

        BinaryTree binaryTree = new BinaryTree();

        System.out.println("=== Binary Tee Insert ==== ");

        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(80);
        binaryTree.insert(7);
        binaryTree.insert(9);
        binaryTree.insert(75);


        CheckingPrinting checkingPrinting = new CheckingPrinting();


        System.out.println("=====   IS Child Sum ::- " + checkingPrinting.isChildSum(binaryTree.root));
        System.out.println("=====   IS BST ::- " + checkingPrinting.isBST(binaryTree.root));



    }
    private static void SuffixPrefixOperation() {
        KMPAlgorithmsOperation();
    }
    private static void KMPAlgorithmsOperation() {
        KMPAlgorithms kmpAlgorithms = new KMPAlgorithms();
        String str = "abcxabcdabxababcdabcdabcy";
        String pat = "abcdabcy";
        System.out.println("Substring "+ pat+" is present ::" +
                kmpAlgorithms.normalSubString(str,pat)+ " in "+str);
    }
    private static void BinaryTreeOPeration() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println("=== Binary Tee Insert ==== ");
        binarySearchTree.add(100);
        binarySearchTree.add(90);
        binarySearchTree.add(110);
        binarySearchTree.add(85);
        binarySearchTree.add(95);
        binarySearchTree.add(105);
        binarySearchTree.add(115);
        binarySearchTree.add(75);
        binarySearchTree.add(88);

        TreeProblems treeProblems = new TreeProblems();
        System.out.println("All Path from Root to  Leaf");
//        treeProblems.printPathRootToLeaf(binarySearchTree);
        treeProblems.printPathRec(binarySearchTree.root);

        TreeDFS treeDFS = new TreeDFS();

        System.out.println("Inorder Traversal");
        treeDFS.Inorder(binarySearchTree.root);
        System.out.println("\nPreorder Traversal");
        treeDFS.Preorder(binarySearchTree.root);
        System.out.println("\nPostorder Traversal");
        treeDFS.Postorder(binarySearchTree.root);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        System.out.println("\nLevel Order Traversal");
        levelOrderTraversal.levelOrder(binarySearchTree.root);
        System.out.println("\nLevel Order Traversal In Tree Manner");
        levelOrderTraversal.levelOrderInTreeManner(binarySearchTree.root);
        System.out.println("\nLevel Order Traversal In Tree Manner Using Counter");
        levelOrderTraversal.levelOrderUsingCounter(binarySearchTree.root);
        System.out.println("\nLevel Order Traversal In Tree Manner Using Recursion");
        levelOrderTraversal.printLevelOrder(binarySearchTree.root);


        LeftRightView leftRightView = new LeftRightView();

        System.out.println("\nLeft View");
        leftRightView.leftView(binarySearchTree.root,1);

        System.out.println("\nRight View");
        leftRightView.rightView(binarySearchTree.root,1);

        TopBottomView topBottomView = new TopBottomView();

        System.out.println("\nTop View");
        topBottomView.TopView(binarySearchTree.root);

        System.out.println("\nBottom View");
        topBottomView.BottomView(binarySearchTree.root);

        System.out.print("\nDiagonal View\n");
        DiagonalView diagonalView = new DiagonalView();
        diagonalView.diagonal(binarySearchTree.root);

        System.out.print("Spiral View\n");
        SpiralView spiralView = new SpiralView();
        spiralView.spiral(binarySearchTree.root);


        MirrorView mirrorView = new MirrorView();
        System.out.println("\nMirror View");
        mirrorView.Mirror(binarySearchTree.root);

        LCA lca = new LCA();
        System.out.println("\nLowest Common Ancestor");
        lca.lowestCommonAncestor(binarySearchTree.root,90,95);

        InorderSuccessorPredeccessor inorderSuccessorPredeccessor = new InorderSuccessorPredeccessor();

        System.out.println("\nInorder Predeccessor");
        inorderSuccessorPredeccessor.InorderPredeccessor(binarySearchTree.root,115);

        System.out.println("\nInorder successor");
        inorderSuccessorPredeccessor.InorderSuccessor(binarySearchTree.root,95);


    }
    private static void TrieOperation() {
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

        //4. Longest Common SubSequence
        LongestCommonSubSequence longestCommonSubSequence = new LongestCommonSubSequence();


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
        int b1[] = {-2, -3, -4, -1, -2, -1, -5, -3};

        System.out.println("Largest Sum contiguous subarray(Kadane's Algo):: " + sumContNum.getLagestSumContNumberDP(b1));


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
        int g[] = {5,2,2,8,5,6,8,8};
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


        // Max Difference bet ele
        DiffBetEle diffBetEle = new DiffBetEle();
        int q[] ={ 4 , 7  ,2  ,18 , 3 , 6  ,8  ,11 , 21};
        System.out.println("Max Difference bet num:: " + diffBetEle.getMaxDiff(q));

        //Rotate by 90
        RotateNDegree rotateNDegree = new RotateNDegree();
        rotateNDegree.rotate90D();

        //Biggest number formed by arranging numbers in array
        BiggestNumByArrangArray numByArrangArray = new BiggestNumByArrangArray();
        List r = Arrays.asList("3","30","34","5","4","9");
        System.out.println("Biggest no is :: " + numByArrangArray.biggestNumByArrangingArray(r));


        //Rotate array  n times.
        int s[] = {1,2,3,4,5,6,7};
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.rotate(s,7,2);
        // for right rotation rotate the array left for n-d times. n is size(array) d is rotation.

        int s1[] =  {1,2,3,4,5,6,7};
        arrayRotation.leftRotate(s1,7,2);

        int s2[] =  {1,2,3,4,5,6,7};
        arrayRotation.rightRotate(s2,7,2);

        int t[] = {6,9,1,2,3,4,5};
        arrayRotation.pairSumInRotateArray(t,10);

        ArrayArrange arrayArrange = new ArrayArrange();

        int u[] ={-1,2,-3,4,5,6,-7,8,9};
        arrayArrange.rearrangePosNegNum(u);
        int u1[] ={-1,2,-3,4,5,6,-7,8,9};
        arrayArrange.rearrangeInSingleTraverse(u1);

        int v[] = {0,1,0,2,0,4,0,3,0,5,0,0,0};
        arrayArrange.moveZero(v);
        int v1[] = {0,1,0,2,0,4,0,3,0,5,0,0,0};
        arrayArrange.moveZeroToEnd(v1);

        int v2[]={2,1,5,6,3};
        arrayArrange.minSwap(v2,3);

        int v3[] = {1,1,0,0,0,0,1,1,0,0,1,1,0};
        arrayArrange.minSwapOne(v3);

        int v4[] = {12,21,32,42,52,62,72,82,92,10,11,12};
        arrayArrange.arrangeInZigZag(v4);

        arrayArrange.segEvenOdd(t);


        // Count total distinct pair sum present in array
        int w0[] = {1, 2, 3, 5, 10};
        int w1[] = {1, 5, 6, 4, -1, 5};
        CountDistinctPair distinctPair = new CountDistinctPair();
        System.out.println("\nTotal distinct pair:: "+ distinctPair.countPair(w0) );
        System.out.println("\nTotal distinct pair:: "+ distinctPair.countPair(w1) );



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
    private static void createGraphDs() {
        GraphDs.Graph graph = new GraphDs.Graph(6,true);

        graph.add(1,2);
        graph.add(1,3);
        graph.add(2,4);
        graph.add(2,5);
        graph.add(3,6);
        graph.add(3,4);
        graph.add(4,5);
        graph.add(6,1);

        System.out.println("======= BFS =======");

        graph.bfs();

        System.out.println("======= DFS =======");

        graph.dfs();

        System.out.println("======= DFS Recursive=======");

        graph.dfsRecu();

    }
    private static void topologicalSortDemo() {
        TopologocalSort topologocalSort  = new TopologocalSort(7,true);

        topologocalSort.add('A','C');
        topologocalSort.add('B','C');
        topologocalSort.add('B','D');
        topologocalSort.add('C','E');
        topologocalSort.add('D','F');
        topologocalSort.add('E','F');
        topologocalSort.add('F','G');

        System.out.println("===== Topological Sort ======");

        topologocalSort.sort();

    }
    private static void binaryHeap() {
        MinBinaryHeap minBinaryHeap = new MinBinaryHeap();
        minBinaryHeap.insert('A',Integer.MAX_VALUE);
        minBinaryHeap.insert('B',Integer.MAX_VALUE);
        minBinaryHeap.insert('C',Integer.MAX_VALUE);
        minBinaryHeap.insert('D',Integer.MAX_VALUE);
        minBinaryHeap.insert('E',Integer.MAX_VALUE);
        minBinaryHeap.insert('F',Integer.MAX_VALUE);
        System.out.println("==== Min Node in Binary Heap ===== " + minBinaryHeap.getMinVertex().getVertex() + " "
                + minBinaryHeap.getMinVertex().getKey());
    }
    private static void dijkstraAlgorithms() {
        DijkstraAlgorithms dijkstra = new DijkstraAlgorithms(6,false);

        //Adjacency List
        dijkstra.add('A','B',5);
        dijkstra.add('A','D',9);
        dijkstra.add('A','E',2);
        dijkstra.add('B','C',2);
        dijkstra.add('C','D',3);
        dijkstra.add('D','F',2);
        dijkstra.add('E','F',3);

        //Init Binary Heap
        dijkstra.initBinaryHeap();

        System.out.println("=== Dijkstra Algorithm Shortest Path from A ====");

        dijkstra.shortestPath('A');
    }
    private static void disjointSetOperation() {
        DisjointSets disjointSets = new DisjointSets();
        disjointSets.makeSet('A');
        disjointSets.makeSet('B');
        disjointSets.makeSet('C');
        disjointSets.makeSet('D');
        disjointSets.makeSet('E');
        disjointSets.makeSet('F');

        disjointSets.union('A','D');
        disjointSets.union('B','C');
        disjointSets.union('C','D');
        disjointSets.union('E','F');
        disjointSets.union('B','D');
        disjointSets.union('A','B');
        disjointSets.union('C','F');
        disjointSets.union('C','E');
        disjointSets.union('D','E');

        System.out.println("===== Disjoing Set ===");

    }
    private static void minimumSpanningTree() {
        MinimumSpanningTree minimumSpanningTree = new MinimumSpanningTree(6,true);


        minimumSpanningTree.add('A','D',1);
        minimumSpanningTree.add('A','B',3);

        minimumSpanningTree.add('B','A',3);
        minimumSpanningTree.add('B','C',1);
        minimumSpanningTree.add('B','D',3);

        minimumSpanningTree.add('C','B',1);
        minimumSpanningTree.add('C','D',1);
        minimumSpanningTree.add('C','E',5);
        minimumSpanningTree.add('C','F',4);

        minimumSpanningTree.add('D','A',1);
        minimumSpanningTree.add('D','B',3);
        minimumSpanningTree.add('D','C',1);
        minimumSpanningTree.add('D','E',6);

        minimumSpanningTree.add('E','C',5);
        minimumSpanningTree.add('E','D',6);
        minimumSpanningTree.add('E','F',2);

        minimumSpanningTree.add('F','C',4);
        minimumSpanningTree.add('F','E',2);


        System.out.println("===== Minimum Spinning Tree ======");

        minimumSpanningTree.MST();
    }

}
