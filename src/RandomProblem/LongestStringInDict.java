package RandomProblem;

import java.util.Vector;

public class LongestStringInDict{

        private boolean isSubsequence(String word, String str){
            int m = word.length();int n = str.length();
            int j = 0;
            for(int i=0; i<n && j<m; i++){
                if(word.charAt(j) == str.charAt(i))
                    j++;

            }
            return j==m;
        }

        public void findLongestString(Vector<String> dict, String str) {
            String result = "";
            int length = 0;

            for(String word : dict){

                if(length < word.length() && isSubsequence(word,str)){
                    length = word.length();
                    result = word;
                }

            }

            System.out.println(result + " ");
        }
}
