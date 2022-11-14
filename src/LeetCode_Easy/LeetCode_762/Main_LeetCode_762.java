package LeetCode_Easy.LeetCode_762;

//Given two integers left and right, return the count of numbers in the inclusive range [left, right] having
//a prime number of set bits in their binary representation.
//Recall that the number of set bits an integer has is the number of 1's present when written in binary.
//For example, 21 written in binary is 10101, which has 3 set bits.

//Input: left = 6, right = 10
//Output: 4
//Explanation:
//6  -> 110 (2 set bits, 2 is prime)
//7  -> 111 (3 set bits, 3 is prime)
//8  -> 1000 (1 set bit, 1 is not prime)
//9  -> 1001 (2 set bits, 2 is prime)
//10 -> 1010 (2 set bits, 2 is prime)
//4 numbers have a prime number of set bits.

public class Main_LeetCode_762 {
    public static void main(String[] args) {

    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
