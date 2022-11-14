package LeetCode_Easy.LeetCode_804;

//International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
//
//'a' maps to ".-",
//'b' maps to "-...",
//'c' maps to "-.-.", and so on.
//Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

//For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
//We will call such a concatenation the transformation of a word.
//Return the number of different transformations among all words we have.

//Input: words = ["gin","zen","gig","msg"]
//Output: 2
//Explanation: The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//There are 2 different transformations: "--...-." and "--...--.".

import java.util.HashSet;

public class Main_LeetCode_804 {
    public static void main(String[] args) {

    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); ++i) {
                sb.append(d[w.charAt(i) - 'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}
