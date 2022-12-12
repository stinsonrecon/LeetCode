package LeetCode_Medium.LeetCode_686;

//Given two strings a and b, return the minimum number of times you should repeat string a so that string b
//is a substring of it. If it is impossible for b to be a substring of a after repeating it, return -1.

//Ý tưởng:
//Lặp while cho tới khi độ dài của chuỗi dup A dài hơn chuỗi B, mỗi lần dup A tịnh tiến số đếm lên 1
//Nếu chuỗi dup A chứa B => return count
//Nếu chuỗi dup A dup lần nữa (để kiểm tra trường hợp B là đảo của A) có chứa B => return ++count
//Trả về false nếu k chứa B

public class Main_LeetCode_686 {
    public static void main(String[] args) {
        String a = "a", b = "aa";
        System.out.println(repeatedStringMatch(a,b));
    }

    public static int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B)) {
            return count;
        }
        if(sb.append(A).toString().contains(B)) {
            return ++count;
        }
        return -1;
    }
}
