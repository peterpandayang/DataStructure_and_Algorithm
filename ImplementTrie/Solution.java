package ImplementTrie;

/**
 * Created by bingkunyang on 15/12/30.
 */
/**
 * Your Trie object will be instantiated and called as such:
 * Trie trie = new Trie();
 * trie.insert("lintcode");
 * trie.search("lint"); will return false
 * trie.startsWith("lint"); will return true
 */
class TrieNode {
    boolean exist;
    char ch;
    TrieNode[] children;
    public TrieNode() {

    }
    public TrieNode(char ch) {
        this.ch = ch;
    }
}

public class Solution {
    private TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        TrieNode pre = root;
        for (int i = 0; i < word.length(); i++) {
            if (pre.children == null) {
                pre.children = new TrieNode[26];
            }
            int index = word.charAt(i)-'a';
            if (pre.children[index] == null) {
                pre.children[index] = new TrieNode(word.charAt(i));
            }
            pre = pre.children[index];
            if (i == word.length() - 1) {
                pre.exist = true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        TrieNode pre = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'a';
            if (pre.children == null || pre.children[index] == null) {
                return false;
            }
            if (i == word.length() - 1 && pre.children[index].exist == false) {
                return false;
            }
            pre = pre.children[index];
        }
        return true;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) {
            return false;
        }
        TrieNode pre = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i)-'a';
            if (pre.children == null || pre.children[index] == null) {
                return false;
            }
            pre = pre.children[index];
        }
        return true;
    }
}