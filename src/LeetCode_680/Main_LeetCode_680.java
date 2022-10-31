package LeetCode_680;

//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

public class Main_LeetCode_680 {
    public static void main(String[] args) {
        String test = "abc";
        System.out.println(validPalindrome(test));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
