package LeetCode_Easy.LeetCode_771;

//You're given strings jewels representing the types of stones that are jewels,
//and stones representing the stones you have. Each character in stones is a type of stone you have.
//You want to know how many of the stones you have are also jewels.
//Letters are case sensitive, so "a" is considered a different type of stone from "A".

//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Input: jewels = "z", stones = "ZZ"
//Output: 0

public class Main_LeetCode_771 {
    public static void main(String[] args) {

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char c : stones.toCharArray()){
            if(jewels.indexOf(c)!=-1)count++;
        }
        return count;
    }
}
