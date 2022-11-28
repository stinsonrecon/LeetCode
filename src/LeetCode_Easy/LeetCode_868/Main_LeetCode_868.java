package LeetCode_Easy.LeetCode_868;

//Task:
//Given a positive integer n, find and return the longest distance between any two adjacent 1's
//in the binary representation of n. If there are no two adjacent 1's, return 0.
//Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
//The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.

//Cho số nguyên dương n, tìm và trả về khoảng cách lớn nhất giữa 2 bit 1 liên tiếp. Nếu không có, trả về 0

//Ý tưởng:
//Duyệt 1 lượt qua số nguyên dương N ở dạng nhị phân từ phải sang trái
//khởi tạo d là khoảng cách từ bit 1 cuối cùng
//khởi tạo d là số nhỏ nhất có thể = -32

//Việc chọn d bằng âm của số bit trong một số nguyên hoặc ít hơn (âm hơn) đảm bảo rằng chúng ta vẫn trả về kết quả là 0
//trong trường hợp 10..00 (31 số 0).
//d = -32 có thể cao hơn nhưng trong trường hợp này nó đủ nhỏ để hoạt động với kiểu dữ liệu số nguyên.

public class Main_LeetCode_868 {
    public static void main(String[] args) {
        int n = 22;

        System.out.println(binaryGap(n));
    }

    public static int binaryGap(int N) {
        int res = 0;
        for (int d = -32; N > 0; N /= 2, d++) //N /= 2 để duyệt qua từng bit
            if (N % 2 == 1) {
                res = Math.max(res, d);
                d = 0;
            }
        return res;
    }
}
