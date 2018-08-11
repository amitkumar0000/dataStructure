package Tree;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    TrieNode root;


    public Trie(){
        root = new TrieNode();
    }


    public void insert(String word) {
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean wordSearch(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            TrieNode node = current.children.get(word.charAt(i));
            if(node == null)
                return false;
            current = node;
        }
        return current.endOfWord==true?true:false;
    }

    public boolean prefixSearch(String prefix){
        TrieNode current = root;
        for(int i=0; i<prefix.length(); i++){
            TrieNode node = current.children.get(prefix.charAt(i));
            if(node == null)
                return false;
            current = node;
        }
        return true;
    }

    //TODO to be implement in future
    public boolean delete(String str){
        return true;
    }

}
