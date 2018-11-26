package Array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class BiggestNumByArrangArray {

    /*
    Sort the string array by overriding comparator method
    add two string x and y. if xy > yx  then x will come first
                                    else y will come first.
     */

    public String biggestNumByArrangingArray(List<String> list){


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x+y;
                String yx = y+x;
                return xy.compareTo(yx)>0?-1:1;
            }
        });

        String result="";
        for(String i:list) {
            result+=i;
        }
        return result;

    }

}
