package Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctEle {
    public void printDistinctEle(int a[]){
        Set<Integer> set = new LinkedHashSet<>();

        for(int i =0; i<a.length; i++){
            set.add(a[i]);
        }

        for(Integer i: set){
            System.out.print(i+ " ");
        }
    }
}
