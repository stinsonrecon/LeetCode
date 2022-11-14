package LeetCode_Easy.LeetCode_674;

//Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
//The subsequence must be strictly increasing.
//A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l],
//nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
public class Main_LeetCode_674 {
    public static void main(String[] args) {
        int num[] = {1,2,3,5,4,7};

        System.out.println(findLengthOfLCIS(num));
    }

    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int length = 1,temp = 1;
        for(int i = 0; i < nums.length - 1;i++) {
            if(nums[i]<nums[i + 1])
            {
                temp++;
                length=Math.max(length,temp);
            }
            else {
                temp = 1;
            }
        }
        return length;
    }
}
