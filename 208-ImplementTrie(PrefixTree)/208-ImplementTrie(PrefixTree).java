// Last updated: 07/01/2026, 01:24:25
class Trie {
    Trie [] children;
    boolean isEndOfWord ;
    public Trie() {
        children = new Trie[26];
        isEndOfWord = false;
    }
    
    public void insert(String word) {
        Trie head = this;
        for(char c : word.toCharArray()) {
            if(head.children[c - 'a'] == null) {
                // new node creation
                Trie newNode = new Trie();
                head.children[c - 'a'] = newNode;
                // head.isEndOfWord = false;
            } 
            head = head.children[c - 'a'];
        }
        head.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchUtil(word, false);
    }
    
    public boolean startsWith(String prefix) {
        return searchUtil(prefix, true);
    }

    public boolean searchUtil(String word, boolean isPrefixSearch) {
        Trie head = this;
        for(char c : word.toCharArray()) {
            if(head.children[c - 'a'] == null) {
                return false;
            } 
            // if (head.isEndOfWord) return false;
            head = head.children[c - 'a'];
        }
        return isPrefixSearch ? true : head.isEndOfWord;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */