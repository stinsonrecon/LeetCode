package LeetCode_Easy.LeetCode_796;

//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//A shift on s consists of moving the leftmost character of s to the rightmost position.
//For example, if s = "abcde", then it will be "bcdea" after one shift.

//Input: s = "abcde", goal = "cdeab"
//Output: true
//Input: s = "abcde", goal = "abced"
//Output: false

public class Main_LeetCode_796 {
    public static void main(String[] args) {
        String a = "abcde";

        String goal = "cdeab";

        System.out.println(rotateString(a, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        String res = s+s;
        return res.contains(goal);
    }
}
