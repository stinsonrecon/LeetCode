package LeetCode_Easy.LeetCode_860;

//Task:
//At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills).
//Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
//You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
//Note that you do not have any change in hand at first.
//Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

//Mỗi cốc 5$, khách hàng mua từng cốc 1 theo hàng chờ, mỗi người mua 1 cốc và trả tiền theo mệnh giá 5,10,20
//Trả tiền thừa cho khách, chương trình trả về true nếu có thể trả tiền đúng cho khách hàng
//Bắt đầu với 0$

//Ý tưởng:
//Đến số tiền 5 và 10$ đang có
//if (customer pays with $5) five++;
//if (customer pays with $10) ten++, five--;
//if (customer pays with $20) ten--, five-- or five -= 3;
//Check if five is positive, otherwise return false.

public class Main_LeetCode_860 {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};

        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five++;
            }
            else if (i == 10)
            {
                five--;
                ten++;
            }
            else if (ten > 0)
            {
                ten--;
                five--;
            }
            else {
                five -= 3;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
