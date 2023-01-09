package LeetCode_Medium.LeetCode_650;

//There is only one character 'A' on the screen of a notepad. You can perform one of two operations on this notepad for each step:
//- Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
//- Paste: You can paste the characters which are copied last time.
// Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.


public class Main_LeetCode_650 {
    public static void main(String[] args) {
        System.out.println("Min step: " + minSteps(11));
    }

    static int minSteps(int n) {
        int res = 0;
        for(int i = 2; i <= n; i++) { // hành động tối thiểu để làm bào gồm 2 bước: copy + paste
            while (n % i == 0) { // Tìm số bé nhất mà n chia hết
                res += i; // Số bước bé nhất để thực hiện hành động
                n = n/i;
            }
        }
        return res;
    }
}
