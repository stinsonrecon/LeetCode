package LeetCode_Easy.LeetCode_717;

//We have two special characters:
//The first character can be represented by one bit 0.
//The second character can be represented by two bits (10 or 11).
//Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

//Input: bits = [1,0,0]
//Output: true
//Explanation: The only way to decode it is two-bit character and one-bit character.
//So the last character is one-bit character.

public class Main_LeetCode_717 {
    public static void main(String[] args) {

    }

    public static boolean isOneBitCharacter(int[] bits) {
        int ones = 0;

        for(int i = bits.length - 2; i >= 0 && bits[i] != 0; i--) {
            ones++;
        }
        if(ones % 2 > 0) {
            return false;
        }
        return true;
    }
}
