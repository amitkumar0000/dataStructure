package Array;

import java.util.Arrays;

public class NextGreaterNum {

    //FInd the position in which prev pos is less than.
    //Swap the prev pos with smallest num from remaining num starting from current.
    // Sort the number from current position
    public int nextGreaterNum(int num){
        char[] numCharA = (num+"").toCharArray();
        int len = numCharA.length-1;
        boolean posible = false;
        while (len!=1){
            if(numCharA[len-1] < numCharA[len]){
                posible = true;
                break;
            }else{
                len--;
            }
        }

        if(posible) {
            int small = smallPos(String.valueOf(numCharA).substring(len),numCharA[len-1]);

            char temp = numCharA[small + len];
            numCharA[small + len] = numCharA[len - 1];
            numCharA[len - 1] = temp;

            Arrays.sort(numCharA, len, numCharA.length);
            return Integer.valueOf(String.valueOf(numCharA));
        }

        return -1;


    }

    private int smallPos(String substring,char num) {
        char[] str = substring.toCharArray();
        int i ; int min= Integer.valueOf(str[0]);
        int pos =0;

        for(i=0; i<str.length; i++){
            if(Integer.valueOf(num) < Integer.valueOf(str[i]) && min > Integer.valueOf(str[i])){
                min = Integer.valueOf(str[i]);
                pos = i;
            }
        }

        return pos;
    }

}
