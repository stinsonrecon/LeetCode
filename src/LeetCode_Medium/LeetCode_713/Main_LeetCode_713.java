package LeetCode_Medium.LeetCode_713;

//Given an array of integers nums and an integer k,
//return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k

//Cho chuỗi số nguyên và số nguyên k
//Trả về mảng con liên tiếp mà tích các phần tử không lớn hơn số nguyên k

//Ý tưởng
//Luôn giữ tích các phần tử nhỏ hơn k
//Mỗi lần dịch index bằng cách chèn 1 số mời vào bên phải (j), nếu tích lớn hơn k, giảm các số ở bên trái (i) cho đến
//khi tích của mảng con còn lại nhỏ hơn k (có thể trống)
//Mỗi bước nhảy tạo thêm 1 chuỗi con mới, với x là độ dài của mảng hiện tại (j + 1 -i)
//VD : chuỗi {1,2,3} sau khi thêm {4} ta được các chuỗi con: {1,2,3,4}, {2,3,4}, {3,4}, {4}. Nếu loại bỏ phần tử 1, chuỗi
//con còn lại : {2,3,4}, {3,4}, {4}

public class Main_LeetCode_713 {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;

        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int cnt = 0;
        int pro = 1;
        for (int i = 0, j = 0; j < nums.length; j++) {
            pro *= nums[j];
            while (i <= j && pro >= k) {
                pro /= nums[i++];
            }
            cnt += j - i + 1;
        }
        return cnt;
    }
}
