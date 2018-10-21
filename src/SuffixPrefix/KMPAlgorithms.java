package SuffixPrefix;

/*
For a given String , Search a given substring is present or not
 */
public class KMPAlgorithms {

    /*
    Time Complexity = O(mn)
    m = len(pattern)
    n = len(str)
     */
    public boolean normalSubString(String str, String pattern){
        char[] strC = str.toCharArray();
        char[] patC = pattern.toCharArray();
        int j=0;
        int start = 0;
        for(int i=0;i<strC.length;i++){
            if(strC[i] == patC[j]){
                if(j==patC.length-1) {
                    System.out.println("Substring start index:: " + start);
                    return true;
                }else{
                    j++;
                    continue;
                }
            }else{
                j=0;
                i = start + 1;
                start = i;
                i--;
            }
        }
        return false;
    }

    /*
    Time Complexity = O(m+n)
    m = len(pattern)
    n = len(str)
     */
    public boolean kmpSubString(String str, String pattern){
       return false;
    }
}
