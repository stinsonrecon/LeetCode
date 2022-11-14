package LeetCode_Easy.LeetCode_728;

//A self-dividing number is a number that is divisible by every digit it contains.
//For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//A self-dividing number is not allowed to contain the digit zero.
//Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

//Input: left = 1, right = 22
//Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

import java.util.ArrayList;
import java.util.List;

public class Main_LeetCode_728 {
    public static void main(String[] args) {

    }

    public static List<Integer> selfDividing(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for(int i = left, n = 0; i <= right; i++) {
            if(dividingNumber(i)) {
                res.add(i);
            }
        }
        return res;
    }

    static boolean dividingNumber(int num) {
        for(int n = num; n > 0; n /= 10)
        {
            if(n % 10 == 0 || num % (n % 10) != 0) {
                return false;
            }
        }
        return true;
    }
}
