package LeetCode_693;

public class Main_LeetCode_693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits2(4));
    }

    static boolean hasAlternatingBits2(int n) {
        n = n ^ (n>>1);
        return (n & n+1) == 0;
    }
}
