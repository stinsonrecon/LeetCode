package LeetCode_Medium.LeetCode_712;

//Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

//Cho 2 string s1 và s2, trả về tổng ASCII thất nhất có thể sau khi xóa các ký tự để 2 chuỗi s1 và s2 bằng nhau

//Ý tưởng:
//Cho s1 và s2 là 2 chuỗi ký tự với chỉ mục
//Nếu chuỗi s1 hoặc s2 rỗng, xóa toàn bộ chuỗi còn lại
//=> nếu 1 trong 2 chuỗi rỗng, tổng ASCII trả về là tổng các ký tự của chuỗi còn lại
//Rule 1: dp[i][j] =
//sum_ascii(s2) -> if i==0
//sum_ascii(s1) -> if j==0

//Nếu ký tự cuối cùng của 2 chuỗi giống nhau, tổng cuối trả về là các ký tự còn lại
//VD: Answer("zca","bza") = Answer("zc","bz")
//Rule 2: dp[i][j] =
//dp[i-1][j-1] -> if s1[i]==s2[j]

//Nếu ký tự cuối khác nhau, rơi vào 1 trong 3 trường hợp sau:
//Xóa ký tự cuối cùng của s1 (ASCII(s1's last) + dp[i-1][j])
//Xóa ký tự cuối cùng của s2 (ASCII(s2's last) + dp[i][j-1])
//Xóa ký tự cuối cùng của cả 2 chuỗi (ASCII(s1's last) + ASCII(s2's last) + dp[i-1[[j-1])
//Rule 3:dp[i][j] =
//Min((ASCII(s1's last) + dp[i-1][j]),(ASCII(s2's last) + dp[i][j-1]),(ASCII(s1's last) + ASCII(s2's last) + dp[i-1[[j-1]))


public class Main_LeetCode_712 {
    public static void main(String[] args) {
        String s1 = "sea", s2 = "eat";

        System.out.println(minimumDeleteSum(s1,s2));
    }

    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        // Initialization of first row and first col
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }
        // dp
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }
        return dp[m][n];
    }
}
