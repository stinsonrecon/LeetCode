package LeetCode_Easy.LeetCode_844;

//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//
//Note that after backspacing an empty text, the text will continue empty.

//Cho 2 chuỗi s và t, trả về true nếu 2 chuỗi bằng nhau. '#' có nghĩa là xóa

//Ý tưởng:
//Duyệt chuỗi từ dưới lên, nếu có dấu '#' thì update count++. Nếu không thì check count: Nếu count > 0 thì update count--, còn không thì append chữ cái vào chuỗi trả về
public class Main_LeetCode_844 {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }

    public static String getString(String str) {
        int n = str.length();
        int count = 0;
        String result = "";
        for(int i = n - 1; i >= 0; i --) {
            char ch = str.charAt(i);
            if(ch == '#') {
                count ++;
            }
            else {
                if(count > 0) {
                    count --;
                }
                else {
                    result += ch;
                }
            }
        }
        return result;
    }
}
