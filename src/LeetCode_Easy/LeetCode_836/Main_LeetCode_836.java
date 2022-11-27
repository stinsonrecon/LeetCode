package LeetCode_Easy.LeetCode_836;

//Task:
//An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner,
//and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.
//Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.
//Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.

//Hình chữ nhật căn chỉnh theo trục được biểu diễn dưới dạng danh sách [x1, y1, x2, y2], trong đó (x1, y1) là tọa độ của
//góc dưới bên trái và (x2, y2) là tọa độ của góc trên bên phải. Các cạnh trên và dưới của nó song song với trục X và các cạnh trái và phải của nó song song với trục Y.
//Hai hình chữ nhật chồng lên nhau nếu diện tích giao nhau của chúng là dương. Để rõ ràng, hai hình chữ nhật chỉ chạm nhau ở góc hoặc cạnh không trùng nhau.
//Cho hai hình chữ nhật được căn chỉnh theo trục rec1 và rec2, trả về true nếu chúng trùng nhau, nếu không trả về false.

//Ý tưởng:
//Cho 2 đoạn thẳng (left1, right1), (left2, right2)
//If these two intervals overlap, it should exist an number x, Nếu 2 đoạn thẳng trùng nhau, tồn tại 1 số x sao cho:
//
//left1 < x < right1 && left2 < x < right2
//
//left1 < x < right2 && left2 < x < right1
//
//left1 < right2 && left2 < right1
//
//Đây là điều kiện cần và đủ để hai đoạn trùng nhau.
// => Nếu hai hình chữ nhật trùng nhau trên cả x và y, chúng trùng nhau trong mặt phẳng.

public class Main_LeetCode_836 {
    public static void main(String[] args) {
        int[] rec1 = {0,0,2,2}, rec2 = {1,1,3,3};

        System.out.println(isRectangleOverlap(rec1, rec2));
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
}
