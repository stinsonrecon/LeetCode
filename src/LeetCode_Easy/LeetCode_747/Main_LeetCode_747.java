package LeetCode_Easy.LeetCode_747;

//You are given an integer array nums where the largest integer is unique.
//Determine whether the largest element in the array is at least twice as much as every other number in the array.
//If it is, return the index of the largest element, or return -1 otherwise.

//Input: nums = [3,6,1,0]
//Output: 1
//Explanation: 6 is the largest integer.
//For every other number in the array x, 6 is at least twice as big as x.
//The index of value 6 is 1, so we return 1.

public class Main_LeetCode_747 {
    public static void main(String[] args) {

    }

    public static int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;
        int second = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i] > second) {
                second = nums[i];
            }
        }
        return second * 2 <= max ? index : -1;
    }
}
