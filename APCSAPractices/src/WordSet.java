import java.util.HashSet;
import java.util.Set;

public class WordSet {

    private Set<String> WordSet;

    /** Constructor initializes set to empty. */
    public WordSet() {
        WordSet = new HashSet<>(); 
    }

    /** @return the number of words in set */
    public int size() {
        /* implementation not shown */ }

    /** Adds word to set (no duplicates).
    * @param word the word to be added
    */
    public void insert(String word) {
        /* implementation not shown */ }

    /** Removes word from set if present, else does nothing.
    * @param word the word to be removed
    */
    public void remove(String word) {
        /* implementation not shown */ }

    /** Returns kth word in alphabetical order, where 1 <= k <= size().
    * @param k position of word to be returned
    * @return the kth word
    */
    public String findkth(int k) {
        /* implementation not shown */ }

    /** @return true if set contains word, false otherwise */
    public boolean contains(String word) {
        /* implementation not shown */ }

    /** @param s the current WordSet
    * @return the number of words in s that begin with "A"
    */
    public static int countA(WordSet s) {
        int numA = 0;
        for (String item : s) {
            if (item.charAt(0) == ('A')) {
                numA ++;
            }
        return numA;
        }
    }

    /** @param s the current WordSet
    * Postcondition: WordSet s contains no words that begin with
    * "A", but is otherwise unchanged.
    */
    public static void removeA(WordSet s){
        for (String item : s) {
            if (item.charAt(0) == ('A')) {
                s.remove(item);    
            }
        }
    }

// Need to do c (page: 430)

//Other instance variables, constructors, and methods are not shown.

}