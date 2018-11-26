package StringsQues;

import java.lang.reflect.Array;
import java.util.*;

public class StringProblems {

    public String reverse(String str){
        char ch[] = str.toCharArray();
        char res[] = new char[ch.length];
        int i=0;
        int j=ch.length-1;
        while (j>=0){
            res[i] = ch[j];
            i++;j--;
        }
        return new String(res);
    }

    public boolean isPallindrome(String str){
       char ch[] = str.toCharArray();
       int i = 0;
       int j = ch.length - 1;
       while(i<=j){
           if(ch[i]!=ch[j])
               return false;
           i++;j--;
       }
       return true;
    }

    public boolean isRotatedTwoTimes(String gString, String rString){
        String antiClk = gString.substring(2) + gString.substring(0,2);
        if(antiClk.equals(rString))
            return true;

        String clk = gString.substring(gString.length()-2) + gString.substring(0,gString.length()-2);
        if(clk.equals(rString))
            return true;
        return false;
    }

    public void printWordOfStringInReverseOrder(String gString){
        String[] stringTokenizer = gString.split(" ");
        for(int i=stringTokenizer.length-1; i>=0; i--){
            System.out.print(stringTokenizer[i]+" ");
        }
    }

    /*
    input : i like this program very much
    Reverse the individual word
    Reverse the whole string to get desired string
     */
    public void printWordReverse(String gString){
        char[] ch = gString.toCharArray();
        int i =0; int beg = 0;
        while(i < ch.length-1){

            while(ch[i]!=' ' && i < ch.length-1){
                i++;
            }

            reverseWord(ch,beg,i-1);
            beg = i++;
        }
        for(char c: ch)
            System.out.print(c);
    }

    private void reverseWord(char[] word, int beg, int end) {
        int i = 0;
        int j = word.length - 1;
        char res[] = new char[word.length];
        while (i >=j) {
            res[i] = word[j];
            i++;
            j--;
        }
        for(char c: res)
            System.out.print(c);
    }


    /*
    We can sort it via
     1. normal any sorting algorithm
     2. Use Collections
     */
    public void sortViaStringLeng(String[] strA){
        Map<String,Integer> map = new HashMap();
        Map<String,Integer> sortedMap = new LinkedHashMap<>();
        for(int i=0; i<strA.length; i++){
            map.put(strA[i],strA[i].length());
        }

        List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());

        /*Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });*/

        Collections.sort(list,(o1,o2)->o1.getValue()-o2.getValue());

        for(Map.Entry<String,Integer> entry: list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }

        for(Map.Entry<String,Integer> entry : sortedMap.entrySet()){
            System.out.print(entry.getKey()+" ");
        }


    }


}
