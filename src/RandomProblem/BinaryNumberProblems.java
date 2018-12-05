package RandomProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BinaryNumberProblems {

    public void printNBinaryNumber(int n) {
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        while (n-- > 0) {
            String s1 = queue.peek();
            queue.remove();

            System.out.print(s1 + " ");

            String s2 = s1;

            queue.add(s1 + "0");
            if (s2.lastIndexOf("1") != s2.length() - 1)
                queue.add(s2 + "1");
        }
    }


    public void generateNBinaryNum(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        System.out.println("\n N " + n + " Binary Number ");
        while (n-- > 0) {
            String s1 = q.poll();
            System.out.print(s1 + " ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public void generateBinaryNumberofNlengthWithNo1stogether(char str[], int n, int k) {

        if (n == k) {
            System.out.print(String.valueOf(str) + " ");
            return;
        } else {

            if (str[n - 1] == '1') {
                str[n] = '0';
                generateBinaryNumberofNlengthWithNo1stogether(str, n + 1, k);
            }
            if (str[n - 1] == '0') {
                str[n] = '0';
                generateBinaryNumberofNlengthWithNo1stogether(str, n + 1, k);
                str[n] = '1';
                generateBinaryNumberofNlengthWithNo1stogether(str, n + 1, k);
            }
        }
    }

    public void printBnFronPt(char str[], int index, int len) {
        if (index == len) {
            System.out.println(String.valueOf(str) + " ");
            return;
        } else {
            if (str[index] == '?') {
                str[index] = '0';
                printBnFronPt(str, index + 1, len);

                str[index] = '1';
                printBnFronPt(str, index + 1, len);

                str[index] = '?';
            }else{
                printBnFronPt(str, index + 1, len);
            }

        }
    }




    public void printBnPt(String str){
        Queue<String> queue = new LinkedList<>();
        queue.add(str);

        while(!queue.isEmpty()){
            String s1 = queue.peek();

            int index = s1.indexOf('?');

            if(index!=-1){
                s1 = s1.substring(0,index)+'0'+s1.substring(index+1);
                queue.add(s1);
                s1 = s1.substring(0,index)+'1'+s1.substring(index+1);
                queue.add(s1);
            }else {
                System.out.println(s1);
            }
            queue.poll();
        }
    }


}
