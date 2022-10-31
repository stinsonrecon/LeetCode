package LeetCode_674;

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
