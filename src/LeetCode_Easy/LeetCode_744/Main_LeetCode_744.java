package LeetCode_Easy.LeetCode_744;

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
//There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.

//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

import java.util.ArrayList;
import java.util.List;

public class Main_LeetCode_744 {
    public static void main(String[] args) {
        String option = "vOiCe,sms,internet,osa,adj";
        String condition = "voice";
        boolean check = option.toLowerCase().contains(condition);
        System.out.println(check);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for(char c : letters) {
            if(c - 'a' > target - 'a') {
                return c;
            }
        }
        return letters[0];
    }
}
