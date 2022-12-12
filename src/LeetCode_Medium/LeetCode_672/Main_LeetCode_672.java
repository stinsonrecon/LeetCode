package LeetCode_Medium.LeetCode_672;

//There is a room with n bulbs labeled from 1 to n that all are turned on initially, and four buttons on the wall.
//Each of the four buttons has a different functionality where:
//
//Button 1: Flips the status of all the bulbs.
//Button 2: Flips the status of all the bulbs with even labels (i.e., 2, 4, ...).
//Button 3: Flips the status of all the bulbs with odd labels (i.e., 1, 3, ...).
//Button 4: Flips the status of all the bulbs with a label j = 3k + 1 where k = 0, 1, 2, ... (i.e., 1, 4, 7, 10, ...).
//You must make exactly presses button presses in total. For each press, you may pick any of the four buttons to press.
//
//Given the two integers n and presses, return the number of different possible statuses after performing all presses button presses.

//Ý tưởng:
//Nếu sử dụng nút 1 và nút 2, nó sẽ tương đương với sử dụng nút 3
//Tương tự: 1 + 2 --> 3, 1 + 3 --> 2, 2 + 3 --> 1
//=> Có 8 trường hợp: All_on, 1, 2, 3, 4, 1+4, 2+4, 3+4
//Nhận được tất cả các trường hợp khi n > 2 và presses >= 3.

public class Main_LeetCode_672 {
    public int flipLights(int n, int presses) {
        if (n == 0) return 0;
        if (presses == 0) return 1;
        if (n == 1) return 2;
        if (n == 2 && presses == 1) return 3;
        if (n == 2) return 4;
        if (presses == 1) return 4;
        if (presses == 2) return 7;
        return 8;
    }
}
