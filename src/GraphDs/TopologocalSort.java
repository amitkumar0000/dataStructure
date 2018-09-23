package GraphDs;

import java.util.*;

public class TopologocalSort {
    List<Character> adjlist[];
    Set isVisited;
    boolean isDirected;

    public TopologocalSort(int v, boolean isDirected){
        adjlist = new LinkedList[v];
        for(int i=0; i<v; i++){
            adjlist[i] = new LinkedList<>();
        }
        this.isDirected = isDirected;
        isVisited = new HashSet();
    }
    
    public void add(char src, char dest){
        List<Character> list = adjlist[src - 'A'];
        if(!list.contains(src)){
            list.add(src);
        }
        adjlist[src - 'A'].add(dest);


        if(!isDirected){
            List<Character> list1 = adjlist[dest - 'A'];
            if(!list1.contains(dest)){
                list1.add(dest);
            }
            adjlist[dest - 'A'].add(src);

        }
    }


    public void sort(){
        Set isVisited = new HashSet();
        Stack<Character> s = new Stack();
        Stack<Character> result = new Stack<>();

        for(int i=0; i<adjlist.length; i++){
            List<Character> list = adjlist[i];
            for(char ch: list){
                if(!isVisited.contains(ch)){
                    s.push(ch);
                    isVisited.add(ch);
                    break;
                }
            }
            while(!s.isEmpty()){
                char ch1 =  s.peek();
                List<Character> list1 = adjlist[ch1 - 'A'];
                boolean flag = false;

                for(char ch2 : list1){
                    if(!isVisited.contains(ch2)){
                        s.push(ch2);
                        isVisited.add(ch2);
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    result.push(s.pop());
                }
            }
        }

        while(!result.isEmpty()){
            System.out.print(result.pop()+" ");
        }

    }
}
