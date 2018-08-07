package Array;

import java.util.*;

public class SortByFreq {

    public void Sort(int[] arr){
        Map<Integer,Integer> hashmap = new LinkedHashMap<Integer,Integer>();

        for(int i = 0; i<arr.length; i++){
            if(!hashmap.containsKey(arr[i])){
                hashmap.put(arr[i],1);
            }else{
                int count = hashmap.get(arr[i]);
                hashmap.put(arr[i],count+1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int k = 0;
        for(Map.Entry<Integer,Integer> entryMap: list){
            int key = entryMap.getKey();
            for(int j=0; j<entryMap.getValue(); j++){
                arr[k++] = key;
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
