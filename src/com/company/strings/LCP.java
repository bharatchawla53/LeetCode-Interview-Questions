package com.company.strings;

public class LCP {
    private static final TrieNode root = new TrieNode();
    private static final int ALPHABET_SIZE = 26;
    private static int index;

    public static void main(String[] args) {
        String[] strs = new String[]{"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {

        // construct a trie for all the input strings
        for (int i = 0; i < strs.length; i++) {
            insert(strs[i]);
        }

        // iterate over the trie to find the LCP where the first node branches out
        return traverseTrie();
    }

    private static String traverseTrie() {
        TrieNode temp = root;
        index = 0;
        String prefix = "";

        while (countChildren(temp) == 1 && !temp.isEndOfWord) {
            temp = temp.children[index];
            prefix += (char) ('a' + index);
        }

        return prefix;
    }

    private static int countChildren(TrieNode temp) {
        int count = 0;

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (temp.children[i] != null) {
                count++;
                index = i;
            }
        }

        return count;
    }

    /**
     * If not present, inserts key into trie. Else, if the key is the prefix of trie node,
     * just marks leaf node.
     **/
    private static void insert(String key) {
        int index;
        TrieNode temp = root;

        for (int i = 0; i < key.length(); i++) {
            index = key.charAt(i) - 'a';

            if (temp.children[index] == null) {
                temp.children[index] = new TrieNode();
            }

            temp = temp.children[index];
        }

        // mark the last node as leaf
        temp.isEndOfWord = true;
    }

    // trie node
    private static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }
}
