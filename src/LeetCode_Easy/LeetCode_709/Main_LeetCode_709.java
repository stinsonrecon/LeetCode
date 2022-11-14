package LeetCode_Easy.LeetCode_709;

//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
public class Main_LeetCode_709 {
    public static void main(String[] args) {
        String test = "HELLO WORLD";

        System.out.println(toLowerCase(test)); // without lib

        System.out.println(test.toLowerCase()); // with lib
    }

    public static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90) // ASCII A = 65 -> Z = 90
            {
                str.append((char)(s.charAt(i)+32)); // ASCII a = 97 -> z = 122
            }
            else
            {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
