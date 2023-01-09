package LeetCode_Medium.LeetCode_714;

//You are given an array prices where prices[i] is the price of a given stock on the ith day,
// and an integer fee representing a transaction fee.
//Find the maximum profit you can achieve. You may complete as many transactions as you like,
//but you need to pay the transaction fee for each transaction.
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

//Cho chuỗi giá tiền, trong đó prices[i] là giá 1 cố phiếu nhất định vào ngày thứ i và một số nguyên k biểu thị phí giao dịch
//Tìm lợi nhuận tối đa có thể đạt được (không được thực hiện nhiều giao dịch đồng thời (bán trước khi có thể mua tiếp)

//Ý tưởng:
//buy: khi giá hiện tại cao hơn điểm thấp nhất trc đó nhiều hơn số phí giao dịch; đặt giá hiện lại là điểm cao nhất
//sale: khi giá hiện tại thấp hơn điểm cao nhất trước đó nhiều hơn số tiền phí giao dịch; đặt lại mức thấp nhất cao nhất
//cập nhật cao nhất: chỉ khi điểm cao nhất được đặt
//cập nhật điểm thấp nhất: sau mỗi ngày giao dịch

public class Main_LeetCode_714 {
    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;

        System.out.println(maxProfit(prices,fee));
    }

    public static int maxProfit(int[] prices, int fee) {
        int profit = 0;
        Integer lo = null, hi = null, n = prices.length;
        for (int i = 0; i < n; i++) {
            if (lo != null && hi == null && prices[i] - lo > fee) hi = prices[i]; // buy in
            if (hi != null && prices[i] > hi) hi = prices[i]; // update highest
            if (hi != null && (hi - prices[i] > fee || i == n - 1)) { // sale out
                profit += hi - lo - fee;
                hi = null;
                lo = null;
            }

            lo = lo != null ? Math.min(lo, prices[i]) : prices[i]; // update lowest
        }
        return profit;
    }
}
