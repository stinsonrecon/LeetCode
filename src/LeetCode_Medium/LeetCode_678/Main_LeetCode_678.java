package LeetCode_Medium.LeetCode_678;

//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//
//The following rules define a valid string:
//
//Any left parenthesis '(' must have a corresponding right parenthesis ')'.
//Any right parenthesis ')' must have a corresponding left parenthesis '('.
//Left parenthesis '(' must go before the corresponding right parenthesis ')'.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

//Ý tưởng:
//Đặt 2 biến đếm số min và max của ngoặc trái
//Duyệt chuỗi từ trái qua phải
//Nếu gặp ngoặc trái (c =='(') => lo++ nếu không => lo--
//Nếu gặp ngoặc trái (c != ')') => hi++ nếu không => hi--
//Nếu hi < 0 => return false
//Kiểm tra xem còn ngoặc trái mở không

public class Main_LeetCode_678 {
    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        int leftParans = 0;
        int stars = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                leftParans++;
            }
            else if(c == ')') {
                if(leftParans > 0) {
                    leftParans--;
                }
                else if(stars > 0) {
                    stars--;
                }
                else {
                    return false;
                }
            } else {
                stars++;
                if(leftParans > 0) {
                    leftParans--;
                    stars++;
                }
            }
        }
        return leftParans == 0;
    }
}
